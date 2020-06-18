import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;
public class second extends JPanel implements ActionListener,KeyListener{
	Timer t = new Timer(5,this);
	static Random rand= new Random();
	int increment=20,bulletCount=0,checksize=50,size=0;
	static int upperbound=550,lowerbound=50;
	static int int_random = (int) (Math.random()*upperbound+lowerbound); 
	static double[] enemyposx= {0,0,0,0,0,0,0,0,0,0,0};
	static double x=1,y=10,velX=0,velY=1,size1=0,size2=0,enemysizex=60,enemysizey=60,velXtest=5;	
	static double[]bulx= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	static double[]buly= {0,0,0,0,0,0,0,0,0,0,0.0,0,0,0,0,0,0,0,0,0};
	static double[]enemyposy= {20,50,80,110,140,170,200,230,260,290,320};
	static double[] bulvel={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	boolean start=false;
	public ImageIcon titleImage;
	static String ammoyDisplay="hi";
	
	
	 boolean[] bulletArray=new boolean[20];
	ArrayList<Ellipse2D> BulletList=new ArrayList<Ellipse2D>();
	
	public second() {
		t.restart();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
	}
	
//	public class ammoDisplay{
	//String ammo="";
	//
//	}
	
	public void paintComponent (Graphics g)	{
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D)g;
		
	if (start==false)	
	{	
		//draw border for gameplay
		//g.setColor(Color.WHITE);
		g.drawRect(5,5, 600, 400);
		
		//draw background for title screen
		g.setColor(Color.BLACK);
	  	g.fillRect(1,5, 580, 355);
		//draw title image border
		g.setColor(Color.white);
		g.drawRect(1,5,600,50);
		//draw title image	
	}
	
		//draw background for gameplay
		g.setColor(Color.BLACK);
		g.fillRect(1,5, 580, 355);
	  
		//DRAWING MAIN CHARACTER
		g.setColor(Color.DARK_GRAY);
		if (start==true) {
		Ellipse2D circle=new Ellipse2D.Double(x,y,40,20);
		g2.fill(circle);	
		g.setColor(Color.YELLOW);
		Ellipse2D topcircle=new Ellipse2D.Double(x+9.5,y-5,20,10);
		g2.fill(topcircle);	
		}
		
		//DRAWING MULTIPLE BULLETS
		Ellipse2D a=new Ellipse2D.Double(bulx[0],buly[0],size1,size2);
	    BulletList.add(0,a);   
	    g.setColor(Color.RED);
	    
	    if (bulletArray[1]==true) {
	    	Ellipse2D c=new Ellipse2D.Double(bulx[1],buly[1],size1,size2);
	 	    BulletList.add(1,c);   
	 	    g2.fill(BulletList.get(1));
	 	    System.out.println(enemyposx[1]);
	 	    EraseEnemy1.erase();
	    }
	
	    if (bulletArray[2]==true) {
	    	Ellipse2D c=new Ellipse2D.Double(bulx[2],buly[2],size1,size2);
		    BulletList.add(2,c);
		    g2.fill(BulletList.get(2));	
		    EraseEnemy2.erase2();
		    }
		
	    if (bulletArray[3]==true) {
	    	Ellipse2D c=new Ellipse2D.Double(bulx[3],buly[3],size1,size2);
		    BulletList.add(3,c);
		    g2.fill(BulletList.get(3));
		    EraseEnemy3.erase3();
		    }
	    if (bulletArray[4]==true) {
	    	Ellipse2D c=new Ellipse2D.Double(bulx[4],buly[4],size1,size2);
		    BulletList.add(4,c);
		    g2.fill(BulletList.get(4));
		    EraseEnemy4.erase4();
		    }
	    if (bulletArray[5]==true) {
	    	Ellipse2D c=new Ellipse2D.Double(bulx[5],buly[5],size1,size2);
		    BulletList.add(5,c);
		    g2.fill(BulletList.get(5));
		    EraseEnemy5.erase5();
		    }
	    if (bulletArray[6]==true) {
	    	Ellipse2D c=new Ellipse2D.Double(bulx[6],buly[6],size1,size2);
		    BulletList.add(6,c);
		    g2.fill(BulletList.get(6));
		    EraseEnemy6.erase6();
		    }
	    if (bulletArray[7]==true) {
	    	Ellipse2D c=new Ellipse2D.Double(bulx[7],buly[7],size1,size2);
		    BulletList.add(7,c);
		    g2.fill(BulletList.get(7));
		    EraseEnemy7.erase7();
		    }
	    if (bulletArray[8]==true) {
	    	Ellipse2D c=new Ellipse2D.Double(bulx[8],buly[8],size1,size2);
		    BulletList.add(8,c);
		    g2.fill(BulletList.get(8));
		    EraseEnemy8.erase8();
		    }
	    if (bulletArray[9]==true) {
	    	Ellipse2D c=new Ellipse2D.Double(bulx[9],buly[9],size1,size2);
		    BulletList.add(9,c);
		    g2.fill(BulletList.get(9));
		    EraseEnemy9.erase9();
		    }
	    if (bulletArray[10]==true) {
	    	Ellipse2D c=new Ellipse2D.Double(bulx[10],buly[10],size1,size2);
		    BulletList.add(10,c);
		    g2.fill(BulletList.get(10));
		    EraseEnemy10.erase10();
		    }
	   	
		//DRAWING ENEMIES
	    if (start==true)
	    {
	    	g.setColor(Color.GREEN);
		for (int count=0;count<11;count++){
			Ellipse2D enemy=new Ellipse2D.Double(enemyposx[count],enemyposy[count],13,18);
			g2.fill(enemy);	
			
		}	
	    }
	}

