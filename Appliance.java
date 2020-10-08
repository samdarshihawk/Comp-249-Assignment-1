/*------------------------------------------
	Written by: Samdarshi Tiwari & Meet Vora 
-------------------------------------------
*/

/**
 * </h1>Appliance Class Program</h1>
 *@author Samdarshi Tiwari  & Meet Vora 
 * Assignment # 01
 * @version 2.0
 * @since 02-10-2020
 * Due Date 02-10-2020
 */
import java.util.Scanner;
public class Appliance
{
	/**
	 * An appliance object has four attributes, a type (String), a brand (String), a serial number (long), and a price (double).
	 */
	
	//this static variable will keep a count of the appliances
	private static int count;
	//variables to be created
	private String type;
	private String brand;
	private long serialnumber;
    private double price;
	private static String code = "c290";
	
	/**
	 * this method is ConStructor that will take 3 argument 
	 * and also get serial number for each instance of this class i.e each appliance will get a different serial number
	 * @param type this is the first parameter of of type String constructor method
	 * @param brand this is the second parameter of type String of constructor method 
	 * @param price this is the third parameter of type double of Constructor method
	 * @return nothing
	 */
    
	//constructor which will take 3 arguments and also set the serial number
	public Appliance(String type,String brand,double price)
	{
		this.type = type;
		this.brand = brand;
		this.serialnumber = 1000000 + count;//serial number will be automatically given according to the number of the appliance 
		count++;//this will increase the count by 1 
		if(price>=1)//checks if the price is greater than 1$
		{
			this.price = price;
		}
		else
		{
			System.out.println("The price of the appliance cannot be less than 1$");
			this.price = 1;//if not the price will be automatically set to 1$
		}
	}
	/**
	 * settype method mutate the type attribute of an Appliance instance
	 * @param type  this parameter take type that you want to set of referenced object 
	 * @return nothing
	 */
	//Mutators for type,brand and price (not for serial number as it can't be changed)
	public void settype(String type)
	{
		this.type = type;
    }
    
	/**
	 * setbrand is mutator method of Appliance class, it mutates the brand attribute of the referenced object
	 * @param brand this parameter takes String as an argument then change the brand of the object
	 * @return nothing
	 */
	public void setbrand(String brand)
	{
		this.brand = brand;
	}
	/**
	 * this method is another mutator method to change the value of price attribute of this class.
	 * @param price price double type parameter
	 * @return nothing
	 */
	public void setprice(double price)
	{
		this.price = price;
	}
	/**
	 * The gettype is one of the accessory method, when implemented returns type of the appliance  
	 * @return type of the appliance
	 */


	//Assessors for type,serial number,brand and price
	public String gettype()
	{
		return type;
	}
	
	/**
	 * It return the brand of the appliance
	 * @return brand of the referenced appliance
	 */
	public String getbrand()
	{
		return brand;
	}
	/**
	 * this accessory method returns serial number of referenced object
	 * @return the serial of the appliance
	 */
	public long getserialnumber()
	{
		return serialnumber;
	}
	/**
	 * this method return the price of the object
	 * @return the price of the appliance
	 */
	public double getprice()
	{
		return price;
	}
	
	/**
	 *toString is a overridden method and is used here to display all the attributes of appliance object
	 *@return A String which Display the details(attributes) of the appliance 
	 */
	//This method returns string describing an appliance
	public String toString()
	{
		return "The type of the appliance is " + type + " and it is manufactured by " + brand + ". The appliance has a serial number :" + serialnumber + " and it costs " + price + "$";
	}
	
	/**
	 * it this method update the count static attribute of this class whenever a new applicance is instantiated.
	 * @return number of objects created so far the constructor of the class.
	 */
	//This method returns the number of the appliances created so far
	public int findNumberOfCreatedAppliances()
	{
		return count;
	}
	/**
	 * Equals method compares the attributes of the object that called the method 
	 * with object which passed as the argument in this method.
	 * @param other the parameter is an Appliance type object .
	 * @return boolean value of the arugment's attributes matches with the object that called this method.
	 */
	//This method compares the type,brand and price of two appliances
	public boolean equals(Appliance other)
	{
		return brand==other.brand && type==other.type && price==other.price ;
	}

	/**
	 * This method prints detail of all the appliance in the inventory with same brand given by the user.
	 * @param brandName the brand which you want to search in the inventory
	 * @param inventory this second parameter of this method is an array of type Appliance, which will searched to find appliance with same brand.
	 * @return nothing
	 */
	//This method find all the appliances in the inventory manufactured by the same brand
	public static void findAppliancesby(String brandName, Appliance[] inventory)
	{ int count  = 0;
		for (int j = 0; j < inventory.length; j++){
			if (inventory[j]==null)
				break;
			else if(inventory[j].getbrand().equalsIgnoreCase(brandName)){
				System.out.println (inventory[j].toString());
				count += 1;
			}
		}
		if(count == 0){
			System.out.println("No Appliance of brand "+brandName+" was found in the inventory.");
		}

	}

