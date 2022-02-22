
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class bank_account extends JFrame implements ActionListener  
{   JLabel submitb;
    JPanel pb;
   CardLayout c1;
	bank_account()
 {  
 
    	        JPanel step1  =new JPanel();
		JPanel step2 =new JPanel();
		JPanel step3 =new JPanel();
		
	
		JButton submitb=new JButton(" SUBMIT ");
		
		
		submitb.addActionListener(this);
		//b2.addActionListener(this);

		JPanel p=new JPanel();
		p.add(submitb);
		
			
		 pb=new JPanel();
		c1=new CardLayout();
      pb.setLayout(c1);
		pb.add("stp1",step1);
		pb.add("stp2",step2);
		//pb.add(p3,"step3");
		
		add(p,BorderLayout.SOUTH);
		add(pb,BorderLayout.CENTER);
  
  
   
  }
public void actionPerformed(ActionEvent ae)
{
     if(ae.getSource()==submitb)
   {  
       c1.next(pb);
     }
   
  

}
	public static void main(String args[])throws Exception
	{   
		JLabel bname =new JLabel(" --- BHANDHAN BHANK PVT. LTD. ---",JLabel.CENTER);
		// 	bname.setText("c=Centered");
		Font f1=new Font("Imprint MT Shadow",Font.BOLD|Font.ITALIC,25);
		bname.setFont(f1);
		bank_account c1=new bank_account();
		c1.setVisible(true);
		c1.setSize(1950,900);
		c1.setTitle("CARD-LAYOUT");
		c1.add(bname);
		
		
	}
}