package hw4;

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Hw5 extends JFrame implements ActionListener {

	JLabel label_y, label_m, label_d, label_out, label;
	JTextField text_y, text_m, text_d;
	JButton button;


	public Hw5() {

		Container c = getContentPane();
		c.setLayout(new GridLayout(5, 2));

		label_out = new JLabel("請輸入年月日:");
		label = new JLabel(" ");
		label_y = new JLabel("年 : ");
		text_y = new JTextField(5);
		label_m = new JLabel("月 : ");
		text_m = new JTextField(5);
		label_d = new JLabel("日 : ");
		text_d = new JTextField(5);
		button = new JButton("提交");

		button.addActionListener(this);

		c.add(label_out);
		c.add(label);
		c.add(label_y);
		c.add(text_y);
		c.add(label_m);
		c.add(text_m);
		c.add(label_d);
		c.add(text_d);
		c.add(button);
	}

	public static void main(String[] args) {

		Hw5 frm = new Hw5();
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frm.setTitle("天數計算器");
		frm.setBounds(150, 150, 300, 250);
		frm.setVisible(true);
	}

	// 確定輸入值
	boolean checkDay(int[] arr, int m, int d) {
		if (m < 0 || m > 12) {
			return false;
		} else {
			if (d < 0 || d > arr[m - 1]) {
				return false;
			} else {
				return true;
			}
		}
	}

	// 計算天數
	int count(int[] arr, int m, int d) {

		for (int i = 0; i < m - 1; i++) {
			d += arr[i];
		}
		return d;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		int year, month, date;
		int[] normalYear = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[] leapYear = Arrays.copyOf(normalYear, normalYear.length);
		leapYear[1]=29;

		if (e.getSource() == button) {

			year = Integer.parseInt(text_y.getText());
			month = Integer.parseInt(text_m.getText());
			date = Integer.parseInt(text_d.getText());

			if (year % 400 == 0) {
				// leap year
				if (checkDay(leapYear, month, date))
					label_out.setText("輸入日期為該年第 " + count(leapYear, month, date) + " 天");
				else
					label_out.setText("輸入錯誤");

			} else if (year % 100 != 0 & year % 4 == 0) {
				// leap year
				if (checkDay(leapYear, month, date))
					label_out.setText("輸入日期為該年第 " + count(leapYear, month, date) + " 天");
				else
					label_out.setText("輸入錯誤");
			} else {
				// normal year
				if (checkDay(normalYear, month, date))
					label_out.setText("輸入日期為該年第 " + count(leapYear, month, date) + " 天");
				else
					label_out.setText("輸入錯誤");
			}

			text_y.setText("");
			text_m.setText("");
			text_d.setText("");
		}

	}

}
