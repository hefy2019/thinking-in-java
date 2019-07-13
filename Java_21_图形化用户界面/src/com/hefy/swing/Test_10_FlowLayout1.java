package com.hefy.swing;

import static net.mindview.util.SwingConsole.run;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author hefy:
 * @date 2019年7月13日 下午12:38:37
 * @version 1.0 类说明	先布局管理器设置为FlowLayout，然后再窗体上放置按钮JButton。组件呈现"合适"的大小，标签的大小。
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
