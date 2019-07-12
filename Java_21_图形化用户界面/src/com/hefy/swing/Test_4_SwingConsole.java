package com.hefy.swing;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
* @author hefy:
* @date 2019��7��12�� ����10:54:34
* @version 1.0
* ��˵�� ���ߣ��ŵ�net.mindview.util����У���Ҫʹ��������λ��һ��JFrame�С���̬��run()�������Խ��Ӵ��ı�������Ϊ��ļ�����
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
