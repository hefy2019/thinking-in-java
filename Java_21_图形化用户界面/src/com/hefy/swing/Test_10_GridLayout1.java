package com.hefy.swing;

import static net.mindview.util.SwingConsole.run;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author hefy:
 * @date 2019年7月13日 下午12:47:36
 * @version 1.0 类说明	Swing GridLayout 构建一个放置组件的表格 并按从左到右，上到下的顺序加入。
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
