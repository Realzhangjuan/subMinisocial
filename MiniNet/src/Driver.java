import java.util.Scanner;  





public class Driver {
	
	
	


	public static void main(String[] args) {
	
		
		System.out.println("      MiniNet Menu       ");
		System.out.println("1.   List everyone ;  ")  ;
		System.out.println("2.   Select a person ;");
		System.out.println("3.   Are these two direct frieds?  ");
	    System.out.println("4.   Exit ");
	    System.out.println("");
	    System.out.println("Enter an option:   ");
		
	
		Scanner input = new Scanner (System.in )  ;
		 int option = input.nextInt() ;
		
	    switch (option)
	    {
	    case 1: ListAllUser(); 
	    case 2: Select();
	    case 3: 
	    case 4: 
	    
	    
	    
		
		
		
		

	}

}
