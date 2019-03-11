package Polimorphism_SMS_Sender;

public class Driver {
	
	public static void main(String[] args) {
		if(args[0].equals("mail")) {
		
			sendMessageToUser(new MailMessageSender(), "adshaskjd");
		} else if (args[0].equals("sms")) {
			sendMessageToUser(new SMSMessageSender(), "sadsad");
		}
		
	}
	
	static void sendMessageToUser(AbstractMessageSender sender, String message) {
		sender.sendMessage(message);
	}
	
}
