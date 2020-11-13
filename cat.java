import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class cat extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Timer timeritem;
	
	private int x;
	private int y;
	
	int ti = 20;
	int xtemp;
	int ytemp;
	int speeditem = 0;
	
	private int speedx = 0;
	private int speedy = 0;
	
	private LinkedList<Wolf> e = dogdead.getWolfTouch();

        private LinkedList<water> wa = Controlwater.getwaterTouch();
	
	private LinkedList<Tree> g = inputTree.getTreeTouch();
	

	
	private LinkedList<KEY> d = ControlKEY.getKEYTouch();



	
	public static int score = 0;
	public static int dd = 0;
	public static int level = 1;
	
	Image hunter_stan;
	Image hunter_up;
	Image hunter_left;
	Image hunter_right;
	Image hunter_down;
	
	public cat(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	public void update() {
		hunter_stan = new ImageIcon("Image/cat.png").getImage();
		hunter_left = new ImageIcon("Image/cat1.gif").getImage();
		hunter_right = new ImageIcon("Image/cat2.gif").getImage();
		hunter_down = new ImageIcon("Image/cat2.gif").getImage();
		hunter_up = new ImageIcon("Image/cat2.gif").getImage();

		if(ti <= 0) {
			speeditem = 0;
			timeritem.stop();
		}
		
		x += speedx;
		y += speedy;
		
		if(x <= 0) {
			if(level == 1) {
				x = 0;
			}else {
				x = 800;
				level--;
			}
		}
		
		if(y <= 0) {
			if(level == 1) {
				y = 0;
			}else {
				y = 1000;
				level--;
			}
		}
		
		Touch();
	}
	
	public void draw(Graphics2D g2d) {

			if(Play.n == 0) {
				g2d.drawImage(hunter_stan,x,y,40,40,this);
			}
			if(Play.n == 1) {
				g2d.drawImage(hunter_right,x,y,40,40,this);
			}
			if(Play.n == 2) {
				g2d.drawImage(hunter_left,x,y,40,40,this);
			}
			if(Play.n == 3) {
				g2d.drawImage(hunter_down,x,y,40,40,this);
			}
			if(Play.n == 4) {
				g2d.drawImage(hunter_up,x,y,40,40,this);
			}
		
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if(cat.dd == 1 || cat.score == 5) {
			speedx = 0;
			speedy = 0;
		}
		else {
			if(key == KeyEvent.VK_RIGHT) {
				if(speeditem == 1) {
					speedx = 3;
				}else {
					speedx = 1;
				}
				Play.n = 1;
			}
			if(key == KeyEvent.VK_LEFT) {
				if(speeditem == 1) {
					speedx = -3;
				}else {
					speedx = -1;
				}
				Play.n = 2;
			}
			if(key == KeyEvent.VK_DOWN) {
				if(speeditem == 1) {
					speedy = 3;
				}else {
					speedy = 1;
				}
				Play.n = 3;
			}
			if(key == KeyEvent.VK_UP) {
				if(speeditem == 1) {
					speedy = -3;
				}else {
					speedy = -1;
				}
				Play.n = 4;
			}
		}
	}
	
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_RIGHT) {
			speedx = 0;
		}
		if(key == KeyEvent.VK_LEFT) {
			speedx = 0;
		}
		if(key == KeyEvent.VK_DOWN) {
			speedy = 0;
		}
		if(key == KeyEvent.VK_UP) {
			speedy = 0;
		}
	}
	
	public Rectangle getTouch() {
		return new Rectangle(x+10, y+10, 30, 30);
	}
	
	public void Touch() {
		if(cat.level == 1) {
			for(int i = 0; i < e.size(); i++) {
				if(getTouch().intersects(e.get(i).getTouch())) {
					cat.dd = 1;
				}
                        }
                        for(int i = 0; i < wa.size(); i++) {
				if(getTouch().intersects(wa.get(i).getTouch())) {
					cat.dd = 1;
				}        
			}
			for(int i = 0; i < g.size(); i++) {
				if(getTouch().intersects(g.get(i).getTouch())) {
					speedx = 0;
					speedy = 0;
					
					if (Play.n == 1) {
						x--;
					}
					if (Play.n == 2) {
						x++;
					}
					if (Play.n == 3) {
						y--;
					}
					if (Play.n == 4) {
						y++;
					}
				}	
			}
			for(int i = 0; i < d.size(); i++) {
				if(getTouch().intersects(d.get(i).getTouch())) {
					d.remove(i);
					score++;
				}
			}
		}
        }
        
}

		


			

		
	