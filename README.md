# Send-SMS-with-SpringBoot-And-Twillio
Send SMS with SpringBoot And Twillio

Step 1:
  First Create a Twilio Account form Below link
  
  https://www.twilio.com/try-twilio

Step 2:
  Second go with Url below
  
  https://console.twilio.com/?frameUrl=%2Fconsole%3Fx-target-region%3Dus1
  
Step 3:
  Generate Your Twilio Number
  
Step 4:
  Download this project and open in any java IDE Like Eclips or Intellij.
  
Step 5:
  Add information based on step 2 details paste inside application.yml file
  
Step 6:
  configur Your phone number inside twillio url is below
  
  https://console.twilio.com/us1/develop/phone-numbers/manage/verified?frameUrl=%2Fconsole%2Fphone-numbers%2Fverified%3Fx-target-region%3Dus1
  
Step 7:
  Go to PostMan and select POST request with below URL and Body
  
  URL:
    http://localhost:8080/send
  
  Body:
    {
	    "phoneNumber": "<Enter your varified number in twilio [Based on Step 6]>",
	    "message": "<Enter Your Message>"
    }
    
Step 8:
  Finally Hit the send button inside Postman and you will get SMS in phone
