package com.hefy.swing;

import static net.mindview.util.SwingConsole.run;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author hefy:
 * @date 2019��7��13�� ����12:47:36
 * @version 1.0 ��˵��	Swing GridLayout ����һ����������ı�� ���������ң��ϵ��µ�˳����롣
 */
public class Test_10_GridLayout1 extends JFrame {
	public Test_10_GridLayout1() {
		setLayout(new GridLayout(7, 3));
		for (int i = 0; i < 20; i++)
			add(new JButton("Button" + i));
	}
	public static void main(String[] args) {
		run(new Test_10_GridLayout1(), 200, 100);
	}
}
