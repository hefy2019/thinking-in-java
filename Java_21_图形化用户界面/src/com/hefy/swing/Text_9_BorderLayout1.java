package com.hefy.swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import static net.mindview.util.SwingConsole.run;
/**
 * @author hefy:
 * @date 2019年7月13日 下午12:30:05
 * @version 1.0 类说明	控制布局
 */
public class Text_9_BorderLayout1 extends JFrame {
	public Text_9_BorderLayout1() {
		add(BorderLayout.NORTH,new JButton("North"));//顶端
		add(BorderLayout.SOUTH,new JButton("South"));//地段
		add(BorderLayout.EAST,new JButton("East"));//右端
		add(BorderLayout.WEST,new JButton("West"));//左端
		add(BorderLayout.CENTER,new JButton("Eenter"));//从中央开始填充，直到与其他组件或边框相遇
	}
	public static void main(String[] args) {
		run(new Text_9_BorderLayout1(),300,250);
	}
}
