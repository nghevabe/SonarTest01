/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsingleton;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Main {
    
    static ArrayList<Student> lstStudent = new ArrayList<>();
    
    public static void main(String[] args) {
         
        
          Student student1 = new Student("Linh","Electric");
          Student student2 = new Student("Trang","HR");
          Student student3 = new Student("Hằng","Bussines");
          
          lstStudent.add(student1);
          lstStudent.add(student2);
          lstStudent.add(student3);
        
          Sigleton.GetInstance().AddStudent("Linh", "Electric");
          Sigleton.GetInstance().AddStudent("Trang", "HR");
          Sigleton.GetInstance().AddStudent("Hằng", "Bussines");
          
          for (int i=0;i<Sigleton.GetInstance().getLstStudent().size();i++)
          {
              
              String ten = Sigleton.GetInstance().getLstStudent().get(i).getName();
              
              String mon = Sigleton.GetInstance().getLstStudent().get(i).getSubject();
              
              System.out.println("Ten: "+ten);
              System.out.println("Mon: "+mon);
              System.out.println("");
              
          }
       
    }
        
    
}
