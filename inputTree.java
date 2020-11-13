import java.awt.Graphics2D;
import java.util.LinkedList;
import sun.awt.RepaintArea;

public class inputTree {
	static LinkedList<Tree> g = new LinkedList<>();
	Tree temp;
        
	
	public inputTree() {
			for(int i = 0, a =-1; i < 26; i++) {
				if(i==3) {
					addTree(new Tree(a,-7));
					addTree(new Tree(a,443));
					addTree(new Tree(503,a));
					a+=30;
				}
//				else if(i==11 || i==12 || i==13) {
//					addTree(new Tree(a,-7));
//					addTree(new Tree(-7,a));
//					addTree(new Tree(a,600));
//					a+=30;
//				}
//				else if(i>15) {
//					a+=30;
//				}
				else {
					addTree(new Tree(a,-7));
					addTree(new Tree(-5,a));
					addTree(new Tree(a,650));
					addTree(new Tree(940,a));
					a+=30;
				}
			}
			

			
			addTree(new Tree(23,23));
			addTree(new Tree(53,23));
			
                        addTree(new Tree(143,23)); 			
			addTree(new Tree(143,53));
                        addTree(new Tree(143,83));
                        addTree(new Tree(143,113));
                        addTree(new Tree(143,143));
                        addTree(new Tree(143,173));
                        addTree(new Tree(143,193));
                        addTree(new Tree(143,213));
                        
                        
                        
                        
                        addTree(new Tree(83,233));
                        addTree(new Tree(113,233));
                        addTree(new Tree(143,233));
                        addTree(new Tree(173,233));
                        addTree(new Tree(203,233));
                        
                        addTree(new Tree(203,263));
                        addTree(new Tree(203,293));
                        addTree(new Tree(203,313));
                        addTree(new Tree(203,343));
                        
                        addTree(new Tree(113,343));
                        addTree(new Tree(143,343));
                        addTree(new Tree(173,343));
                      
                        //กลาง
                        addTree(new Tree(323,343));
                        addTree(new Tree(323,373));
                        addTree(new Tree(323,463));
                        addTree(new Tree(323,493));
                        addTree(new Tree(323,513));
                        addTree(new Tree(323,543));
                        addTree(new Tree(323,573));
                        addTree(new Tree(323,603));
                        addTree(new Tree(323,623));
                        
                        
                        addTree(new Tree(323,83));
                        addTree(new Tree(323,113));
                        addTree(new Tree(323,143));
                        addTree(new Tree(323,153));
                        addTree(new Tree(323,183));
                        addTree(new Tree(323,243));
                        addTree(new Tree(323,263));
                        addTree(new Tree(323,293));
                        addTree(new Tree(323,313));
                        addTree(new Tree(323,343));
                        
                        
                        //นอนบน1
                        addTree(new Tree(353,83));
                        addTree(new Tree(383,83));
                        addTree(new Tree(423,83));
                        addTree(new Tree(453,83));
                        addTree(new Tree(483,83));
                        addTree(new Tree(533,83));
                        addTree(new Tree(563,83));
                        addTree(new Tree(593,83));
                        addTree(new Tree(623,83));
                        //บนนอน2                       
                        addTree(new Tree(453,193));
                        addTree(new Tree(483,193));
                        addTree(new Tree(533,193));
                        addTree(new Tree(563,193));
                        addTree(new Tree(593,193));
                        addTree(new Tree(623,193));
                        addTree(new Tree(653,193));
                        addTree(new Tree(683,193));
                        addTree(new Tree(723,193));
                       //ขวา
                        addTree(new Tree(750,30));
                        addTree(new Tree(750,60));
                        addTree(new Tree(750,90));
                        addTree(new Tree(750,120));
                        addTree(new Tree(750,150));
                        addTree(new Tree(750,180));
                        addTree(new Tree(750,220));
                        addTree(new Tree(750,250));
                        addTree(new Tree(750,280));
                        addTree(new Tree(750,310));
                        addTree(new Tree(750,250));
                        addTree(new Tree(750,280));
                        addTree(new Tree(750,310));
                        addTree(new Tree(750,250));
                        addTree(new Tree(750,280));
                        addTree(new Tree(750,310));
                        addTree(new Tree(750,340));
                        addTree(new Tree(750,370));
                        addTree(new Tree(750,400));
                        addTree(new Tree(750,430));
                        addTree(new Tree(750,460));
                        addTree(new Tree(750,490));
                        addTree(new Tree(750,510));
                        addTree(new Tree(750,540));
                        addTree(new Tree(750,570));
                        //ล่างซ้าย
                        addTree(new Tree(143,343)); 			
			addTree(new Tree(143,373));
                        addTree(new Tree(143,403));
                        addTree(new Tree(143,433));
                        addTree(new Tree(143,463));
                        addTree(new Tree(143,493));
                        addTree(new Tree(143,513));
                        addTree(new Tree(143,543));
                        
                        //นอน3
                        addTree(new Tree(453,363));
                        addTree(new Tree(483,363));
                        addTree(new Tree(533,363));
                        addTree(new Tree(563,363));
                        addTree(new Tree(593,363));
                        addTree(new Tree(623,363));
                        addTree(new Tree(653,363));
                        addTree(new Tree(683,363));
                        addTree(new Tree(723,363));
                        
                        //ล่างขวา                        
                        addTree(new Tree(450,463));
                        addTree(new Tree(450,493));
                        addTree(new Tree(450,513));
                        addTree(new Tree(450,543));
                        addTree(new Tree(450,573));
                        addTree(new Tree(450,603));
                        addTree(new Tree(450,633));
                        
                        //นอน4
                        addTree(new Tree(563,450));
                        addTree(new Tree(593,450));
                        addTree(new Tree(623,450));
                        addTree(new Tree(653,450));
                        addTree(new Tree(683,450));
                        addTree(new Tree(723,450));
	}
	
	public void draw(Graphics2D g2d) {
		for(int i = 0; i< g.size(); i++) {
			temp = g.get(i);
			temp.draw(g2d);
		}
	}
	
	public void update() {
		for(int i = 0; i< g.size(); i++) {
			temp = g.get(i);
			temp.update();
		}
	}
	
	public void addTree(Tree tree) {
		g.add(tree);
	}
	
	public void removeTree(Tree tree) {
		g.remove(tree);
	}
	
	public static LinkedList<Tree> getTreeTouch() {
		return g;
	}
}
