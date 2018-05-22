
package Driver;

import java.util.ArrayList;

public class AdultUser extends PeopleNodes 

{

	private String couple;
	private ArrayList<PeopleNodes> colleages;
	
	public AdultUser (String userName, String userStatus, int userAge) throws NoSuchAgeException {
		super(userName, userStatus, userAge);
		couple="";
		
		//intialize arraylist
		friends = new ArrayList<PeopleNodes>();
		setColleages(new ArrayList<PeopleNodes>());
	}
	
	
	//check if one family from two : parent1 and parent2 
	//
	
	
	public boolean makeFriend(PeopleNodes friend){
		
		
		
		if(friend.getAge( )>=16 ){
			friends.add( friend) ;
			return true; 
		}
		
		return false;
//		ArrayList<String>fridentsNames = UerNodes.getfriend();
		

	}


	public String getCouple() {
		return couple;
	}


	public void setCouple(String couple) {
		this.couple = couple;
	}


	public ArrayList<UserNodes> getColleages() {
		return colleages;
	}


	public void setColleages(ArrayList<UserNodes> colleages) {
		this.colleages = colleages;
	}
	

	

}