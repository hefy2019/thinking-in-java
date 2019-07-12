package com.hefy.swing;

import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
* @author hefy:
* @date 2019年7月12日 上午10:40:27
* @version 1.0
* 类说明		恰当的程序看起来应该是下面这样的Test_3, Test_1可能会发生冲突和死锁，Test_2所有代码都遵循通过SwingUtilities.invokeLater()提交操作方式。
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
