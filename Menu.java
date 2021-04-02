/*To display Headline and Menu Items*/
import java.util.*; 
public class Menu{
	String title;
	int i=1;
	public void setTitle(String title){
		 this.title= title;
		 i++;
	}
	
	public String getTitle(){
		return title;
	}
	
    HashMap<Integer,menuItem> map=new HashMap<Integer,menuItem>();  //List for menu items
    
    void display() {
    	System.out.println(title);
    	
    	Iterator <Integer> it = map.keySet().iterator();    //keySet is a method  
    	
        while(it.hasNext())                             //display operation menus
    	{  
    	 int key=(int)it.next();  
    	 System.out.println(key+": "+map.get(key).title);  
    	}   	
    }
    
    public void getMenu() {
    	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Choice:");
		int ch=sc.nextInt();
		menuItem mi=map.get(ch);
        Object obj1=mi.getAction().execute();
        if(obj1!=null)
        {
        	display();
        	getMenu();
        }
        
	}

}
