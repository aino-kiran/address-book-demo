/*Added menu object into list*/
public class Address_Book_Menu extends Menu {
	public void initialize() {
		setTitle("_______Address Book_______");
		
		
		MenuItem mi1=new MenuItem("Create"); 
		MI.add(mi1);  //added "create" menuItem object in list
		           
		MenuItem mi2=new MenuItem("Display"); 
		MI.add(mi2);
		
		MenuItem mi3=new MenuItem("Delete"); 
		MI.add(mi3);
		
		MenuItem mi4=new MenuItem("Find"); 
		MI.add(mi4);
		
		MenuItem mi5=new MenuItem("Update"); 
		MI.add(mi5);
		
		
		
	}
}