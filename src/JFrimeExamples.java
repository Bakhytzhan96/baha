import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.*;
public class JFrimeExamples extends JFrame{
	String s [] = {"text1","text2","text3","text4"};
	JLabel l;
	JTextField tf;
	JTextArea ta;
	JScrollPane sp;
	JList jl;
	JComboBox cb;
	JCheckBox chb;
	JRadioButton rb1;
	JRadioButton rb2;
	ButtonGroup bg;
	JButton b;
	JToggleButton tb;
	JFrimeExamples(){
		setTitle("window 1");//super ("okno");
		setSize(400,400);
		setLocation(300, 150);
		setLayout(null);
		setResizable(false);
		
		ImageIcon img = new ImageIcon("1.jpg");
		l = new JLabel(img);
		
		tf = new JTextField();
		ta = new JTextArea();
		tf.setFont(new Font("Arial", 1, 25));
		sp = new JScrollPane(ta);
		cb = new JComboBox(s);
		chb = new JCheckBox("Ok");
		rb1 = new JRadioButton("ON");
		rb2 = new JRadioButton("OFF");
		bg = new ButtonGroup();
		b = new JButton("<html><i>ok");
		b.setFont(new Font("Arial", 1, 35));
		tb = new JToggleButton("true");
		
		bg.add(rb1);
		bg.add(rb2);
		
		jl = new JList(s);
		
		l.setBounds(30, 30, 100, 30);
		
		l.setLocation(30,30);
		l.setSize(100,30);
		
		tf.setBounds(30, 70, 100, 30);
		tf.setForeground(Color.red);
		tf.setBackground(Color.black);
		tf.setText("SU");
		tf.setEnabled(false);
		tf.setEditable(false);
		
		ta.setBounds(140, 30, 200, 150);
		sp.setBounds(140, 30, 200, 150);
		jl.setBounds(140, 190, 200, 150);
		cb.setBounds(30, 110, 100, 30);
		cb.setEnabled(false);
		chb.setBounds(30, 150, 50, 30);
		rb1.setBounds(10, 190, 60, 30);
		rb2.setSelected(true);
		rb2.setBounds(80, 190, 60, 30);
		b.setBounds(30, 230, 100, 30);
		tb.setBounds(30, 270, 100, 30);
		
		add(l);
		add(tf);
		add(sp);
		add(ta);
		add(jl);
		add(cb);
		add(chb);
		add(rb1);
		add(rb2);
		add(b);
		add(tb);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JFrimeExamples();
		
	}
}