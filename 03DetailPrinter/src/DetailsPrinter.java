
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
public class DetailsPrinter {
    private List<Employee> employees;

        public DetailsPrinter(List<Employee> employees)
        {
            this.employees = employees;
        }

        public void printDetails()
        {
            for(int i = 0; i<employees.size(); i++){
                System.out.println(employees.get(i).ToString());
            }

        }
}
