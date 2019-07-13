package com.hefy.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField; //支持输入文本

/**
 * @author hefy:
 * @date 2019年7月13日 上午11:13:51
 * @version 1.0 类说明	捕获事件
 */
public class Test_6_Button2 extends JFrame {
	private JButton b1 = new JButton("Button 1"), b2 = new JButton("Button 2");
	private JTextField txt = new JTextField(10);

	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String name = ((JButton) e.getSource()).getText();
			txt.setText(name);
		}
	}

	private ButtonListener bl = new ButtonListener();

	public Test_6_Button2() {
		b1.addActionListener(bl);
		b2.addActionListener(bl);
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(txt);
	}

	public static void main(String[] args) {
		run(new Test_5_Button1(), 200, 100);
	}

	private static void run(Test_5_Button1 test_5_Button1, int i, int j) {
		// TODO Auto-generated method stub
		//这里的创建是存在问题的
	}
}
