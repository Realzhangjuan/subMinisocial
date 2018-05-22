package Driver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LoginController {
    public static boolean auth (String uName, String password) throws IOException, LoginException {
	
    	 File loginFile = new File( "src/Driver/minilogin.txt" ) ;
	  
		Scanner scanner = new Scanner(loginFile) ;
	     
		boolean correctUsername=false;
		int count=1;
		
		while(scanner.hasNext()) {
			String element = scanner.next() ;
		
			if(count%2==1){ 
				if(uName.equals(element)){
					correctUsername=true;	
				}
				else{
					correctUsername=false;
				}
			}
			
			if(correctUsername  && count%2==0 && password.equals(element)){
				return true ;
			}
			
			
		
			count++;
		}
		
		
		throw new LoginException("no such user");
	
//	     return false ;	     
 	}  
}
