/*Used to perform Display operation, it display all user entries */
public class ActionDisplay extends ActionCreate implements Action {

	@Override
	public Object execute() {
		// TODO Auto-generated method stub
		System.out.print("This is ActionDisplay\n");
		display1();
		
		/*for (ActionCreate str1 : personInfoListObj)
	      { 		      
	           System.out.println("\nName: "+str1.name); 
	           System.out.println("Address: "+str1.street+", "+str1.city+", "+str1.state+", "+str1.country+", "+str1.zipCode+"; "); 
	      }
		for (int i = 0; i < personInfoListObj.size();i++) 
	      { 		      
	          System.out.println(personInfoListObj.get(i).name); 		
	      }   */

		
		return personInfoListObj;
	}

}