	//PREVENTS PLAYER FROM GOING OFF SCREEN
	public void actionPerformed(ActionEvent e) {
	if (y==334)
	{
	velY=-1;	
	}
	else if (y==0)
	{ 
		velY=1;
	}
	if (x==564)
	{
	velX=-1;	
	}
	else if (x==0)
	{ 
		velX=1;
	}
	
	//VELOCITY OF PLAYER AND BULLETS
	x+=velX;	
	y+=velY;
	bulx[1]+=bulvel[1];
	bulx[2]+=bulvel[2];
	bulx[3]+=bulvel[3];
	bulx[4]+=bulvel[4];
	bulx[5]+=bulvel[5];
	bulx[6]+=bulvel[6];
	bulx[7]+=bulvel[7];
	bulx[8]+=bulvel[8];
	bulx[9]+=bulvel[9];
	bulx[10]+=bulvel[10];
	
	//UPDATES THE WINDOW
	if (start==true)
	{
	repaint();
	}

	
	}
	
	
	////////////////////////////////////////////////////////////////////////////////////////
	
	
	//USER CONTROLS
	public void up() {
		velY=-1;
		velX=0;	
	}
	public void down() {
		velY=1;
		velX=0;
	}
	public void left() {
		velY=0;
		velX=-1;
	}
	public void right() {
		velY=0;
		velX=1;
	}
	
	//TURN OFF AUTOPILOT
	public void stop() {
		velY=0;
		velX=0;
	}
	
	//SHOOTS BULLETS TO THE SCREEN
	public void shoot() {
		if (bulletCount==10)
		    {
		    	bulletCount=0;
		    }	    
		bulletCount++;
		bulvel[bulletCount]=6;
		size1=30;
		size2=5;
		bulx[bulletCount]=x;
		buly[bulletCount]=y+4;
		bulletArray[bulletCount]=true;
		}
	
	//RESETS POSITIONS OF ENEMIES ON SCREEN
	public void replay() {
		int initial=20,increment=30;
	
		for(int i=0;i<11;i++)
		{
		int_random = (int) (Math.random()*upperbound+lowerbound);  
		enemyposx[i]=int_random;
		}
		
		for (int i=0;i<11;i++)
		{
			enemyposy[i]=initial;
			initial=initial+increment;
		}
		start=true;
	}

	@Override
	
	//GENERATES AN EVENT WHEN KEY IS PUSHED
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int code=e.getKeyCode();
		if (code==KeyEvent.VK_UP) {
			up();
		}
		if (code==KeyEvent.VK_DOWN) {
			down();
		}
		if (code==KeyEvent.VK_LEFT) {
			left();
		}
		if (code==KeyEvent.VK_RIGHT) {
			right();
		}
		if (code==KeyEvent.VK_SPACE) {
			
			shoot();
		}
		if (code==KeyEvent.VK_ENTER) {
			replay();
		}		
	}
	
	@Override
	public void keyReleased(KeyEvent arg0) {
		
		//stop();
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}