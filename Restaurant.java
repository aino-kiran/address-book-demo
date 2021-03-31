
public class Restaurant extends Restaurant_menu {
	public void init() {
	setTitle("_______Restaurant Menu_______");
	
	
	Restaurunt_Menu_Item m1=new Restaurunt_Menu_Item("Tea",20); 
	map.put(m1.price,m1.title);  //added "create" menuItem object in list
	           
	Restaurunt_Menu_Item m2=new Restaurunt_Menu_Item("Coffee",35); 
	map.put(m2.price,m2.title);
	
	Restaurunt_Menu_Item m3=new Restaurunt_Menu_Item("Toast Butter",50); 
	map.put(m3.price,m3.title);
	}	

}
