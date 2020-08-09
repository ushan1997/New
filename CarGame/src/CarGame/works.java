package CarGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class works extends JPanel implements ActionListener,KeyListener{


	private int space;
	private int width=80;
	private int height=70;
	private int speed;
	private int count=1;
	private int carheight=80;
	private int carwidth=50;
	private int EWIDTH=500;
	private int EHEIGHT=700;
	private int move=20;
	private Rectangle car;
	private ArrayList<Rectangle> ocars;
	private Random rand;
	Timer t;
	
	
	public works() {
		
		t=new Timer(20, this);
		rand=new Random();
		ocars=new ArrayList<Rectangle>();
		car=new Rectangle(EWIDTH/2-90,EHEIGHT-100,width,height);
		space=200;
		speed=2;
		addKeyListener(this);
		setFocusable(true);
		addocars(true);
		addocars(true);
		
		t.start();
	}
	


	public void addocars(boolean first) {
		
		int postionx=rand.nextInt()%2;
		int x=0;
		int y=0;
		int OWidth=width;
		int OHeight=height;
		
		if(postionx==0) {
			x=EWIDTH/2-90;
		}else {
			x=EWIDTH/2+10;
		}
		if(first) {
			ocars.add(new Rectangle(x,y-100-(ocars.size()*space),OWidth,OHeight));
		}else {
			ocars.add(new Rectangle(x, ocars.get(ocars.size()-1).y-400,OWidth,OHeight));
		}
			
	}
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.setColor(new Color(0,100,0));
		g.fillRect(0, 0, EWIDTH, EHEIGHT);
		
		g.setColor(Color.DARK_GRAY);
		g.fillRect(EWIDTH/2-100, 0, 200, EHEIGHT);
		
		g.setColor(Color.red);
		g.fillRect(car.x, car.y, car.width, car.height);
		
		g.setColor(Color.white);
		g.drawLine(EWIDTH/2, 0, EWIDTH/2, EHEIGHT);
		g.setColor(Color.black);
		
		for(Rectangle rect:ocars) {
			g.fillRect(rect.x, rect.y, rect.width, rect.height);
		}
		
	}
	//-------------------------------------------------------------------
	public void actionPerformed(ActionEvent e) {
	
		Rectangle rect;
		count++;
		for(int i=0;i<ocars.size();i++) {
			rect=ocars.get(i);
			
			if(count%1000==0) {
				speed++;//speed opponents car
				if(move<50) {
					
					move+=10;//speed our car
				}
			}
			rect.y+=speed;
		}
		//cars crashing  with opponents
		for(Rectangle r:ocars) {
			if(r.intersects(car)) {
				car.y=r.y+height;
			}
		}
		for(int i=0;i<ocars.size();i++) {
			rect=ocars.get(i);
			if(rect.y+rect.height>EHEIGHT) {
				ocars.remove(rect);
				addocars(false);
			}
		}
		
		repaint();
	}
	//-------------------------------------------------------------------
	public void moveup() {
		if(car.y-move<0) {
			System.out.println("\b");
		}else {
			car.y-=move;
		}
	}
	public void movedown() {
		if(car.y+move+car.height>EHEIGHT-1) {
			System.out.println("\b");
		}else {
			car.y+=move;
		}
	}
	public void moveleft() {
		if(car.x-move<EWIDTH/2-90) {
			System.out.println("\b");
		}else {
			car.x-=move;
		}
	}
	public void moveright() {
		if(car.x+move>EWIDTH/2+10) {
			System.out.println("\b");
		}else {
			car.x+=move;
		}
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		int key=e.getKeyCode();
		switch(key) {
		
		case KeyEvent.VK_W  :moveup();
		break;
		
		case KeyEvent.VK_S:movedown();
		break;
		
		case KeyEvent.VK_A:moveleft();
		break;
		
		case KeyEvent.VK_D:moveright();
		break;
		
		default:break;
		}
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
	
		
	}
	
	

}
