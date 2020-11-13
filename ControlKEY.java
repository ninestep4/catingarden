import java.awt.Graphics2D;
import java.util.LinkedList;

public class ControlKEY {
	static LinkedList<KEY> d = new LinkedList<>();
	KEY temp;
	
	public ControlKEY() {
		addKEY(new KEY(200,50));
		addKEY(new KEY(150,290));
                addKEY(new KEY(323,223));
		addKEY(new KEY(370,600));
                addKEY(new KEY(700,600));
	}
	
	public void draw(Graphics2D g2d) {
		for(int i = 0; i< d.size(); i++) {
			temp = d.get(i);
			temp.draw(g2d);
		}
	}
	
	public void update() {
		for(int i = 0; i< d.size(); i++) {
			temp = d.get(i);
			temp.update();
		}
	}
	
	public void addKEY(KEY KEY) {
		d.add(KEY);
	}
	
	public void removeKEY(KEY KEY) {
		d.remove(KEY);
	}
	
	public static LinkedList<KEY> getKEYTouch() {
		return d;
	}
}
