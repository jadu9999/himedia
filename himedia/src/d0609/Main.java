package d0609;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;



public class Main extends WindowAdapter implements ActionListener {
   private Frame f;
   private TextField tfId, tfPwd, tfMsg;
   private Button bLogin;
   
   private MemberDAO dao;

   public Main() {
	   
	   dao = new MemberDAO();
	   
      f = new Frame("Login");
      f.setSize(500, 300);
      f.setLayout(null);
      
      

      Label lid = new Label("ID : ");
      lid.setBounds(50, 50, 100, 40);

      tfId = new TextField("id");
      tfId.setBounds(160, 60, 190, 40);

      Label lpwd = new Label("Password : ");
      lpwd.setBounds(50, 130, 100, 40);

      tfPwd = new TextField("password");
      tfPwd.setBounds(160, 130, 190, 40);

      bLogin = new Button("Login");
      bLogin.setBounds(380, 90, 50, 50);
      bLogin.addActionListener(this);

      tfMsg = new TextField("message");
      tfMsg.setBounds(50, 180, 350, 40);
      tfMsg.setEditable(false);
      tfMsg.setFocusable(false);//포커싱x

      f.add(lid);
      f.add(tfId);
      f.add(lpwd);
      f.add(tfPwd);
      f.add(bLogin);
      f.add(tfMsg);

      f.setVisible(true);
   }

   public static void main(String[] args) {
        Main m= new Main();
      new Main();
   }
   
   public void windowClosing(WindowEvent e) {
	   System.out.println(e.getComponent());
   }
   @Override
   public void actionPerformed(ActionEvent e) {
      
      System.out.println("Click!");
      System.out.println(tfId.getText() + " ");
      System.out.println(tfPwd.getText() + " ");
      
      String strId = tfId.getText();
      ArrayList<MemberVo> list = dao.list(strId);
		
    if(list.size()==1) {
			MemberVo data = (MemberVo) list.get(0);
			String id = data.getId();
			String pwd = data.getPassword();
			
			
			
			Frame fMain = new Frame("메인프레임");
			fMain.setBounds(200,200,200,200);
			fMain.setVisible(true);
			
			System.out.println("DB ==> " + id + " : " + pwd);
			
			if(tfPwd.getText().equals(pwd)) {
				System.out.println("로그인이 되었습니다.");
			    tfMsg.setText("로그인이 되었습니다!");
			}else {
				System.out.println("다시 입력하세요.");
				tfMsg.setText("다시 입력하세요");
			}
			
   }else {
	   tfMsg.setText("ID가 틀렸습니다. 다시 입력하세요.");
   }

}
}