import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.*;

public class AnimationGame extends JFrame {
	JPanel p2;
	JLabel l;
	int counter;
	DrawingPanel p1;
	static int x,y;
	JButton left,right;
	JButton jump;
	int height,width;
	boolean status = true;
	Color color;
	String s="";
	Image img = Toolkit.getDefaultToolkit().getImage("1.gif");
	AnimationGame(){
		setSize(400,400);
		setTitle("My first game");//super("Window 1");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null); //setLayout(new BorderLayout());
		
		p1 = new DrawingPanel();
		p2 = new JPanel();
		//p2.setLayout(null);
		left = new JButton("<-");
		right = new JButton("->");
		jump = new JButton("jump");
		l = new JLabel();
		color = Color.BLUE;
		
		p1.setBounds(0, 0, 400, 200);
		p2.setBounds(0, 200, 400, 200);
		left.setBounds(50,50	,100, 30);
		right.setBounds(200,50, 100, 30);
		right.setBounds(50,85, 250, 30);
		//l.setBounds(, y, width, height);
		//p1.setBackground(Color.cyan);
		p2.setBackground(Color.magenta);
		
		jump.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(status)
					new Jump();
			}
		});
		//p2.add(left);p2.add(right);
		p2.add(l);
		p2.add(jump);
		add(p1);add(p2);
		setVisible(true);		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		new RandomObjects();
		new CheckEnd();		
	}
	class DrawingPanel extends JPanel{
		public void paintComponent(Graphics gr) {
			gr.setColor(Color.red);
			//gr.fillOval(75, 170+y, 30, 30);
			gr.drawImage(img, 75, 130+y, 70, 70,this);
			gr.setColor(color);
			gr.fillRect(x, 170, width, height);
		}
	}	
	class Jump implements Runnable{
		Jump(){
			new Thread(this).start();
		}
		public void run() {
			for(int i=0;i<260;i++) {
				if(i<130)
					y--;
				else 
					y++;				
				try {
					Thread.sleep(3);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				repaint();
			}
		}		
	}	
	class RandomObjects implements Runnable{
		RandomObjects(){
			System.out.println("RandomObjects");
			new Thread(this).start();
		}
		public void run() {
			// TODO Auto-generated method stub
			int count = 0;
			int speed = 3;
			while(status) {
				Random r = new Random();
				height=r.nextInt(25)+5;
				width=r.nextInt(35)+5;
				count++;
				if(count%3==0&&speed>1)
					speed--;
				color = new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
			for(int i=450;i>-50&&status;i--) {
				//color = new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
				x=i;
				try {
					Thread.sleep(speed);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				repaint();
			}
			l.setText("Score: "+counter+s);
			counter++;			
		}
			}		
	}	
	class CheckEnd implements Runnable{
		CheckEnd(){
			new Thread(this).start();
		}		
		public void run() {			
			while(status) {
				System.out.println(x+" "+width);
			if(x<145&&75<(x+width)&&200+y>170) {
				status=false;
				s=" GAME OVER";
			//	l.setText(l.getText()+" GAME OVER");
			}
		}
		}
	}	
	/*left.addKeyListener(new KeyListener() {
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub		
	}	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==37) {
			x=x-10;
			repaint();
		}
		if(e.getKeyCode()==39) {
			x=x+10;
			repaint();
		}
		System.out.println(e.getKeyCode());
	}
});*/
	/*left.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		x=x-10;
		repaint();
	}
});
right.addActionListener(new ActionListener() {	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		x=x+10;
		repaint();
	}
});
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AnimationGame();	}
}