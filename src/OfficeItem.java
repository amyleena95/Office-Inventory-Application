
public class OfficeItem 
{	
	public String itemName;
	public String category;
	public int code;
	public int date;
	public double price;
	
	//default constructor
	public OfficeItem()
	{
		super();
		this.itemName = "";
		this.category = "";
		this.code = 0;
		this.date = 0;
		this.price = 0.0;
	}
	
	//normal constructor
	public OfficeItem(String itemName, String category, int code, int date, double price, int quantity)
	{
		super();
		this.itemName = itemName;
		this.category = category;
		this.code = code;
		this.date = date;
		this.price = price;
	}
	
	public String getItemName()
	{
		return itemName;
	}
	public void setItemName(String itemName)
	{
		this.itemName = itemName;
	}
	
	public String getCategory()
	{
		return category;
	}
	public void setCategory(String category)
	{
		this.category = category;
	}
	
	public int getCode()
	{
		return code;
	}
	public void setCode(int code)
	{
		this.code = code;
	}
	
	public int getDate()
	{
		return date;
	}
	public void setDate(int date)
	{
		this.date = date;
	}
	
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}

	@Override
	public String toString() {
		return "OfficeItem [itemName=" + itemName + ", category=" + category + ", code=" + code + ", date=" + date
				+ ", price=" + price +  "]";
	}
	
	

}
