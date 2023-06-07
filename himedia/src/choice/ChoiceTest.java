package choice;

import java.awt.Choice;
import java.awt.Frame;

public class ChoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("Choice - Select");
		f.setSize(300,200);
		f.setLayout(null);
		
		Choice day = new Choice();
		day.add("sun");
		day.add("mon");
		day.add("tue");
		day.add("wed");
		day.add("thu");
		day.add("fri");
		day.add("sat");
		
		day.setSize(100,500);
		day.setLocation(100,70);
		
		f.add(day);
		f.setVisible(true);

	}

}
