package com.hfy._05_exception_class;

public class RegisterDemo {
	//ģ�����ݿ����Ѿ����ڵ��˺�
	private static String[] names = { "will", "lucy", "lily" };

	public static void main(String[] args) {
		try {
			checkUsername("will");
			System.out.println("ע��ɹ�");
		} catch (LogicException e) {
			String errorMsg = e.getMessage();
			System.out.println("���û���:"+errorMsg);
		}
	}

	//�жϵ�ǰע���˺��Ƿ����
	public static boolean checkUsername(String username) {
		for (String name : names) {
			if (name.equals(username)) {
				throw new LogicException("��"+name+",�Ѿ���ע����");
			}
		}
		return true;
	}
}
