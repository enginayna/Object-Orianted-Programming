package DateClassUse;
import java.sql.Date;
public class ASd {
	private Date history;
	
	ASd(){
		this.history = new Date(System.currentTimeMillis());
	}
	
	public String getHistory() {
		return history.toLocaleString();
	}
	
}


