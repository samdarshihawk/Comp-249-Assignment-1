# Comp-249-Assignment-1
Appliance Class Program
In this repository, we have implemented an appliance class.
An appliance object has four attributes, a type (String), a brand (String), a serial number (long), and a price (double). 
The type of an appliance can be any of the following: Fridge, Air Conditioner, Washer, Dryer, Freezer, Stove, Dishwasher, Water Heaters, and Microwave.
The brand indicates the vendor/manufacturer of the appliance (such as LG, Samsung, Bosch, etc.), and can be any string. 
The serial number represents the serial number of the appliance, and must be unique. 
For simplicity, we assume that the serial numbers start at 1000000 and it is common/shared among all different brands and types (for example, if the creation of objects starts by a Washer created by Maytag, then it will be assigned serial number 1000000.
If a Microwave by Breville is created next, then it will be assigned serial number 1000001, and so on afterwards). The price of an appliance cannot be less than 1$.
Display a welcome message;
b.Prompt the store owner for the maximum number of appliances (maxAppliances) his/herstore can contain (or wish to aquire, this is not a focus here). 
Create an empty array, calledinventory, that will have the potential of keeping track of the created Appliance objects.
Display a main menu with the following choices and keep prompting the useruntil they enter a number between 1 and 5 inclusive (i.e invalid number will result inrepeating the display of the main menu):

What do you want to do?
1.Enter new appliances (password required)
2.Change information of an appliance (password required)
3.Display all appliances by a specific brand
4.Display all appliances under a certain a price.
5.Quit
Please enter your choice >

The user has to input the correct password if order to access first and second options. After 12 wrong attemps program will terminated itself.

Written by @samdarshihawk and @meetvora
