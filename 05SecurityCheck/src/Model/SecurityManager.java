/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SecurityManager {
    private KeyCardCheck keyCardCheck;
    private PinCodeCheck pinCodeCheck;

    public SecurityManager(KeyCardCheck keyCardCheck, PinCodeCheck pinCodeCheck)
    {
       this.keyCardCheck = keyCardCheck;
       this.pinCodeCheck = pinCodeCheck;
    }

    public void Check()
    {
        System.out.println("Choose option: 1 - KeyCard, 2 - PinCode:");
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();
        switch (option)
        {
            case 1:
                System.out.println(this.keyCardCheck.ValidateUser());
                break;
            case 2:
                System.out.println(this.pinCodeCheck.ValidateUser());
                break;
        }
    }
}
