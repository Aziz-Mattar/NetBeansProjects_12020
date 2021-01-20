/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author aashgar
 */

//غالبا بكون سنغلتون
public class StudentMaker {
    private Student itStudent,
            engStudent,
            artStudent;
    //singleton
    private static StudentMaker studentMaker;

    private StudentMaker() {
        this.itStudent = new ItStudent();
        this.engStudent = new EngStudent();
        this.artStudent = new ArtStudent();
    }
    
    public static StudentMaker getStudentMaker(){
        if(studentMaker == null)
            studentMaker = new StudentMaker();
        return studentMaker;
    }
    public String showItStudent(){
        return this.itStudent.Show();
    }
    
    public String showEngStudent(){
        return this.engStudent.Show();
    }
    
    public String showArStudent(){
        return this.artStudent.Show();
    }
    
}
