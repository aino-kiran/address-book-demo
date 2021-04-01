/*This program provide new menu entries and
 * Add objects into list  */
public class Restaurant extends Menu {
	public void init() {
	setTitle("_______Restaurant Menu_______"); //this is base class method
	
	RestauruntMenuItem mi1=new RestauruntMenuItem("Tea",20); 
	MI.add(mi1);  //added Restaurunt_Menu_Item object in list
	           
	RestauruntMenuItem mi2=new RestauruntMenuItem("Coffee",35); 
	MI.add(mi2);
	
	RestauruntMenuItem mi3=new RestauruntMenuItem("Toast Butter",50); 
	MI.add(mi3);
	

	}	

}
