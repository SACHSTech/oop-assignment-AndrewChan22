package online_store;

import java.io.*;
import java.util.ArrayList;
import java.time.LocalDate;
import java.text.DecimalFormat;

/**
 * Main program to run online store
 * @author A. Chan
 */
public class Main {

    public static void main(String[] args) throws IOException {
        
        // make objects
        Laptop surfaceLaptop = new Laptop(1099, "Surface Laptop 4", 0, "Quad Core 11th Gen Intel® Core™ i5-1135G7 processor", 256, 8, true, true, 2.79);
        Laptop vivoBook = new Laptop(799.99, "ASUS VivoBook 15", 0, "Intel Core i5-1135G7", 1000, 16, true, false, 3.53);
        Mouse officeMouse = new Mouse(25, "Logitech MX Master 3S", 0, true, true, "Small");
        Mouse gamingMouse = new GamingMouse(189.99, "Razer DeathAdder V3 Pro", 0, true, true, "Medium", 30000, false, 5);
        Desktop gamingComputer = new Desktop(999.99, "Acer Predator Gaming PC", 0, "Intel Core i5-11400F", 512, 16, "GeForce GTX 1660 Super", true);
        Desktop officeComputer = new Desktop(749.99, "ASUS - ExpertCenter D500", 0, "Intel i5-11400", 256, 8, "Intel UHD Graphics 730", true);
        Printer inkJet = new Printer(149.99, "Epson WorkForce Pro WF-3820", 0, "Inkjet");
        Keyboard officeKeyboard = new Keyboard(49.99, "Logitech - Signature K650", 0, 100, "English (QWERTY)");
        Keyboard gamingKeyboard = new GamingKeyboard(199.99, "Logitech G915 TKL LIGHTSPEED", 0, 80, "English", "GL Tactile switch", true);

        // user input, decimal formatter, and product arraylist
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat formatter = new DecimalFormat("#0.00");  
        ArrayList<Products> currentCart = new ArrayList<Products>();

        // add objects to cart
        currentCart.add(surfaceLaptop);
        currentCart.add(vivoBook);
        currentCart.add(officeMouse);
        currentCart.add(gamingMouse);
        currentCart.add(gamingComputer);
        currentCart.add(officeComputer);
        currentCart.add(inkJet);
        currentCart.add(officeKeyboard);
        currentCart.add(gamingKeyboard);

        // initialize cart variables
        double totalCost = 0;
        int totalItems = 0;

        // user input to create customer object
        System.out.println("---------- Online Store ----------");
        System.out.println("To proceed, enter the follow information");
        System.out.print("First name: ");
        String firstName = key.readLine();

        System.out.print("Last name: ");
        String lastName = key.readLine();

        System.out.println("---------- Shipping Address ----------");
        System.out.print("Street/house number: ");
        int streetNumber = Integer.parseInt(key.readLine());

        System.out.print("Street name: ");
        String streetName = key.readLine();

        System.out.print("City: ");
        String city = key.readLine();

        System.out.print("Province (abbreviation): ");
        String province = key.readLine();

        // clear console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // make customer object using user input
        Customer newCustomer = new Customer(firstName, lastName, new Address(streetNumber, streetName, city, province), new ShoppingCart(totalItems, totalCost, currentCart));

        System.out.println("---------- Welcome to the Online Shopping Interface ----------");
        System.out.println("Here are the following actions: ");
    
        // loops until customer checks out
        while (true) {
            System.out.println("1. Buy: Browse the online store to purchase items \n2. Remove: remove an item from your cart \n3. Check cart: Review your current cart \n4: Product Info: Get information about the desired product \n5. Checkout: Finish shopping");
            System.out.print("Enter option: ");
            String option = key.readLine();

            // buy option, allows customer to add items to cart based on user input
            if (option.equalsIgnoreCase("Buy")) {
                System.out.println("");
                System.out.println("Here are the following available products:");

                // output product objects
                for (int i = 0; i < currentCart.size(); i++) {
                    System.out.println(currentCart.get(i));
                }

                // product and amount user input
                System.out.println("");
                System.out.print("What are you looking to purchase?: ");
                String purchase = key.readLine();

                System.out.print("How many would you like to purchase?: ");
                int amount = Integer.parseInt(key.readLine());

                if (amount > 0) {

                    if (purchase.equalsIgnoreCase("Surface laptop 4")) {
                    
                        surfaceLaptop.setAmount(surfaceLaptop.getAmount() + amount);
                        System.out.println(amount + " item(s) with the following name " + purchase + " were successfully added to cart");
                        
                    }
    
                    else if (purchase.equalsIgnoreCase("ASUS VivoBook 15")) {
                                    
                        vivoBook.setAmount(vivoBook.getAmount() + amount);
                        System.out.println(amount + " item(s) with the following name " + purchase + " were successfully added to cart");
                    }
    
                    else if (purchase.equalsIgnoreCase("Logitech MX Master 3S")) {
                                      
                        officeMouse.setAmount(officeMouse.getAmount() + amount);
                        System.out.println(amount + " item(s) with the following name " + purchase + " were successfully added to cart");
                        
                    }
    
                    else if (purchase.equalsIgnoreCase("Razer DeathAdder V3 Pro")) {
               
                        gamingMouse.setAmount(gamingMouse.getAmount() + amount);
                        System.out.println(amount + " item(s) with the following name " + purchase + " were successfully added to cart");
                        
                    }
    
                    else if (purchase.equalsIgnoreCase("Acer Predator Gaming PC")) {
       
                        gamingComputer.setAmount(gamingComputer.getAmount() + amount);
                        System.out.println(amount + " item(s) with the following name " + purchase + " were successfully added to cart");
                        
                    }
    
                    else if (purchase.equalsIgnoreCase("ASUS - ExpertCenter D500")) {
            
                        officeComputer.setAmount(officeComputer.getAmount() + amount);
                        System.out.println(amount + " item(s) with the following name " + purchase + " were successfully added to cart");
                   
                    }
    
                    else if (purchase.equalsIgnoreCase("Epson WorkForce Pro WF-3820")) {
                       
                        inkJet.setAmount(inkJet.getAmount() + amount);
                        System.out.println(amount + " item(s) with the following name " + purchase + " were successfully added to cart");
                        
                    }
    
                    else if (purchase.equalsIgnoreCase("Logitech - Signature K650")) {
    
                        officeKeyboard.setAmount(officeKeyboard.getAmount() + amount);
                        System.out.println(amount + " item(s) with the following name " + purchase + " were successfully added to cart");
                        
                    }
    
                    else if (purchase.equalsIgnoreCase("Logitech G915 TKL LIGHTSPEED")) {
     
                        gamingKeyboard.setAmount(gamingKeyboard.getAmount() + amount);
                        System.out.println(amount + " item(s) with the following name " + purchase + " were successfully added to cart");
                        
                    }

                } else {
                    System.out.println("Error. Please input a value greater than zero to add item to cart");
                }
            }

            // remove option, allows customer to remove items from their cart
            else if (option.equalsIgnoreCase("Remove")) {
                System.out.println("Here are the following available products:");
                System.out.println("");
                for (int i = 0; i < currentCart.size(); i++) {
                    System.out.println(currentCart.get(i));
                }

                System.out.println("Which item do you want to remove?: ");
                String purchase = key.readLine();

                System.out.println("How many would you like to remove: ");
                int amount = Integer.parseInt(key.readLine());

                if (amount > 0) {

                    if (purchase.equalsIgnoreCase("Surface laptop 4")) {
                    
                        if (surfaceLaptop.getAmount() - amount >= 0) {
                            surfaceLaptop.setAmount(surfaceLaptop.getAmount() - amount);
                            System.out.println(amount + " item(s) with the following name " + purchase + " were successfully removed from the cart");
                        }
                        else {
                            System.out.println("Invalid amount.");
                        }
                        
                        
                    }
    
                    else if (purchase.equalsIgnoreCase("ASUS VivoBook 15")) {
                        
                        if (vivoBook.getAmount() - amount >= 0) {
                            vivoBook.setAmount(vivoBook.getAmount() - amount);
                            System.out.println(amount + " item(s) with the following name " + purchase + " were successfully removed from the cart");
                        }
                        else {
                            System.out.println("Invalid amount.");
                        }
                    }
    
                    else if (purchase.equalsIgnoreCase("Logitech MX Master 3S")) {
                           
                        if (officeMouse.getAmount() - amount >= 0) {
                            officeMouse.setAmount(officeMouse.getAmount() - amount);
                            System.out.println(amount + " item(s) with the following name " + purchase + " were successfully removed from the cart");
                        }
                        else {
                            System.out.println("Invalid amount.");
                        }

                        
                        
                    }
    
                    else if (purchase.equalsIgnoreCase("Razer DeathAdder V3 Pro")) {
               
                        if (gamingMouse.getAmount() - amount >= 0) {
                            gamingMouse.setAmount(gamingMouse.getAmount() - amount);
                            System.out.println(amount + " item(s) with the following name " + purchase + " were successfully removed from the cart");
                        }
                        else {
                            System.out.println("Invalid amount.");
                        }
                        
                    }
    
                    else if (purchase.equalsIgnoreCase("Acer Predator Gaming PC")) {
       
                        if (gamingComputer.getAmount() - amount >= 0) {
                            gamingComputer.setAmount(gamingComputer.getAmount() - amount);
                            System.out.println(amount + " item(s) with the following name " + purchase + " were removed from the cart");
                        }
                        else {
                            System.out.println("Invalid amount.");
                        }
                        
                    }
    
                    else if (purchase.equalsIgnoreCase("ASUS - ExpertCenter D500")) {
            
                        if (officeComputer.getAmount() - amount >= 0) {
                            officeComputer.setAmount(officeComputer.getAmount() - amount);
                            System.out.println(amount + " item(s) with the following name " + purchase + " were removed from the cart");
                        }
                        else {
                            System.out.println("Invalid amount.");
                        }
                        
                   
                    }
    
                    else if (purchase.equalsIgnoreCase("Epson WorkForce Pro WF-3820")) {
                       
                        if (inkJet.getAmount() - amount >= 0) {
                            inkJet.setAmount(inkJet.getAmount() - amount);
                            System.out.println(amount + " item(s) with the following name " + purchase + " were removed from the cart");
                        }
                        else {
                            System.out.println("Invalid amount.");
                        }
                    }
    
                    else if (purchase.equalsIgnoreCase("Logitech - Signature K650")) {
    
                        if (officeKeyboard.getAmount() - amount >= 0) {
                            officeKeyboard.setAmount(officeKeyboard.getAmount() - amount);
                        System.out.println(amount + " item(s) with the following name " + purchase + " were removed from the cart");
                        }
                        else {
                            System.out.println("Invalid amount.");
                        }
                    }
                    else if (purchase.equalsIgnoreCase("Logitech G915 TKL LIGHTSPEED")) {
     
                        if (gamingKeyboard.getAmount() - amount >= 0) {
                            gamingKeyboard.setAmount(gamingKeyboard.getAmount() - amount);
                            System.out.println(amount + " item(s) with the following name " + purchase + " were removed from the cart");
                        }
                        
                        else {
                            System.out.println("Invalid amount.");
                        }
                    
                    }
                }
                else {
                    System.out.println("Error. Please input a value greater than zero to add item to cart");
                }
            } 
            
            // outputs current items in cart
            else if (option.equalsIgnoreCase("Check cart")) {
                // temporary cost variable
                int tempCost = 0;

                // loop through arraylist, and add item prices to the cart
                for (int i = 0; i < currentCart.size(); i++) {
                    if (currentCart.get(i).getAmount() > 0) {
                        System.out.println(currentCart.get(i).getName() + ": " + currentCart.get(i).getAmount());

                        tempCost += currentCart.get(i).getAmount() * currentCart.get(i).getPrice();
                    }
                }
                System.out.println("Total current cost of cart: $" + formatter.format(tempCost));
            }
            
            // product info option, outputs getFeatures() of the desired product
            else if (option.equalsIgnoreCase("Product info")) {
                System.out.println("Here are the following available products: ");
                System.out.println("");
                for (int i = 0; i < currentCart.size(); i++) {
                    System.out.println(currentCart.get(i));
                }

                System.out.println("Which product do you want to learn more about?");
                String choice = key.readLine();

                if (choice.equalsIgnoreCase("Surface laptop 4")) {
                    
                    surfaceLaptop.getFeatures();
                        
                }
    
                else if (choice.equalsIgnoreCase("ASUS VivoBook 15")) {
                    
                    vivoBook.getFeatures();
                }

                else if (choice.equalsIgnoreCase("Logitech MX Master 3S")) {
                        
                    officeMouse.getFeatures();
                }

                else if (choice.equalsIgnoreCase("Razer DeathAdder V3 Pro")) {
            
                    gamingMouse.getFeatures();
                }

                else if (choice.equalsIgnoreCase("Acer Predator Gaming PC")) {
    
                    gamingComputer.getFeatures();
                    
                }

                else if (choice.equalsIgnoreCase("ASUS - ExpertCenter D500")) {
        
                    officeComputer.getFeatures();
                }

                else if (choice.equalsIgnoreCase("Epson WorkForce Pro WF-3820")) {
                    
                    inkJet.getFeatures();
                }

                else if (choice.equalsIgnoreCase("Logitech - Signature K650")) {

                    officeKeyboard.getFeatures();
                }

                else if (choice.equalsIgnoreCase("Logitech G915 TKL LIGHTSPEED")) {
    
                    gamingKeyboard.getFeatures();
                }

            }

            // checkout option, totals all products in the cart, creates delivery date, and outputs shipping destination of customer
            else if (option.equalsIgnoreCase("Checkout")) {
                for (int i = 0; i < currentCart.size(); i++) {
                    if (currentCart.get(i).getAmount() > 0) {
                        System.out.println(currentCart.get(i).getName() + ": " + currentCart.get(i).getAmount());

                        totalCost += currentCart.get(i).getAmount() * currentCart.get(i).getPrice();
                    }
                }
                System.out.println("Total current cost of cart: $" + formatter.format(totalCost));
                
                LocalDate currentDate = LocalDate.now();
                LocalDate estimatedDelivery = currentDate.plusDays(7);

                System.out.println("-----Shipping Location-----");

                System.out.println("Thank you for your purchase " +  newCustomer.getFirstName() + "! \nShipping Destination: " + newCustomer.getAddress() + "\nEstimated delivery date: " + estimatedDelivery );
                break;
            }
            else {
                System.out.println("Please choose a valid option");
            }
        }
    }    

}
    

