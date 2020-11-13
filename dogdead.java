import java.awt.Graphics2D;
import java.util.LinkedList;

public class dogdead {
	static LinkedList<Wolf> e = new LinkedList<>();
	Wolf temp;
	
	public dogdead() {
		addWolf(new Wolf(203,203));
		addWolf(new Wolf(443,413));
	}
	
	public void draw(Graphics2D g2d) {
		for(int i = 0; i< e.size(); i++) {
			temp = e.get(i);
			temp.draw(g2d);
		}
	}
	
	public void update() {
		for(int i = 0; i< e.size(); i++) {
			temp = e.get(i);
			temp.update();
		}
	}
	
	public void addWolf(Wolf wolf) {
		e.add(wolf);
	}
	
	public void removeWolf(Wolf wolf) {
		e.remove(wolf);
	}
	
	public static LinkedList<Wolf> getWolfTouch() {
		return e;
		
	}
}
