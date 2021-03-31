import java.util.*;
public class Restaurant_menu {
		
		String title;
		public void setTitle(String title){
			 this.title= title;
		}
		
		public String getTitle(){
			return title;
		}
		
		HashMap<Integer, String> map = new HashMap<Integer, String>(); 
	    void display() {
	    	System.out.println(title);
	    	Iterator <Integer> it = map.keySet().iterator();  
	    	while(it.hasNext()){  
		    	int key=(int)it.next();  
		    	System.out.println(map.get(key)+": "+"Rs."+key);  	
	    	}  
	    }

}
