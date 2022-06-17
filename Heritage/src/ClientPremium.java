
public class ClientPremium extends Client{
	
	@Override
	public double calculateDiscount() {
		return(getOrder_value() - (getOrder_value() * 0.15));
	}
}
