package Curs9;

public class MobilePhone extends Product{

	int buyingPrice;
	int TVA;
	
	
	public MobilePhone(int buyingPrice, int TVA) {
		setBuyingPrice(buyingPrice);
		setTVA(TVA);
	}
	
	
	@Override
	int caluclatePrice() {
		return buyingPrice + TVA;
	}

	public int getBuyingPrice() {
		return buyingPrice;
	}

	public void setBuyingPrice(int buyingPrice) {
		this.buyingPrice = buyingPrice;
	}

	public int getTVA() {
		return TVA;
	}

	public void setTVA(int tVA) {
		TVA = tVA;
	}

	
	
	
}
