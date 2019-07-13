package com.hefy.swing;

import java.awt.*;
import javax.swing.*;

/**
 * @author hefy:
 * @date 2019年7月13日 上午10:55:11
 * @version 1.0 类说明 创建按钮
 */
public class Test_5_Button1 extends JFrame {
	private JButton b1 = new JButton("Button 1"), b2 = new JButton("Button 2");

	public Test_5_Button1() {
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
	}

	public static void main(String[] args) {
		run(new Test_5_Button1(), 200, 100);
	}

	private static void run(Test_5_Button1 test_5_Button1, int i, int j) {
		// TODO Auto-generated method stub
		//这里的创建是存在问题的
	}
}
