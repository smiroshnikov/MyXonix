import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Canvas extends JPanel {


	public final static int BOX_SIZE = 100;
	public final static int BOX_THICKNESS = BOX_SIZE/5;

//	public static int getBOX_SIZE() {
//		return BOX_SIZE;
//	}

	public int getBOX_THICKNESS() {
		return BOX_THICKNESS;
	}

	@Override
	public void paint (Graphics g){
		super.paint(g);
		int x = 2;
		int y = 4;
		g.setColor(new Color (0));
		g.fillRect(x*BOX_SIZE,y*BOX_SIZE,BOX_SIZE,BOX_SIZE);
		g.setColor(new Color(0x00a8a8));
		g.fillRect(x*BOX_SIZE+BOX_THICKNESS, y*BOX_SIZE+BOX_THICKNESS,
				BOX_SIZE-2*BOX_THICKNESS, BOX_SIZE-2*BOX_THICKNESS); 

		System.out.printf("debug: x coordinates  %d",x*BOX_SIZE);
	}

}

