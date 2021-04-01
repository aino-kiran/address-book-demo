/*Added menu object into list*/
public class AddressBookMenu extends Menu {
	public void initialize() {
		setTitle("_______Address Book_______");
		
		
		menuItem mi1=new menuItem("Create"); 
		MI.add(mi1);  //added "create" menuItem object in list
		           
		menuItem mi2=new menuItem("Display"); 
		MI.add(mi2);
		
		menuItem mi3=new menuItem("Delete"); 
		MI.add(mi3);
		
		menuItem mi4=new menuItem("Find"); 
		MI.add(mi4);
		
		menuItem mi5=new menuItem("Update"); 
		MI.add(mi5);
		
		
		
	}
}