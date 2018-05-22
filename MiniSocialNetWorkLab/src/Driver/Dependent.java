package Driver;

import java.util.ArrayList;

public class Dependent extends UserNodes {

	ArrayList<String> parents ; 
	private ArrayList<UserNodes> classmates;
	
	
	public Dependent(String userName, String userStatus, int userAge,String parent1,String parent2 ) throws NoSuchAgeException {
		super(userName, userStatus, userAge);
		
		parents = new ArrayList<String>();
		classmates = new ArrayList<UserNodes>();
		
		//
	
		parents.add(parent1);
		parents.add(parent2);
	}
	
	
	/////////// 1...checkAge return Type is UserNodes, return value is name.Age > 16 user is adult. 2 < Age < 16, user is dependent. 
	

	
	//young dependent friends come from different family, their ages differences can not be more than 3 years. 
	
	
	
	// dependent makes friend check their age  
	public boolean makeFriend(UserNodes friend){
		
	
        if ( friend.getAge() >2 &&  friend.getAge() < 16 && Math.abs(friend.getAge()-this.getAge() ) <=3) {
        	    	
        	friends.add( friend) ;
        	return true;
        }
		//		ArrayList<String>fridentsNames = UerNodes.getfriend();
		
		return false;

	}


	public ArrayList< String > getParents()
	{
		return parents;
	}


	public ArrayList<UserNodes> getClassmates() {
		return classmates;
	}


	public void setClassmates(ArrayList<UserNodes> classmates) {
		this.classmates = classmates;
	}	
	
//	@Override
//	public boolean checkAge(UserNodes friend) { 
//		
//		if ( friend.getAge() > 2 && friend.getAge() < 16 ) {
//			System.out.println("This is a dependent user. " + friend.getName() );
//			return true; 
//		}
//		return false; 
//				
//	
//	}
	
	
	
	
}
