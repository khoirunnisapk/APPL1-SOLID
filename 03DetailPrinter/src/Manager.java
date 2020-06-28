
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Manager extends Employee {
        List<String> Documents;
    public Manager(String name, List<String> documents) {
        super(name);
        this.Documents = documents;
    }
        
    public List<String> getDocuments(){
        return this.Documents;
    }
    public String ToString(){
        return super.ToString() + System.lineSeparator() + String.join(System.lineSeparator(), this.Documents);
    }
    
}
