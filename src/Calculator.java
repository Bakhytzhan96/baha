 import java.awt.Color;
import java.awt.Font;
import java.awt.TexturePaint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Calculator extends JFrame{
	int a;
	int b;
	double abs;	
	char c;
	boolean t=false;	 
	Calc obj = new Calc();
	
	Calculator(){
		setTitle("Калькулятор");
		setSize(288,350);//super(400,400);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		JTextField tf = new JTextField();
		
		tf.setHorizontalAlignment(JTextField.RIGHT);
		tf.setBounds(0, 0, 286, 70);
		tf.setEditable(false);
		tf.setBackground(Color.GRAY);
		tf.setFont(new Font("Arial", 2, 40));
		
		JButton b1 = new JButton("<html><i>1");
		JButton b2 = new JButton("<html><i>2");
		JButton b3 = new JButton("<html><i>3");
		JButton b4 = new JButton("<html><i>4");
		JButton b5 = new JButton("<html><i>5");
		JButton b6 = new JButton("<html><i>6");
		JButton b7 = new JButton("<html><i>7");
		JButton b8 = new JButton("<html><i>8");
		JButton b9 = new JButton("<html><i>9");
		JButton b0 = new JButton("<html><i>0");
		
		b1.setBounds(0, 120, 70, 50);		
		b2.setBounds(70, 120, 70, 50);
		b3.setBounds(140, 120, 70, 50);
		b4.setBounds(0, 170, 70, 50);		
		b5.setBounds(70, 170, 70, 50);
		b6.setBounds(140, 170, 70, 50);
		b7.setBounds(0, 220, 70, 50);		
		b8.setBounds(70, 220, 70, 50);
		b9.setBounds(140, 220, 70, 50);
		b0.setBounds(70, 270, 70, 50);
		
		JButton plus = new JButton("<html><i>+");
		JButton minus = new JButton("<html><i>-");
		JButton kobeitu = new JButton("<html><i>*");
		JButton equal = new JButton("<html><i>=");
		JButton bolu = new JButton("<html><i>/");
		JButton darezhe = new JButton("<html><i>X^2");
		JButton birbolu = new JButton("<html><i>1/x");
		JButton tubir = new JButton("<html><i>√");
		JButton Clear = new JButton("<html><i>C");
		JButton PM = new JButton("<html><i>+/-");
		JButton point = new JButton("<html><i>.");
		JButton Pr = new JButton("<html><i>%");		
		
		plus.setBounds(210, 70, 70, 50);
		plus.setBackground(new java.awt.Color(239,231,232));
		minus.setBounds(210, 120, 70, 50);
		minus.setBackground(new java.awt.Color(239,231,232));
		kobeitu.setBounds(140, 70, 70, 50);
		kobeitu.setBackground(new java.awt.Color(239,231,232));
		bolu.setBounds(70, 70, 70, 50);
		bolu.setBackground(new java.awt.Color(239,231,232));
		darezhe.setBounds(210, 170, 70, 50);
		darezhe.setBackground(new java.awt.Color(239,231,232));
//		birbolu.setBounds(140, 270, 70, 50);
//		birbolu.setBackground(new java.awt.Color(239,231,232));
		tubir.setBounds(140, 270, 70, 50);
		tubir.setBackground(new java.awt.Color(239,231,232));
		Clear.setBounds(0, 70, 70, 50);
		Clear.setBackground(new java.awt.Color(202,0,27));
		PM.setBounds(0, 270, 70, 50);
		PM.setBackground(new java.awt.Color(239,231,232));
		point.setBounds(140, 270, 70, 50);
		Pr.setBounds(0, 270, 70, 50);
		Pr.setBackground(new java.awt.Color(239,231,232));		
		equal.setBounds(210, 220, 70, 100);
		equal.setBackground(new java.awt.Color(15,51,107));		
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"1");				
			}
		});		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"2");			
			}
		});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"3");
				}
		} );
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"4");
				}
		} );
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"5");
				}
		});
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"6");
			}
		});
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"7");
			}
		});
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"8");
			}
		});
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"9");
			}
		});
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"0");
			}
		});		
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				a = Integer.parseInt(tf.getText());
				tf.setText("");
				c = '+';
			}
		});
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Integer.parseInt(tf.getText());
				tf.setText("");
				c='-';
			}
		});
		kobeitu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Integer.parseInt(tf.getText());
				tf.setText("");
				c='*';
			}
		});
		bolu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Integer.parseInt(tf.getText());
				tf.setText("");
				c='/';				
			}
		});
		darezhe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Integer.parseInt(tf.getText());
				tf.setText("");
				c='^';
			}
		});
//		birbolu.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				a = Integer.parseInt(tf.getText());
//				tf.setText("");
//				c='1';//				
//			}
//		});
		tubir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Integer.parseInt(tf.getText());
				String s = obj.tubir(a)+"";
				tf.setText(s.substring(0,12));					
			}
		});
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tf.setText("");
				a=0;
				b=0;
				
				
			}
		});
//		PM.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				a = Integer.parseInt(tf.getText());
//				tf.setText("");
//				c = '.';
//			}
//		});
		Pr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				abs = Double.parseDouble(tf.getText());
				tf.setText("");
				c = '%';
				
			}
		});
		point.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//a = 
			}
		});
		
		equal.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				b = Integer.parseInt(tf.getText());
				if(c=='+')
					tf.setText((int)obj.plus(a, b)+"");
				if(c=='-')
					tf.setText((int)obj.minus(a, b)+"");
				if(c=='*')
					tf.setText((int)obj.kobeitu(a,b)+"");
				if(c=='/')
					tf.setText((int)obj.bolu(a,b)+"");
				if(c=='^')
					tf.setText((int)obj.darezhe(a, b)+"");
//				if(c=='1')
//					tf.setText((int)obj.birbolu(a)+"");
//				if(c=='&')
					tf.setText((int)obj.tubir(a)+"");
				if(c ==' ')
					tf.setText((int)obj.Clear()+"");
//				if(c=='.')
//					tf.setText((int)obj.PM(a)+"");
				if(c=='%')
					tf.setText((double)obj.Pr(abs, b)+"");
								
				c=' ';
				a=0;
				b=0;
				}
		});
		
		add(tf);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b0);
		
		add(plus);
		add(minus);
		add(kobeitu);
		add(bolu);
		add(darezhe);
//		add(birbolu);
		add(equal);
		add(tubir);
		add(Clear);
//		add(PM);
		add(Pr);

		setVisible(true);
	}	
	public static void main(String[] args) {
		new Calculator();
	}
}