	/**
	 * The findercheaperthan display all the appliances in the inventory with price less than the given price by the user. 
	 * @param price This is the first parameter of the method, which sets limit for the price of the Appliance.
	 * @param array Inventory(type Appliance) you want to search to find the appliance cheaper than parameter price. 
	 * @return nothing
	 */
	//This method find all the appliances cheaper than the input price
	public static void findCheaperThan(double price, Appliance[] array)
	{
		int found = 0 ; 
		for (int j = 0; j < array.length; j++){
			if(array[j]==null){
				break;
			}
			else if(array[j].getprice() < price)
				System.out.println (array[j].toString());
				found++;
		}
		if(found==0){
			System.out.println("No Appliance cheaper than the "+price+" is avaiable in the inventory");
		}

	}

	/**
	 * emptyspace returns the available space in the array.
	 * @param array the array which is searched to find the space.
	 * @return number empty(or null) spaces in the array.
	 */
	//This method return the number of empty spaces in the inventory array
	public static int emptyspace(Appliance[] array)
	{
        int count = 0;
        for(int i =0; i<array.length;i++){
            if(array[i] == null)
            count += 1;
        }
        return count;
        
	}


	/**
	 * 
	 * The serialchecker method looks for a given serial number in a given inventory and return true or false depending upon the condition. 
	 * @param serialnumber serial number you want to search
	 * @param array inventory searched to find the appliance with with same serial number
	 *@return the return a boolean value which implies that given serial number exist in the given inventory 
	 * 
	 * 
	 * 
	 */
	//This method check if the given serial number exist in the inventory
	public static boolean searialChecker(Long serialnumber, Appliance[] array) 
	{
		boolean output = false;
		for (int i = 0; i< array.length; i++){
			if(array[i] == null)
				break;
			else if (array[i].getserialnumber()==serialnumber)
				output = true;
		}
		return(output);
		
	}

	/**
	 * This method return the index value of the item from the inventory array if item's serial number matches with the given serial number 
	 * @param serialnumber serial number that you want to look for in the inventory
	 * @param array Appliance type inventory  which is searched to find the item with the same serial number
	 * @return index of the appliance with the matched serial number
	 */
	//This method return the index of the given serial number form the inventory
	public static int getIndex(Long serialnumber, Appliance[] array)
	{
		int index = -1;
		for (int i = 0; i< array.length;i++)
		{	if(array[i]==null)
				break;
			else if (array[i].getserialnumber()==serialnumber){
				index = i;
			} 
		}	
		return(index);
	}

	/**
	 * isvalid checks if the user input matches with stored password.
	 * @param pass the final or immutable password to access certain functions of the program
	 * @return boolean value 
	 */
	//This method check if the prompted password matches with real password
	public static boolean isvalid(String pass)
	{
        if(pass.equals(code))
            return true;
        else
        	return false;
    }
    
