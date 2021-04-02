/*Used to perform create operation, its take new user entries */
import java.util.*;
public class ActionCreate extends PersonAddressInfo implements Action {

	@Override
	public Object execute() {
		Scanner sc=new Scanner(System.in);
		ActionCreate obj=new ActionCreate();
		
		System.out.println("Enter Name:");
		obj.name=sc.nextLine();
		
		System.out.println("Enter Street:");
		obj.street=sc.nextLine();
		
		System.out.println("Enter City:");
		obj.city=sc.nextLine();
		
		System.out.println("Enter State:");
		obj.state=sc.nextLine();
		
		System.out.println("Enter Country:");
		obj.country=sc.nextLine();
		
		System.out.println("Enter ZipCode:");
		obj.zipCode=sc.nextInt();
		
		System.out.print("New Entry Successfully Done..\n");
		
		personInfoListObj.add(obj); //store object in arrayList 
		
		
		return personInfoListObj;
	}
   
	public void display1() {
		for (ActionCreate str1 : personInfoListObj)
	      { 		      
	           System.out.println("\nName: "+str1.name); 
	           System.out.println("Address: "+str1.street+", "+str1.city+", "+str1.state+", "+str1.country+", "+str1.zipCode+"; "); 
	      }
		}

}
