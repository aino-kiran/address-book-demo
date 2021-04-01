/*This program provide new menu entries and
 * Add objects into list  */
public class Restaurant extends Menu {
	public void init() {
	setTitle("_______Restaurant Menu_______"); //this is base class method
	
	restauruntMenuItem mi1=new restauruntMenuItem("Tea",20); 
	MI.add(mi1);  //added Restaurunt_Menu_Item object in list
	           
	restauruntMenuItem mi2=new restauruntMenuItem("Coffee",35); 
	MI.add(mi2);
	
	restauruntMenuItem mi3=new restauruntMenuItem("Toast Butter",50); 
	MI.add(mi3);
	

	}	

}
