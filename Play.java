import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Play extends JPanel implements ActionListener{

	Timer timer,timer2,timerclock;
	
	cat cat;
	
	dogdead c;

	inputTree t;
	
	ControlKEY d;

        
        Controlwater wa;
        
	public static int n = 0;
	public static int tc = 240;
	
	
	Image backgound;
        Image KEY;
        Image Wood;
	
	public Play() {
		timer = new Timer(10,this);
		timer2 = new Timer(1000,new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		timerclock = new Timer(1000,new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		timer.start();
		timer2.start();
		
		cat = new cat(40,83);
		
		c = new dogdead();

		t = new inputTree();
	
		d = new ControlKEY();

                
                wa = new Controlwater();
		
		backgound = new ImageIcon("Image/page_game.png").getImage();
		
		addKeyListener(new Keyeyg(cat));
		setFocusable(true);
	}	
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D)g;
		g2d.drawImage(backgound,0,0,Main.WIDTH,Main.HIGHT,this);
	
		cat.draw(g2d);
		if(cat.level == 1) {
			d.draw(g2d);
			c.draw(g2d);
			t.draw(g2d);
                        wa.draw(g2d);
		}
           
                KEY = new ImageIcon("Image/KEY.png").getImage();
                g2d.drawImage(KEY,390,710,40,40, this);
                g2d.setColor(Color.YELLOW);
		g2d.setFont(new Font("Tahoma",Font.BOLD,30));
		g2d.drawString("     : "+cat.score+"/5",400,740);

		if (cat.score == 5){
			timer2.stop();
			g2d.setColor(Color.BLUE);
			g2d.setFont(new Font("Tahoma",Font.BOLD,40));
			g2d.drawString("WIN",350,400);
		}

		if(cat.dd == 1) {
			timer2.stop();
			g2d.setColor(Color.RED);
			g2d.setFont(new Font("Tahoma",Font.BOLD,30));
			g2d.drawString("GAME OVER",300,400);	
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		cat.update();
		if(cat.level == 1) {
			d.update();
			c.update();
			t.update();
                        wa.update();

		}		
		repaint();
	}       
}
