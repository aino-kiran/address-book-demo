/*This is derived class of MenuItem 
 * used to take entry's of menu and price  */
public class restauruntMenuItem extends menuItem{
	int price;
	public restauruntMenuItem(String title,int price ){
		 super(title);  //called constructor of super class
		 this.price=price;
	}
	void display() {
    	System.out.print(super.title+": "+price);
    }

}
