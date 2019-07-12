package com.hefy.swing;

import java.util.concurrent.TimeUnit;

import javax.swing.*;

/**
* @author hefy:
* @date 2019年7月12日 上午10:01:32
* @version 1.0
* 类说明
*/
//setDefaultCloseOperation()告诉JFrame当用户执行关闭操作时应该做什么。EXIT_ON_CLOSE常量告诉它要退出程序。如果没有这个调用，默认的行为是什么也不会做，
//因此应用将也不会关闭。setSize()以像素为单位设置视图窗的尺寸。如果不执行最后一行，屏幕上将什么也看不见。
/*public class Test_1_HelloSwing {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello Swing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setSize(300, 100);
		frame.setVisible(true);
	}
}*/
//直接对GUI组件编写代码可能会发生冲突和死锁。
public class Test_1_HelloSwing {
	public static void main(String[] args) throws Exception  {
		JFrame frame = new JFrame("Hello Swing");
		JLabel label = new JLabel("A Lable");
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setSize(300, 100);
		frame.setVisible(true);
		TimeUnit.SECONDS.sleep(5);//5秒之后，文本发生变化
		label.setText("Hey! pangzi!");
	}
}
