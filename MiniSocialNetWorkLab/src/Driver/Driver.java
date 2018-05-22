/**
 * 
 */
/**
 * @author zhangjuan
 *
 */
package Driver;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.scene.shape.Rectangle;

public class Driver {
	
	public ArrayList<UserNodes> data ;
	
	public Driver () throws IOException {
	   data= (new UserData()).data;		
   }
	
	public void diverMenu(){
		Scanner sc = new Scanner ( System.in) ; 
			int userMenuOption;
		do{
			System.out.println("++++++++++++MiniNet++++++++ Menu+++++++++++++++++++++");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("1.   List everyone ;  ")  ;
			System.out.println("2.   Select two person, Are these two direct friends ;");
			System.out.println("3.  Exit   ");
		   // System.out.println("4.   Exit ");
		    System.out.println("");
		    System.out.println("Enter an option:   ");
			
		    userMenuOption = sc. nextInt() ;
	   	    switch (userMenuOption)
		    {
			    case 1: 
			    	 listEveryone() ;
			    	break;
			    case 2:
			    	checkIfFriends();
			    	break;
			    case 3:
			    	System.out.println("3. ")  ;
			    	break;
			    case 4: 
			    	System.out.println("EXIT ")  ;
			    	break;
			    	
			    default:
			    	System.out.println("Not a correct input");
		    }	    
		  } while( userMenuOption!= 4) ;
	       
	}  
		
	private  void listEveryone(){
		for(int i=0;i<data.size();i++){
			System.out.print(data.get(i).getName()+" ");
		}
		System.out.println();
		System.out.println();
	}
	
	private void checkIfFriends(){
		//get two person

		System.out.println("Input two Persons' names ( one name per line):");
		System.out.println("(ex:");
	    System.out.println("Jay");
	    System.out.println("Alan");
	    System.out.println(")");
		
		
		Scanner sc = new Scanner ( System.in) ; 
		String firstInput=sc.nextLine();
		String secondInput=sc.nextLine();
		
		
		UserNodes firstPerson=null;
		UserNodes secondPerson=null;
		for(int i = 0 ; i<data.size() ; i++ ) {
			if(data.get(i).getName().equals( firstInput) ){
				firstPerson = data.get(i);
			}
			if(data.get(i).getName().equals( secondInput) ){
				secondPerson=data.get(i);
			}
		}
		
		//check friends
		ArrayList<UserNodes> friends=firstPerson.getFriends();
		
		boolean found=false;
		
		
		//check if person NO.1 have person NO.2 in friend list
		for ( int i=0 ; i<friends.size() ; i++ ) {
			if (friends.get(i).getName()==secondPerson.getName()){
				found=true;
				break;
			}
		}
		
		friends=secondPerson.getFriends();
		
		
		//check if person two have person one in friend list
		for(int i=0;i<friends.size();i++){
			if(friends.get(i).getName()==firstPerson.getName()){
				found=true;
				break;
			}
		}
		
		if(found){
			System.out.println("They are friends.");
		}else{
			System.out.println("They are not friends.");
		}
		
	}
	

	
	
	
	

	public String addName (String name)
	{
		Scanner inputName = new Scanner (System.in) ;
		System.out.println(" Enter your name :   ") ;
	      name = inputName.next() ;
	      return name;	
	}

	
    public Boolean selectName( )
    { 
    	return true ; 

     } 
	 
	
	public String displaySelectedName( String selectedName) 
	{
		while( selectName())
		{
		System.out.println( selectedName);
		}
		
		return selectedName ;
		
	}
    
    
    public void updateSelectedUser()
    
    {
    	
    	
    }
    
    public void deleteSelectedUser()
    {
    	
    	
    	
    }
    
    
    public boolean checkIfDirectFriend () {
    	
    	return true;
    	
    	
    }
    
    
    
    
    
    public void connectTwoUser()
    {
//    	if 
    	
    	
    	
    }	
	
	
	

//	@Override

}


 















