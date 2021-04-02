/*To set menu items title */
public class menuItem {
	String title;
	int order=0;
	Action action;  //Interface instance
	
	public menuItem(String title){   //sets operation name.
		 this.title= title;
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setAction(Action obj) { //set object of particular operation
	   action=obj;	
	}
	
	public Action getAction() {   //return particular operation object to call execute method
		
		return action;
	}
	
/*	void display() {
    	System.out.print(this.title);
    }
*/
}
