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

        System.out.println("---------- WorstSell Online Store ----------");
        System.out.println("To proceed, enter the follow information");
        System.out.println("First name: ");
        String name = key.readLine();

        System.out.println("Last name: ");

        System.out.println("---------- Shipping Address ----------");
        System.out.println("Street/house number: ");
        String streetNumber = key.readLine();

        System.out.println("Street name: ");
        String streetName = key.readLine();

        System.out.println("City: ");
        String city = key.readLine();

        System.out.println("Province (abbreviation): ");
        String province = key.readLine();





    }
    
}
