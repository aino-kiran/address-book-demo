/*To display Headline and Menu Items*/
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
	
	List<restauruntMenuItem> MI=new ArrayList<restauruntMenuItem>();  //List for menu items
    
    void display() {
    	System.out.println(title);
    	System.out.println("Do you want to display Serial no. for menu items?: y/n");
		Scanner sc = new Scanner(System.in);
		char s=sc.next().charAt(0);
		
    	for(restauruntMenuItem Item:MI) {  
    		  int compareTwo = Character.compare(s, 'y'); 
    		  if(compareTwo==0) {          //if want display menu with serial no.
    			  System.out.print("\n"+i+": "); 
        		  Item.display();
        		  i++;
    		  }
    		  else {
    			  System.out.print("\n");
    			  Item.display(); 
    		  }
    		  
    	}
    }

}
