/*This is derived class of MenuItem 
 * used to take entry's of menu and price  */
public class RestauruntMenuItem extends MenuItem{
	int price;
	public RestauruntMenuItem(String title,int price ){
		 super(title);  //called constructor of super class
		 this.price=price;
	}
	void display() {
    	System.out.print(super.title+": "+price);
    }

}
