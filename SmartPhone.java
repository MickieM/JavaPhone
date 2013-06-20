import java.text.NumberFormat;

//*****************************************
//*** FILE: SmartPhone.java                *
//***  PROG: Mickie Maxey		  *
//**  PURP: Final Project - Smart Phone Class   *
//*****************************************

class SmartPhone extends DumbPhone
{
    protected int data, web, nav;
    
    public SmartPhone ()//CONSTRUCTOR
	{
		super();
		data = 0;
		web = 0;
		nav = 0;
		
	}
    
    public void useNav(int milesIn)
	{
		int miles = milesIn;
		nav += miles;
		data += miles;
	}
   
    public void useWeb(int pagesIn)
	{
		int pages = pagesIn;
		web += pages;
		data += pages;
	}
    

    public void calcBill()
	{
		
		double minTotal = 0, textTotal = 0, dataCost = 30;
		
		int minOver = 0, overage = 5;
		
		
		//CALC MINUTES
		if (minutes <= 100)
		{
			minTotal = minutes * .20;
		}
		else
		{
			minOver = minutes - 100;
			minutes = minutes - minOver;
			
			minTotal = (minOver*.50) + (minutes*.20) + overage;
		}
		
		
		//CALC TEXTS
		textTotal = texts*.25;
		
		
		if (data > 100)
		{
			int dataOver = ((data - 100)*5);
			dataCost += dataOver;
		}
		
		bill = minTotal + textTotal + dataCost;
		
	}
	
	public String getBill()
	{
		String billString;
		
		NumberFormat billFormat = NumberFormat.getCurrencyInstance();
        billString = billFormat.format(bill);
                
		return billString;
	}
    
    public int getWeb()
	{
		return web;
	}
	
	public int getNav()
	{
		return nav;
	}
	
	public int getData()
	{
		return data;
	}
	
	
}//END SMARTPHONE

