package com.hfy._05_exception_class;

//业务逻辑异常
public class LogicException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public LogicException() {
		super();
	}

	/**
		@param message	表示当前异常的原因/信息
		@param cause	当前异常的根本原因
	 */
	public LogicException(String message) {
		super(message);
	}

	public LogicException(String message, Throwable cause) {
		super(message, cause);
	}
}
