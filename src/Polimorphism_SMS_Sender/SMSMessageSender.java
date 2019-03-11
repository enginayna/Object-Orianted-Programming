package Polimorphism_SMS_Sender;

public class SMSMessageSender extends AbstractMessageSender {
	
	@Override
	void sendMessage(String message) {
		
		System.out.println(message + " SMSMessageSender");
	}
}	
