/*To display Headline and Menu*/
import java.util.*; 
public class Menu{
	String title;
	int i=1;
	public void setTitle(String title){
		 this.title= title;
	}
	
	public String getTitle(){
		return title;
	}
	
	List<MenuItem> MI=new ArrayList<MenuItem>();  //List for menu items
    
    void display() {
    	System.out.println(title);
    	for(MenuItem Item:MI) {  
    		  System.out.print("\n"+i+": "); 
    		  Item.display();
    		  i++;
    	}
    }

}
