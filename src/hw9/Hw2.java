package hw9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.*;

public class Hw2 {

	private static Account acc = new Account();

	private static class Account {

		private int balance = 0;
		private final Lock lock = new ReentrantLock();
		private final Condition dep = lock.newCondition();
		private final Condition with = lock.newCondition();

		public void deposit() {
			lock.lock();
			try {

				while (balance > 3000) {
					System.out.println("媽媽看到餘額在3000以上，暫停匯款");
					System.out.println("熊大被老媽告知帳戶已經有錢!");

					try {
						dep.await();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				balance += 2000;
				System.out.println("媽媽存了2000，帳戶共有: " + balance);

				if (balance > 3000) {
					with.signal();
				}

			} finally {
				lock.unlock();
			}
		}

		public void withdraw() {
			lock.lock();
			try {
				while (balance < 1000) {
					System.out.println("熊大看到帳戶沒錢，暫停提款");
					System.out.println("媽媽被熊大要求匯款!");

					try {
						with.await();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				balance -= 1000;
				System.out.println("熊大領了1000，帳戶共有" + balance);

				if (balance <= 2000) {
					System.out.println("熊大看到餘額在2000以下，要求匯款");
				}

				if (balance < 1000) {
					dep.signal();

				}

			} finally {
				lock.unlock();
			}
		}

	}

	private static class Mom implements Runnable {

		@Override
		public void run() {
			for (int i = 1; i <= 10; i++)
				acc.deposit();

		}

	}

	private static class Son implements Runnable {

		@Override
		public void run() {
			for (int i = 1; i <= 10; i++)
				acc.withdraw();

		}

	}

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(2);

		executorService.execute(new Mom());
		executorService.execute(new Son());

		executorService.shutdown();

	}

}
