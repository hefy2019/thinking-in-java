package com.hefy.swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import static net.mindview.util.SwingConsole.run;
/**
 * @author hefy:
 * @date 2019��7��13�� ����12:30:05
 * @version 1.0 ��˵��	���Ʋ���
 */
public class Text_9_BorderLayout1 extends JFrame {
	public Text_9_BorderLayout1() {
		add(BorderLayout.NORTH,new JButton("North"));//����
		add(BorderLayout.SOUTH,new JButton("South"));//�ض�
		add(BorderLayout.EAST,new JButton("East"));//�Ҷ�
		add(BorderLayout.WEST,new JButton("West"));//���
		add(BorderLayout.CENTER,new JButton("Eenter"));//�����뿪ʼ��䣬ֱ�������������߿�����
	}
	public static void main(String[] args) {
		run(new Text_9_BorderLayout1(),300,250);
	}
}
