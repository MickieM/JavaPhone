import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

//*****************************************
//*** FILE: Contacts.java                *
//***  PROG: Mickie Maxey		  *
//**  PURP: Final Project - write contacts to data file   *
//*****************************************
public class Contacts 
{

	public static void main(String[] args)
	{
		Contacts fileIO = new Contacts();
		
		
		String lName[] = new String[3];
		String fName[] = new String[3];
		String phone[] = new String[3];
		
		
		lName[0] = "Who";
		lName[1] = "Potter";
		lName[2] = "Baggins";
		lName[3] = "the Gray";
		
		fName[0] = "Doctor";
		fName[1] = "Harry";
		fName[2] = "Frodo";
		fName[3] = "Gandolf";
		
		phone[0] = "(770) 335 2536";
		phone[1] = "(842) 589 1111";
		phone[2] = "(910) 963 2201";
		phone[3] = "(770) 457 1625";
		
		
		
		
		for(int i = 0; i<3; i++)
		{
			fileIO.Write(lName[i], fName[i], phone[i]);
			String contact = lName[1] + fName[i];
		}
		
		
	}//END MAIN
	
	
	public void Write(String lName, String fName, String phone)
	{
		DataOutputStream output;
        output = null;
        File fileOut = new File("myContacts.data");
        
        
        
        try
        {
        	output = new DataOutputStream(new FileOutputStream(fileOut));
        }
        catch(IOException i)
        {System.out.println(i);}
        
        try{                               //try for write
    			
    				output.writeUTF("Last Name: ");
    				output.writeUTF(lName);
    				output.writeUTF("First Name: ");
    				output.writeUTF(fName);
    				output.writeUTF("Phone: ");
    				output.writeUTF(phone);

      	  	
      	     }catch (IOException i)
      	         {System.out.println("error in write");}
        try{                            //try for close
 		   output.close();
         }catch (IOException i)
            {System.out.println("error in close");}

		
	}
	

	
}//END CONTACTS
