package SimpleClass2;

public class TV_Run {
public static void main(String[] args) {
	TV run = new TV();
	run.turnOn();
	run.changeChannel(9);
	run.channelUp();
	run.changeVolume(15);
	run.volumeDown();
	run.volumeDown();
	System.out.println("Channel is " + run.channel + " Volume is " + run.volume);
}
}
