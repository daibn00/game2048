package Week_04;

public class SoPhuc {
	// Thuộc tính của số phức
	private double thuc;
	private double ao;
	
	public SoPhuc() {
		this.thuc = 0.0;
		this.ao = 0.0;
	}
	

	public SoPhuc(double thuc, double ao) {
		this.thuc = thuc;
		this.ao = ao;
	}

	public double getThuc() {
		return thuc;
	}

	public void setThuc(double thuc) {
		this.thuc = thuc;
	}

	public double getAo() {
		return ao;
	}

	public void setAo(double ao) {
		this.ao = ao;
	}
	//toString
	@Override
	public String toString() {
		return "SoPhuc [ + " +thuc + "+" + ao + " * i ]";
	}
	
	//methods
	
	public double module() {
		return Math.sqrt(this.thuc * this.thuc + this.ao * this.ao);
	}
	
	public SoPhuc sum(SoPhuc sp2) {
		SoPhuc v = new SoPhuc();
		v.setThuc(this.getThuc() + sp2.getThuc());
		v.setAo(this.getAo() + sp2.getAo());
	    return v;
	}

}
