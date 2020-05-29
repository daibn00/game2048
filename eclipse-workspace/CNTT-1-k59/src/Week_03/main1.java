package Week_03;

public class main1 {
	public static void main(String[] args) {
		PS ps1 = new PS(3,6);
		PS ps2 = new PS(1,1);
		
		
		System.out.println(ps1.cong(ps2).toString());
		ps1.RG();
		ps2.RG();
		System.out.println(ps1.cong(ps2).toString());
	}
	

}
