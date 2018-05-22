package Driver;
import java.util.ArrayList;


public abstract class PeopleNodes  {
 

	public String name;
	public String image ;
	public String status ;
	public String gender ;
	public String states ;
	public int age;
	ArrayList<PeopleNodes> friends;
	 

	//UserNodes constructor for user own, no friends.
	public PeopleNodes (String peopleName, String peopleStatus, int peopleAge) throws NoSuchAgeException 
	{
		if(peopleAge<0 || peopleAge >150){
			throw new NoSuchAgeException("no such age");
		}
		
		name = peopleName;
		status = peopleStatus ;
		age = peopleAge ;
	
	}
	 
	  
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getAge() {
		return this.age;  
	}
	public void setAge(int age) {
		this.age = age;
	}
	//Check Age to decide the the user is adult or dependent. 
	
	// public UserNodes checkAge (String age ) {
		
		
//	}
	
//	public UserNodes checkAge(String userName) { 
//		
//		if ( UserNodes.getAge() > 2 && UserNodes.getAge() < 16 ) {
//			System.out.println("This is a dependent user. " + userName );
//			}
//	
//	
//	
	public ArrayList<peopleNodes> getFriends() { 
		return friends;
	}
	

//	public boolean checkAge(UserNodes friend) { 
//		
//		if( friend.getAge() >= 16 ) {
//			
//			System.out.println("This is a adult user. ");
//		
//			return true;
//		}
//		return false; 
//			
//	}


	public boolean makeFriend(PeopleNodes peopleNodes) throws Exception {
		
		if(this.getAge() <3 || peopleNodes.getAge()<3  ){
			throw new TooYoungException("too young to have friends ");
		}
		
		if( (this.getAge() >16 && peopleNodes.getAge()<=16) ||  (this.getAge() <=16 && peopleNodes.getAge()>16)   ){
			throw new NotToBeFriendsException("can not be friends since large age gap ");
		}
		if( peopleNodes.getAge() <=16 && this.getAge() <=16 && Math.abs(peopleNodes.getAge()-this.getAge() ) >=3){
			throw new NotToBeFriendsException("more than 3 years there between them");
		}
		
		this.getFriends().add(peopleNodes);
		
		return true;
	}
	
	public boolean makeCouple(PeopleNodes peopleNodes) throws Exception {
		
		if(this.getAge()<=16 || peopleNodes.getAge() <=16 ){
			throw new NotToBeCoupleException("Cannot be couple since the age is less than 17");
		}
		
		AdultUser adult = (AdultUser) this;
		if( !adult.getCouple().equals("") ){
			throw new NoAvailableException("Cannot be in two couple relations in one time");
		}
		AdultUser adult2 = (AdultUser) peopleNodes;
		if(! adult2.getCouple().equals("") ){
			throw new NoAvailableException("Cannot be in two couple realtuion in one time");
		}
		
		adult.setCouple(peopleNodes.getName());
		adult2.setCouple(this.getName());
		
		return true;
	}
	
	public boolean makeCollegaues(PeopleNodes peopleNodes) throws Exception {
		
		if(this.getAge()<=16 || peopleNodes.getAge() <=16 ){
			throw new NotToBeColleaguesException("Child can not be in colleague relation");
		}
		
		AdultUser adult1 = (AdultUser) this;
		AdultUser adult2 = (AdultUser) peopleNodes;
		adult1.getColleages().add(adult2);
		adult2.getColleages().add(adult1);
		
		return true;
	}
	
	public boolean makeClassmates(PeoplerNodes peopleNodes) throws Exception {
		
		if(this.getAge()<=2 || peopleNodes.getAge() <=2){
			throw new NotToBeClassmatesException("Age less than 2 can not be classmates");
		}
		
		if(this.getAge()>16 || peopleNodes.getAge() >16){
			return false;
		}
		
		Dependent depedent1 = (Dependent) this;
		Dependent depedent2 = (Dependent) peopleNodes;
		depedent1.getClassmates().add(depedent2);
		depedent2.getClassmates().add(depedent1);
				
		return true;

	}

}












