package in.co.rays.bussiness;

public class BussinesManService {
	
	private RichMan richMan;
	
	private SocialWork socialWork;

	public void setRichMan(RichMan richMan) {
		this.richMan = richMan;
	}

	public void setSocialWork(SocialWork socialWork) {
		this.socialWork = socialWork;
	}
	
	public void myMoney() {
		
		richMan.donation();
		richMan.earn();
		
	}
	
	public void myService() {

		socialWork.helpToOther();
		
}
}