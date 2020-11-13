import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class KEY extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int x;
	private int y;
	private int speedy = 1;
	
	Image diamond;
	Image diamond_over;
	
	public KEY(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public void update() {
		diamond = new ImageIcon("Image/KEY.png").getImage();
		
		
		if(cat.dd == 1) {
			speedy = 0;
		}
		
		if(cat.level == 5) {
			y += speedy;
			if(y < 293) {
				speedy = 1;
			}
			if(y > 383) {
				speedy = -1;
			}
		}
	}
	
	public void draw(Graphics2D g2d) {
		if(cat.dd == 1) {
			g2d.drawImage(diamond_over,x,y,50,50,this);
		}
		else {
			g2d.drawImage(diamond,x,y,50,50,this);
		}
	}
	
	public Rectangle getTouch() {
		return new Rectangle(x, y, 50, 50);
	}
}
