package com.hfy._02_handle;

//ʹ��try-catch�������쳣:
public class MultiCatchDemo {
	public static void main(String[] args) {
		System.out.println("begin...");
		String sNum1 = "10";//�û����뱻����
		String sNum2 = "0";//�û��������   
		try {
			//��Stringת��Ϊint����
			int num1 = Integer.parseInt(sNum1);
			int num2 = Integer.parseInt(sNum2);
			//���������ദ
			int ret = num1 / num2;
			System.out.println("���=" + ret);
		} catch (ArithmeticException e) {
			//System.out.println(e.getMessage()); ���ش� throwable ����ϸ��Ϣ�ַ���
			e.printStackTrace();
		} catch (NumberFormatException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			//�������������쳣����ô˴�
			e.printStackTrace();
		}
		System.out.println("end...");
	}
}
