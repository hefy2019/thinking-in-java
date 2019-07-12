package com.hefy.swing;

import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
* @author hefy:
* @date 2019年7月12日 上午10:24:13
* @version 1.0
* 类说明 通过Swing时间分发线程提交要执行的任务。
*/
public class Test_2_SubmitLabelManipulationTask {
	public static void main(String[] args) throws Exception  {
		JFrame frame = new JFrame("Hello Swing");
		final JLabel label = new JLabel("A Lable");
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setSize(300, 100);
		frame.setVisible(true);
		TimeUnit.SECONDS.sleep(5);//5秒之后，文本发生变化
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				label.setText("Hey! pangzi!");
			}
		});
	}
}
