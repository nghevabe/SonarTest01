/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsingleton;

/**
 *
 * @author admin
 */
public class Student {
    
 
    
    private String name;
    private String subject;
    
    public Student(String name, String subject){
        
        this.name = name;
        this.subject = subject;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    

    
    
}
