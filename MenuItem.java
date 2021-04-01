/*To set menu items title */
public class MenuItem {
	String title;
	public MenuItem(String title){
		 this.title= title;
	}
	public String getTitle(){
		return title;
	}
	void display() {
    	System.out.print(this.title);
    }

}
