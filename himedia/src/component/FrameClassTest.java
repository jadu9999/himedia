package component;

import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Dimension;

public class FrameClassTest extends WindowAdapter{
	private Frame f;
	
	public void startFrame() {
		Frame f = new Frame("Login");
		f.setSize(300,200);
		
		f.addWindowListener(this);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension ScreenSize = tk.getScreenSize();
		f.setLocation(ScreenSize.width/2-150, ScreenSize.height/2-100);
		f.setVisible(true);
	}
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public static void main(String[] args) {
		FrameClassTest t = new FrameClassTest();
		t.startFrame();
		
		

	}

}
