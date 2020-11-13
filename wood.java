import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class wood extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int x;
	private int y;
	
	Image tree;
	
	public wood(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public void update() {
		tree = new ImageIcon("Image/wood.png").getImage();
	}
	
	public void draw(Graphics2D g2d) {
		g2d.drawImage(tree,x,y,50,50,this);
	}
	
	public Rectangle getTouch() {
		return new Rectangle(x+10, y+5, 30, 50);
	}
}
