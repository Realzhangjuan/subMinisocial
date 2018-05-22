package Driver;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class RelationDataController {
	
		File relation = new File( "src/Driver/relation.txt" ) ;
	
		Scanner scanner = new Scanner(relation) ;
		
		while(scanner.hasNext()) {
				scanner.useDelimiter(" ");
		String element = scanner.next() ;
			
				StringTokenizer st = new StringTokenizer(" ") ;
				
				int indexRelation = 0 ;
			while (st.hasMoreElements()){
					indexRelation++ ; 
				if (indexRelation % 3 == 1 && indexRelation.getString()=="friend"){					
					peopleNodes[i] and peopleNodes[i+1] in friends relation ;			
				}	
			
				if(indexRelation % 3 == 1 && indexRelation.getString() == "couple"){
					peopleNodes[i] and peopleNodes[i+1] in couple relation ;				
				}	
				
				if(indexRelation % 3 == 1 && indexRelation.getString() == "parent"){
					peopleNodes[i] and peopleNodes[i+1] in parent relation;
				}
				
		
				
				

}
