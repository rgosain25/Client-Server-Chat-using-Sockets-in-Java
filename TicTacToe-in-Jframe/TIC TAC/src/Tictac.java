import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Tictac extends JFrame {
	int flag=0,ct=0;
	JButton t1,t2,t3,t4,t5,t6,t7,t8,t9,check;
	JTextField text;
public Tictac()
{
	setTitle("Tic Tac");
	setSize(500,500);
	
	t1=new JButton();
	t2=new JButton();
	t3=new JButton();
	t4=new JButton();
	t5=new JButton();
	t6=new JButton();
	t7=new JButton();
	t8=new JButton();
	t9=new JButton();
	check=new JButton("Check");
	
	text=new JTextField("");
	setLayout(null);
	t1.setBounds(20, 70, 50, 50);
	t2.setBounds(70,70,50,50);
	t3.setBounds(120, 70, 50, 50);
	
	t4.setBounds(20, 120, 50,50);
	t5.setBounds(70, 120, 50, 50);
	t6.setBounds(120, 120, 50, 50);
	
	t7.setBounds(20, 170, 50, 50);
	t8.setBounds(70, 170, 50, 50);
	t9.setBounds(120, 170, 50, 50);
	text.setText("textbox");
	text.setBounds(200,200,50, 50);
	check.setBounds(300, 300, 50, 50);
	getContentPane().add(t1);
	getContentPane().add(t2);
	getContentPane().add(t3);
	getContentPane().add(t4);
	getContentPane().add(t5);
	getContentPane().add(t6);
	getContentPane().add(t7);
	getContentPane().add(t8);
	getContentPane().add(t9);
	getContentPane().add(text);
	getContentPane().add(check);	
	
	
	t1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(flag==0)
			{
				t1.setLabel("X");
				flag=1;
				ct++;
			}
			else if(flag==1)
			{
				t1.setLabel("O");
				flag=0;
			}
			
		}
	});
t1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(flag==0)
			{
				t1.setLabel("X");
				ct++;
				flag=1;
			}
			else if(flag==1)
			{
				t1.setLabel("O");
				flag=0;
			}
			
		}
	});
t1.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(flag==0)
		{
			t1.setLabel("X");
			flag=1;
		}
		else if(flag==1)
		{
			t1.setLabel("O");
			flag=0;
		}
		
	}
});
t1.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(flag==0)
		{
			t1.setLabel("X");
			flag=1;
		}
		else if(flag==1)
		{
			t1.setLabel("O");
			flag=0;
		}
		
	}
});
t2.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(flag==0)
		{
			t2.setLabel("X");
			flag=1;
		}
		else if(flag==1)
		{
			t2.setLabel("O");
			flag=0;
		}
		
	}
});
t3.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(flag==0)
		{
			t3.setLabel("X");
			flag=1;
		}
		else if(flag==1)
		{
			t3.setLabel("O");
			flag=0;
		}
		
	}
});
t4.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(flag==0)
		{
			t4.setLabel("X");
			flag=1;
		}
		else if(flag==1)
		{
			t4.setLabel("O");
			flag=0;
		}
		
	}
});
	
t5.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(flag==0)
		{
			t5.setLabel("X");
			flag=1;
		}
		else if(flag==1)
		{
			t5.setLabel("O");
			flag=0;
		}
		
	}
});
t6.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(flag==0)
		{
			t6.setLabel("X");
			flag=1;
		}
		else if(flag==1)
		{
			t6.setLabel("O");
			flag=0;
		}
		
	}
});
t7.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(flag==0)
		{
			t7.setLabel("X");
			flag=1;
		}
		else if(flag==1)
		{
			t7.setLabel("O");
			flag=0;
		}
		
	}
});
t8.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(flag==0)
		{
			t8.setLabel("X");
			flag=1;
		}
		else if(flag==1)
		{
			t8.setLabel("O");
			flag=0;
		}
		
	}
});
t9.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(flag==0)
		{
			t9.setLabel("X");
			flag=1;
		}
		else if(flag==1)
		{
			t9.setLabel("O");
			flag=0;
		}
		
	}
});
check.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String b1=t1.getLabel();
		String b2=t1.getLabel();
		String b3=t1.getLabel();
		String b4=t1.getLabel();
		String b5=t1.getLabel();
		String b6=t1.getLabel();
		String b7=t1.getLabel();
		String b8=t1.getLabel();
		String b9=t1.getLabel();

		if((b1=="O" && b2=="O" && b3=="O") || (b1=="O" && b4=="O" && b7=="O") || (b1=="O" && b5=="O" && b9=="O")|| (b2=="O" && b5=="O" && b8=="O")|| (b3=="O" && b6=="O" && b9=="O") ||(b3=="O" && b5=="O" && b7=="O")|| (b4=="O" && b5=="O" && b6=="O")|| (b7=="O" && b8=="O" && b9=="O"))
		{
			text.setText("O wins");
			}
		if((b1=="X" && b2=="X" && b3=="X") || (b1=="X" && b4=="X" && b7=="X") || (b1=="X" && b5=="X" && b9=="X")|| (b2=="X" && b5=="X" && b8=="X")|| (b3=="X" && b6=="X" && b9=="X") ||(b3=="X" && b5=="X" && b7=="X")|| (b4=="X" && b5=="X" && b6=="X")|| (b7=="X" && b8=="X" && b9=="X"))
		{
			text.setText("X wins");
			}
		
	}
});



}
public static void main(String[] args) {
	new Tictac().setVisible(true);
	
}
}
