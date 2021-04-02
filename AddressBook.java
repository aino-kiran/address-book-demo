/**
*
* @author Intern 2 
* 
*  This is an Address Book application performs following operations:
*  1. New entry.
*  2. Display all records
*  3. Delete particular record
*  4. Find particular record
*  5. Update particular record
*    
*/
import java.util.*; 
public class AddressBook {
	
	
	public static void main(String arg[]) {
		
		AddressBookMenu abm=new AddressBookMenu();
		abm.initialize();
		abm.display();
		
		abm.getMenu();
		
		
		
		
		
	}

}
