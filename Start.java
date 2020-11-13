import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Start extends JLabel {

	

	JLabel p = new JLabel (new ImageIcon("Image/Start.png"));
	
	Image backgound;
	Image logo;
	
	
	public Start() {
		backgound = new ImageIcon("Image/page.png").getImage();
		logo = new ImageIcon("Image/Logo.png").getImage();

		
		p.setBounds(300,700,200,100);
		add(p);
		Main.frame.repaint();
		
		p.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				Main.frame.remove(Main.frame.start);
				if(Main.frame.Play == null){
					Main.frame.Play = new Play();
				}
				Main.frame.add(Main.frame.Play);
				Main.frame.Play.setSize(Main.WIDTH,Main.HIGHT);
				Main.frame.Play.requestFocusInWindow();
				Main.frame.repaint();
			}
		});
    }

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(backgound,0,0,800,800,this);
		g.drawImage(logo,200,30,this);
	}
}