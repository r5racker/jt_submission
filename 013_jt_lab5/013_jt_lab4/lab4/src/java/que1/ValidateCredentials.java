/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que1;

/**
 *
 * @author user1
 */
public class ValidateCredentials {
    String server_url;
    String s_username;
    String s_password;
    ValidateCredentials(String url,String unm,String passwd){
        server_url=url;
        s_username=unm;
        s_password=passwd;
    }
    
    boolean isValid(String username,String password){
        if(username.compareTo("user1")==0 && password.compareTo("user10702")==0){
            return true;
        }
        else
            return false;
        
    }
}
