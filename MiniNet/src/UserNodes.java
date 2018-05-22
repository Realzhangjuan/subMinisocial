//import java.util.Scanner;
//import java.io.*;
//
//
//public class UserNodes {
//	
//	
//	//public int age ;
//	public String name ;
//	//public String State ;
//	
//	
//	public UserNodes(String username){
//
//		name = username ;
//		
//		public String getname (){ 
//			return name;	
//		}
//		
//		
//		//input object 
//        String readIn ( String name) {
//
//			System.out.println("enter your name: ");
//			Scanner scRead = new Scanner (System.in) ;
//			 String name = scRead.nextLine();
//			 return ;
//		}
//		
//		
//		public String listAllUser () {
//		
//		       DataOutputStream listAllUser = new DataOutputStream(new FileOutputStream( "allUserList.dat")) ;
//		       listAllUser.writeUTF (readIn()) ;
//		       
//				
//	
//				
//		
//		
//		}
//		
//		
//		
//		
//		
//		
//	}
//	
//	
//	
//	
//
//	
//
//}
package Driver;
import java.util.ArrayList;


public class UserNodes  {
 

	private static String name;
	private static String status ;
	private static int age;
	 
	
	
	/*
	public UserNodes (String userName, String userStatus, int userAge, String fridentsName) 
	{
		
		name = userName;
	status = userStatus ;
	age = userAge ;
	this.fridentsName = fridentsName ; 

	
	}
	*/
	
	public UserNodes (String userName, String userStatus, int userAge) 
	{
		
		name = userName;
		status = userStatus ;
		age = userAge ;
	
	}
	 
	  
	public String getName() {
		return UserNodes.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return UserNodes.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getAge() {
		return age;  
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	public void deleteFrident () { 
		
			}
	
//	public boolean checkIfFridents () {
	
		
//	return 
		
		
	//}
	
	
	

}













