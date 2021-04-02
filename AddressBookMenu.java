/*Added menu object into list*/
public class AddressBookMenu extends Menu {
	static int i=1;
	public void initialize() {
		setTitle("_______Address Book_______");
		
		
		menuItem mi1=new menuItem("Create"); 
		map.put(i++,mi1);  //added "create" menuItem object in list
	    mi1.setAction(new ActionCreate());
		
		menuItem mi2=new menuItem("Display"); 
		map.put(i++,mi2);
		mi2.setAction(new ActionDisplay());
		
		menuItem mi3=new menuItem("Delete"); 
		map.put(i++,mi3);
		mi3.setAction(new ActionDelete());
		
		menuItem mi4=new menuItem("Find"); 
		map.put(i++,mi4);
		mi4.setAction(new ActionFind());
		
		menuItem mi5=new menuItem("Update"); 
		map.put(i++,mi5);
		mi5.setAction(new ActionUpdate());
		
		
		
	}
}