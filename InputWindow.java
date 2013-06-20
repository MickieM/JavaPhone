


import javax.swing.JDialog; 
import java.awt.Frame;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
//*****************************************
//*** FILE: InputWindow.java                *
//***  PROG: Mickie Maxey		  *
//**  PURP: Final Project - get user input for calls, gps, web    *
//*****************************************


class InputWindow extends JDialog implements ActionListener
{
	
	
	
	private static final long serialVersionUID = 1L;
	private JPanel myPanel = null;
	private JLabel message;
    private JButton btnEnter, btnClear;
    private JTextField textIn;
  
    
    
    
    public InputWindow(Frame parent, String labelIn)
    {
       super(parent, true);
       String question = labelIn;
       
       myPanel = new JPanel();
       getContentPane().add(myPanel);
       
      
       
       message = new JLabel(question);
                myPanel.add(message);
                message.reshape(10, 10, 200, 50);  
               
       textIn  = new JTextField(10);
                myPanel.add(textIn);
                textIn.reshape(75, 50, 75, 30);
                
       btnEnter = new JButton("Enter");
       btnEnter.addActionListener(this);
       myPanel.add(btnEnter);
		
		
       
       btnClear = new JButton("Clear");
       btnClear.addActionListener(this);
       myPanel.add(btnClear);
	            
		pack();
		setVisible(true);         
    
    }
    
      
		public void actionPerformed(ActionEvent e)
        {
            if (e.getSource() == btnEnter)
            {
       
               setVisible(false);
                
            }
            
            if (e.getSource() == btnClear)
            {
                textIn.setText(" ");
            }
        }
        
    
    protected String getValue()
    {
        return textIn.getText();
        
    }

	
}//END INPUT WINDOW CLASS