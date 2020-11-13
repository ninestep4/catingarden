import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Keyeyg extends KeyAdapter {
	cat p;
	
	public Keyeyg(cat p) {
		this.p = p;
	}
	
	public void keyPressed(KeyEvent e) {
		p.keyPressed(e);
	}
	
	public void keyReleased(KeyEvent e) {
		p.keyReleased(e);
	}
}