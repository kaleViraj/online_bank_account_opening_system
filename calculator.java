
import java.awt.Frame;
import java.awt.event.ActionListener;

//write a program to display calculater in frame


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VIRAJ
 */
public class calculator  extends Frame implements ActionListener {
     Label l1,l2,l3,l4;
    TextField t1,t2,t3;
    Button b1,b2,b3,b4,b5;
	calculater()
	{
		setBackground(Color.orange);
		setForeground(Color.black);
		
		setLayout(null);
		Font f1=new Font("Times New Roman",Font.BOLD,30);
		Font f2=new Font("Times New Roman",Font.BOLD,22);
		Font f3=new Font("Times New Roman",Font.BOLD |Font.ITALIC,20);
		l1=new Label("CALCULATER APPLICATION");
		l2=new Label("FIRST_NO");
		l3=new Label("SECOND_NO");
		l4=new Label("RESULT");
		
		t1=new TextField(35);
		t2=new TextField(35);
		t3=new TextField(35);
		
		b1=new Button("ADD");
		b2=new Button("SUB");
		b3=new Button("MUL");
		b4=new Button("DIV");
		b5=new Button("CLEAR");
		
		l1.setFont(f1);
		l2.setFont(f2);
		l3.setFont(f2);
		l4.setFont(f2);
		
		b1.setFont(f3);
		b2.setFont(f3);
		b3.setFont(f3);
		b4.setFont(f3);
        b5.setFont(f3);
		
		l1.setBounds(215,150,500,60);
		l2.setBounds(80,250,130,30);
		t1.setBounds(230,250,60,30);
		l3.setBounds(310,250,150,30);
		t2.setBounds(480,250,60,30);
		l4.setBounds(560,250,130,30);
		t3.setBounds(700,250,60,30);
		b1.setBounds(100,350,90,40);
		b2.setBounds(280,350,90,40);
		b3.setBounds(460,350,90,40);
		b4.setBounds(640,350,90,40);
		b5.setBounds(370,480,90,40);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		add(l1);
		add(l2);add(t1);add(l3);add(t2);add(l4);add(t3);
		add(b1);add(b2);add(b3);add(b4);add(b5);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		int x=Integer.parseInt(t1.getText());
		int y=Integer.parseInt(t2.getText());
		if(ae.getSource()==b1)
		{
			int z=x+y;
			t3.setText(z+"");
		}
		else if(ae.getSource()==b2)
		{
			int z=x-y;
			t3.setText(z+"");
		}
		else if(ae.getSource()==b3)
		{
			int z=x/y;
			t3.setText(z+"");
		}
		else if(ae.getSource()==b4)
		{
			int z=x*y;
			t3.setText(z+"");
		}
		else if(ae.getSource()==b5)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
	}
	public static void main(String args[])
	{
		calculater c1=new calculater();
		c1.setVisible(true);
		c1.setTitle("CALCULATER");
		c1.setSize(900,700);
	}
}
