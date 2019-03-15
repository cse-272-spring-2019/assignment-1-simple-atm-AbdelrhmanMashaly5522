/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author WEST
 */
public class LoginAuthientcation {
    String pass="1234";
    public boolean validate(String password){
        if (pass.equals(password))
           return true;
        else
            return false;
    }
    
}
