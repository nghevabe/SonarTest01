/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsingleton;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class Sigleton {

    private static Sigleton instance;

    private ArrayList<Student> lstStudent;

    private Sigleton() {

        lstStudent = new ArrayList<>();

    }
    
    public static Sigleton GetInstance() {

        if (instance == null) {

            instance = new Sigleton();
        }
        return instance;
    }

    public void AddStudent(String ten, String mon) {

        Student student = new Student(ten, mon);
        lstStudent.add(student);
    }

    public ArrayList<Student> getLstStudent() {
        return lstStudent;
    }

    public void setLstStudent(ArrayList<Student> lstStudent) {
        this.lstStudent = lstStudent;
    }

}
