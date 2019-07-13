package com.hefy.swing;

import static net.mindview.util.SwingConsole.run;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author hefy:
 * @date 2019��7��13�� ����12:38:37
 * @version 1.0 ��˵��	�Ȳ��ֹ���������ΪFlowLayout��Ȼ���ٴ����Ϸ��ð�ťJButton���������"����"�Ĵ�С����ǩ�Ĵ�С��
 */
public class Test_10_FlowLayout1 extends JFrame {
	public Test_10_FlowLayout1() {
		setLayout(new FlowLayout());
		for (int i = 0; i < 20; i++) {
			add(new JButton("Button" + i));
		}
	}

	public static void main(String[] args) {
		run(new Test_10_FlowLayout1(), 300, 300);
	}
}
