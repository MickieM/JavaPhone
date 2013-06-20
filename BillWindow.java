import javax.swing.JDialog; 
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.text.NumberFormat;
//*****************************************
//*** FILE: BillWindow.java                *
//***  PROG: Mickie Maxey		  *
//**  PURP: Final Project - show cell phone bill total    *
//*****************************************

class BillWindow extends JDialog implements ActionListener
{
  private JPanel myPanel = null;
  private JButton btnOK;
  private JLabel message, bill;
  NumberFormat billFormat = NumberFormat.getCurrencyInstance();
  
  public BillWindow (String billIn) //CONSTRUCTOR
  {
      
      super();
      String total = billIn;
      
      
      myPanel = new JPanel();
      getContentPane().add(myPanel);
      
      message = new JLabel("Your total bill is:");
      myPanel.add(message);
      
      
      bill = new JLabel(total);
      myPanel.add(bill);
      
      btnOK = new JButton("OK");
	  btnOK.addActionListener(this);
	  myPanel.add(btnOK);
        
      pack();
      
      setVisible(true);  
  }
    
   public void actionPerformed(ActionEvent e) 
   {
	if(e.getSource()==btnOK) 
    {
	    setVisible(false);
	}
	
    }
   
   
  

}//END DIALOG
