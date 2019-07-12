package com.hefy.swing;

import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
* @author hefy:
* @date 2019��7��12�� ����10:40:27
* @version 1.0
* ��˵��		ǡ���ĳ�������Ӧ��������������Test_3, Test_1���ܻᷢ����ͻ��������Test_2���д��붼��ѭͨ��SwingUtilities.invokeLater()�ύ������ʽ��
*/
public class Test_3_SubmitSwingProgram extends JFrame{
	JLabel label;
	public Test_3_SubmitSwingProgram() {
		super(" Hello Swing");
		label = new JLabel("A Label");
		add(label);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setSize(300, 100);
		setVisible(true);
	}
	static Test_3_SubmitSwingProgram ssp;
	public static void main(String[] args) throws InterruptedException {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ssp = new Test_3_SubmitSwingProgram();
			}
		});
		TimeUnit.SECONDS.sleep(1);//
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ssp.label.setText("Hey! pangzi!");
			}
		});
	}
}