    /**
	 * The main method of the Appliance class shows user certain option to choose from to manipulate and access appliance class methods and attributes.
	 * The user is asked for the password to update inventory or to store new item in the inventory.
	 * if the user enter wrong password 12 times the program will terminate.
	 * @param args
	 * @return nothing
	 */
	// Main method of the Appliance Class
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in); // instantiating the scanner object
		boolean live =  true; // boolean variable use to call the main menu again until user enter 5
		System.out.println(
				"--------------------------------------------\n"
				+"  Appliance Class Driver Program\n"
				+"--------------------------------------------\n");
		System.out.println("Enter the maximum number of appliance inventory can contain:");
		int Storage = in.nextInt(); // Prompting user to enter the size of the inventory array
		Appliance [] inventory = new Appliance[Storage]; // instantiating the inventory array of type Appliance 
		int choice = 0; // this variable will store the value of the choice user will input later in the program
		int attemp = 0; // this variable keep the count of the fail attemp when user enter wrong password
		int totaltry = 0;// this variable, also, keep the count of the fail attemp when user enter wrong password
		do
		{
			System.out.print("\nWhat do you want to do?\n"
				+ "     1.  Enter new appliances (password required)\n"
				+ "     2.  change information of an appliance (password required)\n"
				+ "     3.  Display all appliances by a specific brand\n"
				+ "     4.  Display all appliance under a certain a price.\n"
				+ "     5.  Quit\n"
				+ "   Please enter your choice > ");
			choice = in.nextInt(); // prompt the user for input

			switch(choice){
				// if user choose option 1
				case 1:
				do{
					// Prompting user to enter the password
					System.out.print("Enter the Password: ");
					String pass = in.next();
					// if the password is correct
					if(isvalid(pass)==true){
						int add; // instantiating a varible to store input from the user 
						System.out.print("How many appliances you want to enter: ");
						add = in.nextInt();// prompting user to enter the no of appliance they want to enter in the inventory
						// if the no of items is greater than null element than asking user to enter again
						if (add > emptyspace(inventory)){
							System.out.println("Maximum of number applicances that can be enter is "+emptyspace(inventory));
							System.out.print("How many appliances you want to enter: ");
							add = in.nextInt();
						}
						// Prompting user to input details of the appliance 
						for ( int i = 0; i < add; i++) {
							System.out.print("Enter type of Appliance "+ (i+1) + " : ");
							String type = in.next();
							System.out.print("Enter Brand of Appliance "+(i+1)+" : ");
							String brand = in.next();
							System.out.print("Enter Price of Appliance "+(i+1)+" : ");
							Double price = in.nextDouble();
							inventory[i] = new Appliance(type, brand, price);
							System.out.println("The appliance "+(i+1)+" has been added to the inventory\n");
						}

					}else{
						// if the password dosn't match the real one then incrementing the attemp and totaltry value, running the case 1 again
						attemp += 1 ;
						totaltry +=1;
						}
					}while((attemp%3!=0)); // if (attemp is divisible by 3 then do-while will terminate and program will go back to the main menu)
					break;

					// if user choose second option from the main menu
				case 2:
					// if user choose the third
					boolean g = true;
					boolean e = true;
					attemp = 0;
					totaltry = 0;
					do{
						System.out.print("Enter the Password: ");
						String pass = in.next();
						// if the correct password is entered then
						if(isvalid(pass)==true){
								int option = 0; 
								while (e)
								{
								System.out.print("Enter the Serial number of the appliance you want to search in the inventory: "); // Asking user to enter the serial number
								long serialnumber = in.nextLong();// prompting the user for serial number and storing it in a long type variable
								int index = -1; // default value of index
								index = Appliance.getIndex(serialnumber, inventory); // here index will store a whole number(the index value) if the serial number exist in the inventory otherwise -1 will the value of index

								if(index >=0) // checking if serial number exist in the inventory
								{  while (g)
									{
									System.out.println("Appliance Serial # "+serialnumber+"\n" //display the details of the appliance with the matched serial number
									+"Brand: "+inventory[index].getbrand()+"\n"
									+"Type: "+inventory[index].gettype()+"\n"
									+"Price: "+inventory[index].getprice()+"\n");


									System.out.println("\nWhat information would you like to change?\n"
									+ "     1.  brand\n"
									+ "     2.  type\n"
									+ "     3.  Price\n"
									+ "     4.  Quit\n"
									+ "    Enter your Choice >\n");
									option = in.nextInt(); // prompting user to input any value from the above menu.
									if (option == 1){
										System.out.println("Enter the new Brand:");
										inventory[index].setbrand(in.next());
									}else if (option==2){
										System.out.println("Enter the new type:");
										inventory[index].settype(in.next());
									
									} else if (option == 3){
										System.out.println("Enter the new price:");
										inventory[index].setprice(in.nextDouble());

									}else if(option == 4){ // in this condition the program while exit from two while loop and do-while loop and would display the main menu again
										g = false;// terminating the inner while loop
										e = false;// terminating the second loop
										attemp = 3;// terminating the do-while loop
									}
								}

								}else {
									// prompted serial dosn't exist in the serial number then asking the user to enter again or exit to the main menu
									System.out.println("No Appliance found with this Serial Number "+serialnumber); 
									System.out.print("Do you wish to enter another Serial Number(y or n): ");
									String req = in.next();
									if (req.equalsIgnoreCase("n")){
										e = false;
									}
								}
							}
						}else{ // when user enter the wrong password attemp and totaltry augemnt by 1
							attemp+= 1; 
							totaltry += 1;
						}
				}while(attemp%3!= 0);
				break;
				// if user choose the 
				case 3:
					// if user you want to display appliance with same manufacture
					System.out.print("Enter the Brand name of the Appliance you want to search in the inventory: ");
					String brandName = in.next();
					Appliance.findAppliancesby(brandName, inventory);
					break;
				
				case 4:
					// if user want to display appliance cheaper than the given price
					System.out.print(" Enter the Price to find Appliance in the inventory cheaper than the given price: ");
					double cost = in.nextDouble();
					findCheaperThan(cost, inventory);
					break;

				case 5:
					// if user want to quit the program
					System.out.println("\nThank you for using this program.");
					live = false;
				

			}

		if (totaltry == 12){
			// this block of code is implemented when total try reaches 12, the program will terminate itself.
			live = false;
			System.out.print("Program detected suspicious activities and will terminateimmediately!");
			System.exit(0);
			}
		}while(live);
		in.close();    
	}
}
