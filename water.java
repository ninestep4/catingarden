import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class water extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int x;
	private int y;
	
	Image fire;
	
	public water(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public void update() {
		fire = new ImageIcon("Image/water.png").getImage();
	}
	
	public void draw(Graphics2D g2d) {
		g2d.drawImage(fire,x,y,50,50,this);
	}
	
	public Rectangle getTouch() {
		return new Rectangle(x+10, y+10, 30, 20);
	}
}

class Controlwater {
	static LinkedList<water> f = new LinkedList<>();
	water temp;
	
	public Controlwater() {
                addwater(new water(363,283));
                addwater(new water(403,283));
		addwater(new water(443,283));
		addwater(new water(483,283));
                addwater(new water(523,283));
                addwater(new water(563,283));
                
                
                addwater(new water(523,550));
                addwater(new water(523,580));
                addwater(new water(523,620));
	}
	
	public void draw(Graphics2D g2d) {
		for(int i = 0; i< f.size(); i++) {
			temp = f.get(i);
			temp.draw(g2d);
		}
	}
	
	public void update() {
		for(int i = 0; i< f.size(); i++) {
			temp = f.get(i);
			temp.update();
		}
	}
	
	public void addwater(water water) {
		f.add(water);
	}
	
	public void removewater(water water) {
		f.remove(water);
	}
	
	public static LinkedList<water> getwaterTouch() {
		return f;
	}
}
