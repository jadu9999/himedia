package textfield;

import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Jframe {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		
		jf.setBounds(600, 300, 500, 200);	
	
		jf.setTitle("login");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		jf.setVisible(true);
		jf.setLayout(null);
		
		//=-=-===========================
		JLabel jl = new JLabel("아이디 : ");
		jl.setSize(80,30);
		jl.setLocation(30, 30);
		jl.setHorizontalAlignment(JLabel.CENTER);	
		jl.setVisible(true);
		jf.add(jl);
			
		jl = new JLabel("비밀번호 : ");
		jl.setSize(80,30);
		jl.setLocation(30, 70);
		jl.setHorizontalAlignment(JLabel.CENTER);	
		jf.add(jl);	
		
		JTextField jt = new JTextField();
		jt.setSize(150,30);
		jt.setLocation(110, 30);
		jt.setVisible(true);
		jf.add(jt);
		//======================================
				
		jt = new JTextField();
		jt.setSize(150,30);
		jt.setLocation(110, 70);
		jt.setVisible(true);
		jf.add(jt);
		
	}
}
