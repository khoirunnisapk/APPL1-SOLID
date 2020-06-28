
import java.util.ArrayList;
import java.util.Arrays;

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
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Employee employee = new Employee("Name");
       List<String> documents = new ArrayList<String>();
       documents.add("doc1");
       documents.add("doc2");
       Manager manager = new Manager("Manager Name", documents);
       
       DetailsPrinter printer = new DetailsPrinter(Arrays.asList(employee, manager));
       printer.printDetails();
    }
    
}
