import java.util.Scanner;
import java.lang.*;
public class AddressBook {
	
	static void Delete() {
	    
	    
	  }
	public static void main(String arg[])
	{
		int choice=0;
		int i=0;
		char p;
		address add[] = new address[50];
		do
		{
			add[i]=new address();
			System.out.println("_________Address Book Menu_________");
			System.out.println("Enter your choice \n 1. Create New Address \n 2. Show All Addresses \n 3. Find Addresses Using Name \n 4. Delete Entry \n 5. Update Address \n 6. Exit");
			
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();
		
			switch(choice)
			{
				case 1:{
					System.out.println("Enter a Name: "); 
					add[i].name= sc.nextLine(); 
					add[i].Name= sc.nextLine(); 
					System.out.print("Enter a Street: "); 
					add[i].Street= sc.nextLine(); 
					System.out.print("Enter a City: "); 
					add[i].City= sc.nextLine(); 
					System.out.print("Enter a Country: "); 
					add[i].Country= sc.nextLine(); 
					System.out.print("Enter a Zipcode: "); 
					add[i].Zipcode= sc.nextLine(); 
					System.out.print("Succesfully Completed. \n \n");
					i++;
					break;
				}
				case 2:{
					int j;
					for(j=0;j<i;j++) {
						System.out.print("Name:"+add[j].Name+"\n"); 
						System.out.print("Address:"+add[j].Street+", "+add[j].City+", "+add[j].Country+", Pincode:"+add[j].Zipcode+". \n \n" ); 
					}
					try{
						System.out.print("Press Enter To Continue..");
						System.in.read();}
			        catch(Exception e){}
				
					 
					break;
					
				}
				case 3:{
					System.out.println("Enter Name For Search:");
				    Scanner h=new Scanner(System.in);
				    String n = h.nextLine();
				    int x=0;
				    for(int g=0;g<i;g++) {
				    	
				    	if (add[g].Name.contentEquals(n)==true) {
				    		x++;
				    		System.out.print("Name:"+add[g].Name+"\n"); 
							System.out.print("Address:"+add[g].Street+", "+add[g].City+", "+add[g].Country+", Pincode:"+add[g].Zipcode+". \n \n" );
							try{
								System.out.print("Press Enter To Continue..");
								System.in.read();}
					        catch(Exception e){}
							break;
				    	}
				    	
				    
				    }
				    
			    	if(x<1) {
			    		System.out.println("Invalid Entry:");
			    		
			    	}
			    	
				    break;
					
				}
				
				case 4:{
					System.out.println("Enter Name:");
				    Scanner s=new Scanner(System.in);
				    String N = s.nextLine();
				    int y=0;
				    for(int k=0;k<i;k++) {
				    	if (add[k].Name.contentEquals(N)==true) {
				    		y++;
				    		add[k].Name = add[i-1].Name;
				    		add[k].City=add[i-1].City;
				    		add[k].Country=add[i-1].Country;
				    		add[k].Street=add[i-1].Street;
				    		add[k].Zipcode=add[i-1].Zipcode;
				    		i--;
				    		System.out.println("Succesfully Deleted.");
				    		try{
								System.out.print("Press Enter To Continue..");
								System.in.read();}
					        catch(Exception e){}
				    		break;
				    	}
				    	
				    
				    }
				    if(y<1) {
			    		System.out.println("Invalid Entry:");
			    		
			    	}
				    break;
				}
				case 5:{
					System.out.println("Enter Name:");
				    Scanner s=new Scanner(System.in);
				    String N = s.nextLine();
				    int z=0;
				    for(int l=0;l<i;l++) {
				    	if (add[l].Name.contentEquals(N)==true) {
				    		z++;
				    		System.out.println("Enter New Address:");
				    		System.out.print("Enter a Street: "); 
							add[l].Street= sc.nextLine(); 
							add[l].Street= sc.nextLine();
							System.out.print("Enter a City: "); 
							add[l].City= sc.nextLine(); 
							System.out.print("Enter a Country: "); 
							add[l].Country= sc.nextLine(); 
							System.out.print("Enter a Zipcode: "); 
							add[l].Zipcode= sc.nextLine(); 
				    	
				    		
				    		System.out.println("Succesfully Updated.");
				    		try{
								System.out.print("Press Enter To Continue..");
								System.in.read();}
					        catch(Exception e){}
				    		break;
				    	}
				    	
				    }
				    if(z<1) {
			    		System.out.println("Invalid Entry:");
			    		
			    	}
				    break;
				}
				case 6:{
					System.exit(0);
				}
				default:{
					System.out.print("Choice Not Exist. Try From given choice. \n");
					break;
				}
			}
		}while(true);
	}

}
