/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author dipenpatel
 */
public class ProfessorHistory {
    private ArrayList<Professor> ProfessorHistory;
    
    //static Map<String,String> hashmap=new HashMap<>();
//
//    public static Map<String, String> getHashmap() {
//        return hashmap;
//    }
    
    public ProfessorHistory(){
        this.ProfessorHistory = new ArrayList<Professor>();
    }

    public ArrayList<Professor> getProfProfileHistory() {
        return ProfessorHistory;
    }

    public void setProfProfileHistory(ArrayList<Professor> ProfProfileHistory) {
        this.ProfessorHistory = ProfProfileHistory;
    }
    
    public Professor addPofessor(Professor professor){
        //Professor p = new Professor();
        ProfessorHistory.add(professor);
        return professor;
    }
    
    public Professor searchUserNameAndPassword(String userName, String password) {
        for (Professor p : ProfessorHistory) {
            if (p.getUserName().equals(userName) && p.getPassword().equals(password)) {
                return p;
            }
        }
        return null;
    }
//    public void addcourseProfessor(Course course,String Name){
//        if(Professor.getHashmap().containsKey(Name)) {
//            
//        }
//        } 
}
