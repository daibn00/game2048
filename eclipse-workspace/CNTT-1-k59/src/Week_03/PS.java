package Week_03;

public class PS {
	private int ts;
	private int ms;
	
	public PS(int ts, int ms) {
		super();
		this.ts = ts;
		this.ms = ms;
	}
	// Getter and Setter
	public int getTs() {
		return ts;
	}
	public void setTs(int ts) {
		this.ts = ts;
	}
	public int getMs() {
		return ms;
	}
	public void setMs(int ms) {
		this.ms = ms;
	}
	@Override
	public String toString() {
		return "PS [ts=" + ts + ", ms=" + ms + "]";
	}
	
	public PS cong(PS p) {
		PS result = new PS(1,1);
		result.ms = this.ms * p.ms;
		result.ts = this.ts * p.ms + this.ms * p.ts;
		return result;
	}
	
	public void RG() {
		int x = utils.UCLN(this.ts, this.ms); //class Methods
		this.ts = this.ts / x;
		this.ms = this.ms / x;
		
	}
	
	
	

}
