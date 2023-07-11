package p560;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

   public static void main(String[] args) {
      List<String> list =new ArrayList<String>();
      
      list.add("Java");
      list.add("Jdbc");
      list.add("Servlet/JSP");
      list.add(2,"Database");
      list.add("iBATIS");
      list.add("Java");  //list 동일한 데이터삽입가능 ,데이터순서 있음
      
      int size=list.size();
      System.out.println("총 객체수:"+size);
      System.out.println();
      
      String skill=list.get(2);
      System.out.println("2: "+skill);
      System.out.println();
      
      for(int i=0; i<list.size(); i++) {
         String str=list.get(i);
         System.out.println(i+":"+str);
      }
      System.out.println();
      
      list.remove(2);
      list.remove(2);//삭제하고싶은값 제거
      list.remove("iBATIS");
      
      for(int i=0; i<list.size(); i++) {
         String str=list.get(i);
         System.out.println(i+":"+str);
      }
      
   }

}