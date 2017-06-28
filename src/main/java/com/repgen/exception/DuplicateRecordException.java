package com.repgen.exception;

public class DuplicateRecordException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String errCode;
	private String errMsg;

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public DuplicateRecordException(String errCode, String errMsg) {
		this.errCode = errCode;
		this.errMsg = errMsg;
	}

}