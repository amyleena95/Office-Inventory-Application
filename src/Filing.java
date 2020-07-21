
public class Filing extends OfficeItem 
{
	//add data member
	public String statusF;
	public String locationF;
	public String personInChargeF;
	public int quantityF;
	
	//default constructor
	public Filing()
	{
		super();
		this.statusF = "";
		this.locationF = "";
		this.personInChargeF = "";
		this.quantityF = 0;
	}
	
	//normal constructor
		public Filing(String statusF, String locationF, String personInChargeF, int quantityF)
		{
			super();
			this.statusF = statusF;
			this.locationF = locationF;
			this.personInChargeF = personInChargeF;
			this.quantityF = quantityF;
		}
		
		public String getStatusF()
		{
			return statusF;
		}
		public void setStatusF(String statusF)
		{
			this.statusF = statusF;
		}
		
		public String getLocationF()
		{
			return locationF;
		}
		public void setLocationF(String locationF)
		{
			this.locationF = locationF;
		}
		
		public String getPersonInChargeF()
		{
			return personInChargeF;
		}
		public void setPersonInChargeF(String personInChargeF)
		{
			this.personInChargeF = personInChargeF;
		}
		
		public int getQuantityF()
		{
			return quantityF;
		}
		public void setQuantityF(int quantityF)
		{
			this.quantityF = quantityF;
		}

		@Override
		public String toString() {
			return "Filing [statusF=" + statusF + ", locationF=" + locationF + ", personInChargeF=" + personInChargeF
					+ ", quantityF=" + quantityF + "]";
		}
		
		

}
