package com.hfy._05_exception_class;

//ҵ���߼��쳣
public class LogicException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public LogicException() {
		super();
	}

	/**
		@param message	��ʾ��ǰ�쳣��ԭ��/��Ϣ
		@param cause	��ǰ�쳣�ĸ���ԭ��
	 */
	public LogicException(String message) {
		super(message);
	}

	public LogicException(String message, Throwable cause) {
		super(message, cause);
	}
}
