package Driver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PeopleData {
	
	ArrayList<PeopleNodes> peopledata;
	
	////////// For keep track of the information, use the key value link to the profile. 
	////////// How to show the each time updated information.
	////////// When you face these questions how do you solve them?What is your each step's 
	////////// coding the concrete codes. 
	
	public PeopleData () throws IOException {
		
		public static void main(String[] args) throws Exception {
		public void outData() throws IOException {
		peopledata= new ArrayList<PeopleNodes>();
		
		
		File people = new File( "src/Driver/people.txt" ) ;
		
		BufferedReader file = new BufferedReader(new FileReader("src/Driver/people.txt"));

//		String elementInPeople = file.readLine();

//		while(elementInPeople!=null){
//
//
//			elementInPeople = file.readLine();
//			
//			
//			int	elementOrder = 1	;
//			if()	
		}
		  
		Scanner scanner = new Scanner(file) ;
		
		while(scanner.hasNext()) {
			scanner.useDelimiter("\n");
		String element = scanner.next() ;
			System.out.println(element);
			StringTokenizer st = new StringTokenizer("\n") ;
			int index = 0 ;
			while (st.hasMoreElements()){
				
				//System.out.println(st.nextElement());
				 Object peopleName = st.nextElement();
				 	index++;
				 Object peopleImage = st.nextElement();
				 	index++;
				 Object peopleStatus = st.nextElement();
				 	index++;				
				 Object peopleGender = st.nextElement() ;
				 	index++;
				 Object peopleAge = st.nextElement();
				 	index++;
				 Object peopleStates = st.nextElement() ;	 
                 	index++;
			}	
			
		
			if ( peopleAge >16)
						
				data.add(new AdultUser (index, element));
			
			if(peopleAge < 16 && peopleAge > 3)
				
				data.add(new Dependent(index,element)) ;
			 
			if (peopleAge < 3 && peopleAge > 0) ;
			
				data.add(new YoungChild(index, element));
	
				
//		data.add(new AdultUser("Alan","Studnet",18));
//		data.add(new AdultUser("Ellen","Teacher",28));
//		data.add(new AdultUser("Jay","professor",38));
		
		///////realize the delete, add ,select(boolean)......? through array List? 
		
		//thread
		//operating system
		
		//add friendship
//		data.get(0).makeFriend(data.get(1)); 
	
	
	}

}
