package com.ketul.module;

import javax.validation.constraints.NotBlank;

public class SmsRequest {

	@NotBlank
	private String phoneNumber;
	
	@NotBlank
	private String message;

	public SmsRequest() {
		super();
	}

	public SmsRequest(@NotBlank String phoneNumber, @NotBlank String message) {
		super();
		this.phoneNumber = phoneNumber;
		this.message = message;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "SmsRequest [phoneNumber=" + phoneNumber + ", message=" + message + "]";
	}
}