import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//*****************************************
//*** FILE: JavaPhone.java                *
//***  PROG: Mickie Maxey		  *
//**  PURP: Final Project - Operating system for JavaPhone cell phone   *
//*****************************************

public class JavaPhone extends JFrame
{
    
	private static final long serialVersionUID = 1L;
	private JLabel labelDo;
    private JButton btnCall, btnBill, btnText;
    private JButton btnNav, btnWeb;
    private ButtonHandler bhandler; 
    
    SmartPhone[] myPhone = new SmartPhone[3];
    InputWindow windowIn;
    ContactWindow contactIn;
    BillWindow windowBill;
    TextWindow textIn;
    Contacts writeContacts = new Contacts();
   
    
    private int thisPhone = 0; 
	
    //constructor
    
    public JavaPhone()
    {
        super ("JavaPhone 1.0");
        
        writeContacts.Write("","","");
        myPhone[0] = new SmartPhone();
        myPhone[1] = new SmartPhone();
        myPhone[2] = new SmartPhone();
        
        Container cont = getContentPane();
        cont.setLayout(null);
		
        bhandler = new ButtonHandler();
		
        labelDo = new JLabel("JAVAPHONE");
        cont.add(labelDo);
        labelDo.reshape(112, 10, 200, 50);  
		
        btnCall = new JButton("Call");
		cont.add(btnCall);
		btnCall.reshape(85, 60, 120, 30);
		btnCall.addActionListener(bhandler);
                
        btnText = new JButton("Text Message");
		cont.add(btnText);
		btnText.reshape(85, 100, 120, 30);
		btnText.addActionListener(bhandler);
                
        btnNav = new JButton("GPS");
		cont.add(btnNav);
		btnNav.reshape(85, 140, 120, 30);
		btnNav.addActionListener(bhandler);
                
        btnWeb = new JButton("Internet");
		cont.add(btnWeb);
		btnWeb.reshape(85, 180, 120, 30);
		btnWeb.addActionListener(bhandler);
                
        btnBill = new JButton("View Bill");
		cont.add(btnBill);
		btnBill.reshape(85, 220, 120, 30);
		btnBill.addActionListener(bhandler);  
                
       
   
              
        setSize (303,403);
        setVisible(true);
        
    }//END CONTAINER
    
    public static void main(String a[])
	{
		JavaPhone staticPhone = new JavaPhone();  
		staticPhone.addWindowListener
		    (new WindowAdapter()
		       {

				      public void windowClosing(WindowEvent e)
				         {System.exit(0);}
				}    );
	}
    
    
    class ButtonHandler implements ActionListener
	{
        
        
		public void actionPerformed(ActionEvent e)
		{
			
			
			if(e.getSource() == btnCall)
			{
				javaCall();          
			}
			
            if(e.getSource() == btnText)
			{
            	javaText();
			}
                        
            if(e.getSource() == btnBill)
            {
                javaBill();
			}
                        
            if(e.getSource() == btnNav)
			{
                javaNav();
			}
                        
            if(e.getSource() == btnWeb)
			{
				javaWeb();
			}
                
		}
      }//END BUTTON HANDLER	
    
    private void javaCall()
    {
    	contactIn = new ContactWindow(JavaPhone.this);
		windowIn = new InputWindow(JavaPhone.this,"How many minutes will you use?");
        String minutesIn = windowIn.getValue();
        int minutes = Integer.parseInt(minutesIn);
		myPhone[thisPhone].makeCall(minutes);
    }
    
    private void javaText()
    {
    	textIn = new TextWindow(JavaPhone.this);
    	myPhone[thisPhone].sendText();
    }
    
    private void javaBill()
    {
    	
    	myPhone[thisPhone].calcBill();
        String total = myPhone[thisPhone].getBill();
        windowBill = new BillWindow(total);
    }
    
    private void javaNav()
    {
    	 windowIn = new InputWindow(JavaPhone.this,"How many miles will you drive?");
         int milesIn = Integer.parseInt(windowIn.getValue());
         myPhone[thisPhone].useNav(milesIn);
    }
    
    private void javaWeb()
    {
    	
    	windowIn = new InputWindow(JavaPhone.this,"How many pages will you view?");
        int pagesIn = Integer.parseInt(windowIn.getValue());
        myPhone[thisPhone].useWeb(pagesIn);
    }
    
    
}//END JAVAPHONE








