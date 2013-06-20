import javax.swing.JDialog; 
import java.awt.Frame;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
//*****************************************
//*** FILE: ContactWindow.java                *
//***  PROG: Mickie Maxey		  *
//**  PURP: Final Project - get user input for calls, gps, web    *
//******************************************

class ContactWindow extends JDialog implements ActionListener
{
	private JPanel myPanel = null;
	private JLabel message;
    private JButton btnOK;
    private JComboBox contactBox;
    private JTextField selection;
    
    private String[] contacts = {"Doctor Who", "Harry Potter", "Frodo Baggins", "Gandolf the Gray"};
    
    //constructor
    
    public ContactWindow(Frame parent)
    {
    	super(parent, true);
    	
    	
    	myPanel = new JPanel();
        getContentPane().add(myPanel);
        
        message = new JLabel("Who would you like to call?");
        myPanel.add(message);
        message.reshape(10, 10, 200, 50);  
        
        contactBox = new JComboBox(contacts);
        contactBox.setSelectedIndex(0);
        myPanel.add(contactBox);
        contactBox.reshape(10, 60, 40, 40);
        contactBox.addActionListener(this);
        
        selection = new JTextField(10);
        myPanel.add(selection);
        selection.setBounds(20,100,80,80);
        
        btnOK = new JButton("OK");
    	btnOK.addActionListener(this);
    	myPanel.add(btnOK);
        
        pack();
        setVisible(true);
    }


	public void actionPerformed(ActionEvent e) 
	{
		
		if(e.getSource() == contactBox)
		{
			JComboBox cb = (JComboBox)e.getSource();
    		String called = (String)cb.getSelectedItem();
    		message.setText("You are calling: ");
    		selection.setText(called);
    		contactBox.setVisible(false);
		}
		
		if(  e.getSource()==btnOK) 
        {
			setVisible(false);
        }
	}//END LISTENER
}//END CONTACT WINDOW

