package com.hefy.swing;

import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
* @author hefy:
* @date 2019��7��12�� ����10:24:13
* @version 1.0
* ��˵�� ͨ��Swingʱ��ַ��߳��ύҪִ�е�����
*/
public class Test_2_SubmitLabelManipulationTask {
	public static void main(String[] args) throws Exception  {
		JFrame frame = new JFrame("Hello Swing");
		final JLabel label = new JLabel("A Lable");
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setSize(300, 100);
		frame.setVisible(true);
		TimeUnit.SECONDS.sleep(5);//5��֮���ı������仯
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				label.setText("Hey! pangzi!");
			}
		});
	}
}
