package com.shinesun.common.entity;

/**
 * 公共返回类
 * @title
 * @author 胡永持
 * @date 2020/3/22 9:04
 */
public class ReturnResult {

	private boolean success;	// 是否成功
	private int code;			//代码
	private String message;		//描述
	private Object data;		//额外数据

	public ReturnResult() { }

	public ReturnResult(String message) {
		this.message = message;
	}

    public ReturnResult(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public ReturnResult(boolean success, int code, String message) {
		this.success = success;
		this.code = code;
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ReturnResult{" +
				"success=" + success +
				", code='" + code + '\'' +
				", message='" + message + '\'' +
				", data=" + data +
				'}';
	}
}
