package bai1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class bai31 extends JFrame implements ActionListener{
	public static void main(String[] args) {
		
		new bai31();

			}
	public JTextField test;
	public JTextField kq;
	public bai31() {
		this.setTitle("tim so nguyen to");
		this.setSize(300,400);
	this.setDefaultCloseOperation(3);
	this.setLayout(new GridLayout(3,1));
	JLabel s1=new JLabel("cac so nguyen to <=n");
	this.add(s1);
	test=new JTextField("0");
	kq=new JTextField("0");
	JPanel s2= new JPanel();
	s2.setLayout(new GridLayout(2,2));
	JLabel b1=new JLabel("nhap n");
	JLabel b2 =new JLabel("kq");
	s2.add(b1);
	s2.add(test);
	s2.add(b2);
	s2.add(kq);
	this.add(s2);
	JPanel s3= new JPanel();
	s3.setLayout(new GridLayout(1,3));
	JButton a1=new JButton("tim");
	a1.addActionListener(this);
	JButton a2=new JButton("reset");
	a2.addActionListener(this);
	JButton a3=new JButton("exit");
	a3.addActionListener(this);
	s3.add(a1);
	s3.add(a2);
	s3.add(a3);
	this.add(s3);

	this.setVisible(true);


		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("tim")) {
			

			String s=test.getText();
			//BigInteger a=new BigInteger(s,10);
			//while ()
			String s2;
			double a=Double.parseDouble(s);
			for(int i=0;i<a;i++) {
				if(Nguyento(i)==1) {
					kq.setText(i+"");
				}
			}


		} else if(e.getActionCommand().equals("reset")) {
			test=new JTextField("0");
			kq=new JTextField("0");
		}else if(e.getActionCommand().equals("exit")) {
			System.exit(0);
		}}
		public static int Nguyento(int n) {
			if(n<2) return 0;
			for(int i=2;i<n-1;i++) {
				if(n%i==0) return 0;
			}
			return 1;
		}
	}

