
import javax.swing.JDialog; 
import java.awt.Frame;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
//*****************************************
//*** FILE: TextWindow.java                *
//***  PROG: Mickie Maxey		  *
//**  PURP: Final Project - choose text message recipients    *
//******************************************

class TextWindow extends JDialog implements ActionListener
{
	private JPanel myPanel = null;
	private JLabel message, selected;
    private JButton btnOK, btnSelect;
	private JCheckBox cb1, cb2, cb3, cb4;
	private JTextField textMessage;
	private JTextArea txtChosen;

	//constructor
	
	 public TextWindow(Frame parent)
	    {
	    	super(parent, true);
	    	
	    	myPanel = new JPanel();
	        getContentPane().add(myPanel);
	        
	        message = new JLabel("Who would you like to text?");
	        myPanel.add(message);
	        message.reshape(10, 10, 200, 50);  
	        
	        cb1 = new JCheckBox("Doctor Who", false);
	        myPanel.add(cb1);
	        //cb1.addActionListener(this);
	        
	        cb2 = new JCheckBox("Harry Potter", false);
	        myPanel.add(cb2);
	        //cb2.addActionListener(this);
	        
	        cb3 = new JCheckBox("Frodo Baggins", false);
	        myPanel.add(cb3);
	        //cb3.addActionListener(this);
	        
	        cb4 = new JCheckBox("Gandolf the Gray", false);
	        myPanel.add(cb4);
	        //cb4.addActionListener(this);
	        
	        btnSelect = new JButton("Select");
	    	btnSelect.addActionListener(this);
	    	myPanel.add(btnSelect);
	    	
	    	textMessage = new JTextField(25);
	    	myPanel.add(textMessage);
	    	textMessage.setVisible(false);
	    	
	    	 selected = new JLabel("Your text will be sent to:");
		     myPanel.add(selected);
		     selected.setVisible(false);   
	    	
	    	txtChosen = new JTextArea();
	    	myPanel.add(txtChosen);
	    	txtChosen.reshape(10, 40, 50, 50);
	    	txtChosen.setVisible(false);
	    	
	    	btnOK = new JButton("OK");
	    	btnOK.addActionListener(this);
	    	myPanel.add(btnOK);
	    	btnOK.setVisible(false);
	    	
	    	
	    	pack();
	        setVisible(true);
	      
}
	 
	 public void actionPerformed(ActionEvent e) 
		{
			
			if (e.getSource()== btnSelect)
			{
			
				String chosen = " ";
				if (cb1.isSelected())
					chosen += "" + cb1.getText() + "\r\n";
				if (cb2.isSelected())
					chosen += "" + cb2.getText() + "\r\n";
				if (cb3.isSelected())
					chosen += "" + cb3.getText() + "\r\n";
				if (cb4.isSelected())
					chosen += "" + cb4.getText() + "\r\n";
				
			
				
				cb1.setVisible(false);
				cb2.setVisible(false);
				cb3.setVisible(false);
				cb4.setVisible(false);
				
				
				
				btnSelect.setVisible (false);
				btnOK.setVisible(true);
				selected.setVisible(true);
				
				
				message.setText("Enter your text message");
				textMessage.setVisible(true);
				
				txtChosen.setVisible(true);
				txtChosen.setText(chosen);
				
				pack();
			}
		 
		 
		 	if(e.getSource()==btnOK) 
	        {
				setVisible(false);
	        }
		}//END LISTENER
	 
}//END TEXTWINDOW CLASS