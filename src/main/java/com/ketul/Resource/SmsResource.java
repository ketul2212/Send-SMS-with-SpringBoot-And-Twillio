package com.ketul.Resource;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ketul.module.SmsRequest;
import com.ketul.service.SmsService;

@RestController
public class SmsResource {

	@Autowired
	private SmsService smsService;
	
	@PostMapping("/send")
	public void sendSms(@Valid @RequestBody SmsRequest smsRequest) {
		smsService.sendSms(smsRequest);
	}
}
