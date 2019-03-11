package DateClassUse;
import java.util.Date;

import javax.swing.JSpinner.DateEditor;
public class Example {
public static void main(String[] args) {
	 Date date = new Date();
	
	 System.out.println(dateEquals(date.getTime()));
	 
}
public static boolean dateEquals(long time) {
	if(time == System.currentTimeMillis()) {
		return true;
	}
	else {
		return false;
	}
}
}
