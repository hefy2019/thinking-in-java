package com.hfy._02_handle;

//ʹ��try-catch���񵥸��쳣
public class SingleCatchDemo {
	public static void main(String[] args) {
		System.out.println("begin...");
		try {
			int ret = 10 / 0;
			System.out.println("���=" + ret);
		} catch (ArithmeticException e) {//���������쳣
			System.out.println("�쳣��Ϣ" + e.getMessage());//��ȡ�쳣��Ϣ,�쳣��ԭ��
			System.out.println(e);//��ӡ���󼴴�ӡ���� toString() 
			System.out.println(e.toString());
			System.out.println("���쳣��...");
			e.printStackTrace();//��ӡ�쳣�ĸ���ջ��Ϣ ,  �������Խ׶�ʹ��
		}
		System.out.println("end...");
	}
}
