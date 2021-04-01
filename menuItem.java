/*To set menu items title */
public class menuItem {
	String title;
	public menuItem(String title){
		 this.title= title;
	}
	public String getTitle(){
		return title;
	}
	void display() {
    	System.out.print(this.title);
    }

}
