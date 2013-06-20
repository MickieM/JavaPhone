
import java.text.NumberFormat;
import java.util.Random;

//*****************************************
//*** FILE: DumbPhone.java                *
//***  PROG: Mickie Maxey		  *
//**  PURP: Final Project - Dumb Phone Class   *
//*****************************************

public class DumbPhone
{
    protected double bill;
    protected int minutes, texts;
    
    
    public DumbPhone() //constructor
	{
		
        bill = 0;
		minutes = 0;
		texts = 0;
	}
	
	public void makeCall(int minutesIn)
	{

		int callTime = minutesIn;
		minutes += callTime;
	}
	
	public void sendText()
	{
		texts += 1;
	}
	
	public void calcBill()
	{
		
		double minTotal = 0, textTotal = 0;
		
		int minOver = 0, overage = 5;
		
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
		
		textTotal = texts*.25;
		
		bill += minTotal + textTotal;
	}
	
	public String getBill()
	{
		String billString;
		
		NumberFormat billFormat = NumberFormat.getCurrencyInstance();
        billString = billFormat.format(bill);
                
		return billString;
	}
	
	public int getMinutes()
	{
		return minutes;
	}
	
	public int getTexts()
	{
		return texts;
	}
	
	public int getRandom()
	{
		Random generator = new Random();
		int num = generator.nextInt();
		return num;
	}//THIS METHOD IS FOR FUTURE PROGRAM FEATURES
	
    
}//END DUMBPHONE