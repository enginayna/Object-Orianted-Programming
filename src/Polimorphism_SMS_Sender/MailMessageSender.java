package Polimorphism_SMS_Sender;

public class MailMessageSender extends AbstractMessageSender{
	
	@Override
	void sendMessage(String message) {
		
		System.out.println(message + " MailMessageSender");
	}
	
}
