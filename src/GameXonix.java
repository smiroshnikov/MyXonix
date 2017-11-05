import java.awt.BorderLayout;

import javax.swing.JFrame;

public class GameXonix extends JFrame{

	private static final long serialVersionUID = 3072692890472331152L;
	private static final String PROGRAM_TITLE = "My Xonix";
	final static int BOARD_WIDTH = 800;
	final static int BOARD_HEIGHT = 600;
	
	Canvas canvas;
	
	public static void main(String[] args) {
		GameXonix game = new GameXonix();
		Cube c = new Cube();
		c.printShit();

	}
	
	GameXonix(){
		canvas = new Canvas();
		add(BorderLayout.CENTER,canvas);
		
		setTitle(PROGRAM_TITLE);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(BOARD_WIDTH,BOARD_HEIGHT);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);	
	}
		
	public class Cude {
		int x = BOARD_WIDTH +1;
		
	}
}



