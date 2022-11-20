package online_store;

import java.io.*;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) throws IOException {
        
        Laptop surfaceLaptop = new Laptop(1099, "Surface Laptop 4", 0, "Quad Core 11th Gen Intel® Core™ i5-1135G7 processor", 256, 8, true, true, 2.79);
        Laptop vivoBook = new Laptop(799.99, "ASUS VivoBook 15", 0, "Intel Core i5-1135G7", 1000, 16, true, false, 3.53);
        Mouse officeMouse = new Mouse(25, "Logitech MX Master 3S", 0, true, true, "Small");
        Mouse gamingMouse = new GamingMouse(189.99, "Razer DeathAdder V3 Pro", 0, true, true, "Medium", 30000, false, 5);
        Desktop gamingComputer = new Desktop(999.99, "Acer Predator Gaming PC", 0, "Intel Core i5-11400F", 512, 16, "GeForce GTX 1660 Super", true);
        Desktop officeComputer = new Desktop(749.99, "ASUS - ExpertCenter D500", 0, "Intel i5-11400", 256, 8, "Intel UHD Graphics 730", true);
        Printer inkJet = new Printer(149.99, "Epson WorkForce Pro WF-3820", 0, "Inkjet");
        Keyboard officeKeyboard = new Keyboard(49.99, "Logitech - Signature K650", 0, 100, "English (QWERTY)");
        Keyboard gamingKeyboard = new GamingKeyboard(199.99, "Logitech G915 TKL LIGHTSPEED", 0, 80, "English", "GL Tactile switch", true);

        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Products> currentCart = new ArrayList<Products>();

        currentCart.add(surfaceLaptop);
        currentCart.add(vivoBook);
        currentCart.add(officeMouse);
        currentCart.add(gamingMouse);
        currentCart.add(gamingComputer);
        currentCart.add(officeComputer);
        currentCart.add(inkJet);
        currentCart.add(officeKeyboard);
        currentCart.add(gamingKeyboard);

        int totalCost = 0;
        int totalItems = 0;

        System.out.println("---------- WorstSell Online Store ----------");
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

        Customer newCustomer = new Customer(firstName, lastName, new Address(streetNumber, streetName, city, province), new ShoppingCart(totalItems, totalCost, currentCart));

        System.out.println("---------- Welcome to the Online Shopping Interface ----------");
        System.out.println("Here are the following actions: ");
        System.out.println("1. Buy: Browse the online store to purchase items \n2. Remove: remove an item from your cart \n3. Check cart: Review your current cart \n4: Product Info: Get information about the desired product \n5. Checkout: Finish shopping");

        while (true) {
            System.out.print("Enter option: ");
            String option = key.readLine();

            if (option.equalsIgnoreCase("Buy")) {
                System.out.println("Here are the follow products:");
                System.out.println("");
                for (int i = 0; i < currentCart.size(); i++) {
                    System.out.println(currentCart.get(i));
                }

                 
            }
        }



    }
    
}
