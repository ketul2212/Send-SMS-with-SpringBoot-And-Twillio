package com.ketul.module;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("twilio")
public class TwilioInfo {
	
	private String ACCOUNT_SID;
	private String AUTH_TOKEN;
	private String PHONE_NUMBER;
	
	public String getACCOUNT_SID() {
		return ACCOUNT_SID;
	}
	public void setACCOUNT_SID(String aCCOUNT_SID) {
		ACCOUNT_SID = aCCOUNT_SID;
	}
	public String getAUTH_TOKEN() {
		return AUTH_TOKEN;
	}
	public void setAUTH_TOKEN(String aUTH_TOKEN) {
		AUTH_TOKEN = aUTH_TOKEN;
	}
	public String getPHONE_NUMBER() {
		return PHONE_NUMBER;
	}
	public void setPHONE_NUMBER(String pHONE_NUMBER) {
		PHONE_NUMBER = pHONE_NUMBER;
	}
}
