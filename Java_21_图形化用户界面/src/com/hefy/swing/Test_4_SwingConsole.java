package com.hefy.swing;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
* @author hefy:
* @date 2019年7月12日 上午10:54:34
* @version 1.0
* 类说明 工具，放到net.mindview.util类库中，想要使用它必须位于一个JFrame中。静态的run()方法可以将视窗的标题设置为类的简单名。
*/
public class Test_4_SwingConsole {
	public static void run(final JFrame f,final int width,final int height) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				f.setTitle(f.getClass().getSimpleName());
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.setSize(width, height);
				f.setVisible(true);
			}
		});
	}
}
