package com.hefy.swing;

import java.util.concurrent.TimeUnit;

import javax.swing.*;

/**
* @author hefy:
* @date 2019��7��12�� ����10:01:32
* @version 1.0
* ��˵��
*/
//setDefaultCloseOperation()����JFrame���û�ִ�йرղ���ʱӦ����ʲô��EXIT_ON_CLOSE����������Ҫ�˳��������û��������ã�Ĭ�ϵ���Ϊ��ʲôҲ��������
//���Ӧ�ý�Ҳ����رա�setSize()������Ϊ��λ������ͼ���ĳߴ硣�����ִ�����һ�У���Ļ�Ͻ�ʲôҲ��������
/*public class Test_1_HelloSwing {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello Swing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setSize(300, 100);
		frame.setVisible(true);
	}
}*/
//ֱ�Ӷ�GUI�����д������ܻᷢ����ͻ��������
public class Test_1_HelloSwing {
	public static void main(String[] args) throws Exception  {
		JFrame frame = new JFrame("Hello Swing");
		JLabel label = new JLabel("A Lable");
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setSize(300, 100);
		frame.setVisible(true);
		TimeUnit.SECONDS.sleep(5);//5��֮���ı������仯
		label.setText("Hey! pangzi!");
	}
}
