import java.util.Scanner;
import java.lang.*;
public class AddressBook {
	
	public static void main(String arg[])
	{
		int choice=0;
		int i=0;
		char p;
		address add[] = new address[50];
		do
		{
			add[i]=new address();
			System.out.println("Address Book Menu");
			System.out.println("Enter your choice \n 1. Create New Address \n 2. Show All Addresses \n 3. Exit");
			
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
					System.exit(0);
				}
				default:{
					System.out.print("Choice Not Exist. Try From given choice. \n");
				}
			}
		}while(true);
	}

}
