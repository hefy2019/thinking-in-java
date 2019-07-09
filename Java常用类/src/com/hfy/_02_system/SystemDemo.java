package com.hfy._02_system;

import java.util.Arrays;

public class SystemDemo {
	protected void finalize() throws Throwable{
		super.finalize();
		System.out.println("�ұ�������...");
	}
	
	public static void main(String[] args) {
		//���鿽������
		//static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
		int[] src = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] dest = new int[10];
		System.out.println(Arrays.toString(dest));//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		System.arraycopy(src, 2, dest, 4, 3);
		System.out.println(Arrays.toString(dest));//[0, 0, 0, 0, 3, 4, 5, 0, 0, 0]
		//static long currentTimeMillis()  	�����Ժ���Ϊ��λ�ĵ�ǰʱ�䡣
		long timeMillis = System.currentTimeMillis();//����ĳһ�����������ʱ��
		System.out.println(timeMillis);//1508891953663
		//static void exit(int status) ��ֹ��ǰ�������е� Java ������� �� 0 ��״̬���ʾ�쳣��ֹ��
		System.exit(0);//Դ����ײ�  Runtime.getRuntime().exit(status);
		//System.out.println("ending...");
		//static void gc()	 ���������������� 
		new SystemDemo();
		new SystemDemo();
		new SystemDemo();
		System.gc();
		System.out.println("ending...");
	}
}
