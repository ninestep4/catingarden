import javax.swing.JFrame;

public class Main extends JFrame {
	
	public static final int WIDTH = 800;
	public static final int HIGHT = 800;
	static Main frame;
	Start start;
	Play Play;
	
	public Main() {
		frame = this;
		setSize(WIDTH,HIGHT);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		start = new Start();
	    add(start);
		setVisible(true);
	}
		
	public static void main(String[] args){
		new Main();
	}

}
