package adapter24;

import java.awt.Button;
import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowTest extends WindowAdapter{
	private Frame frame;
	private Button button1,button2,button3;
	
	public FlowTest() {
		frame = new Frame("adapter example");
		button1 = new Button("OK");
		button2 = new Button("Open");
		button3 = new Button("Close");
	}
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	public void startFrame() {
		frame.addWindowFocusListener(this);
		frame.setLayout(new FlowLayout());
		
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.setSize(300,300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlowTest g = new FlowTest();
		g.startFrame();

	}

}
