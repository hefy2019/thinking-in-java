package com.hefy.swing;

import java.awt.*;
import javax.swing.*;
import static net.mindview.util.SwingConsole.*;
/**
 * @author hefy:
 * @date 2019��7��13�� ����10:55:11
 * @version 1.0 ��˵�� ������ť
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
}
