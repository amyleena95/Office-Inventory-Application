
public class Stationary extends OfficeItem
{
	
	//add data member
	public String statusS;
	public String locationS;
	public String personInChargeS;
	public int quantityS;
	
	//default constructor
	public Stationary()
	{
		super();
		this.statusS = "";
		this.locationS = "";
		this.personInChargeS = "";
		this.quantityS = 0;
	}
	
	//normal constructor
	public Stationary (String statusS, String locationS, String personInChargeS, int quantityS)
	{
		super();
		this.statusS = statusS;
		this.locationS = locationS;
		this.personInChargeS = personInChargeS;
		this.quantityS = quantityS;
	}
	
	public String getStatusS()
	{
		return statusS;
	}
	public void setStatusS(String statusS)
	{
		this.statusS = statusS;
	}
	
	public String getLocationS()
	{
		return locationS;
	}
	public void setLocationS(String locationS)
	{
		this.locationS = locationS;
	}
	
	public String getPersonInChargeS()
	{
		return personInChargeS;
	}
	public void setPersonInChargeS(String personInChargeS)
	{
		this.personInChargeS = personInChargeS;
	}
	
	public int getQuantityS()
	{
		return quantityS;
	}
	
	public void setQuatityS(int quantityS)
	{
		this.quantityS = quantityS;
	}

	@Override
	public String toString() {
		return "Stationary [statusS=" + statusS + ", locationS=" + locationS + ", personInChargeS=" + personInChargeS
				+ ", quantityS=" + quantityS + "]";
	}

	
	
	
}
