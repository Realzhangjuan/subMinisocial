package Driver;

import java.util.ArrayList;

public class YoungChild extends UserNodes {
	
	ArrayList<String> parents ; 

	public YoungChild(String userName, String userStatus, int userAge, String parent1,String parent2) throws NoSuchAgeException {
		super(userName, userStatus, userAge);
		
		parents.add(parent1);
		parents.add(parent2);
		
	}

	public ArrayList< String > getParents()
	{
		return parents;
	}	
}
