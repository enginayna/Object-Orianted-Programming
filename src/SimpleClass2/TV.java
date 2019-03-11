package SimpleClass2;

public class TV {
	boolean on = false;
	int channel = 1;
	int volume = 1;
	
TV(){
		
	}
void turnOn() {
	on = true;
}
void turnOff() {
	on = false;
}
void changeChannel(int newChannel) {
	if(on && newChannel >= 1 && newChannel <= 120) {
		channel = newChannel;
	}
}
public void changeVolume(int newVolume) {
	if(on && newVolume >= 0 && newVolume <= 20) {
		volume = newVolume;
	}
}
public void channelUp() {
	if(on && channel < 120) {
	channel++;
	}
}
public void channelDown() {
	if(on && channel >1){
	channel--;
	}
}
public void volumeUp() {
	if(on && volume < 20) {
		volume++;
	}
}
public void volumeDown() {
	if(on && volume > 1) {
		volume--;
	}
}

}
