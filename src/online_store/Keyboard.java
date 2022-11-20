package online_store;

public class Keyboard extends Products {
    private int sizePercentage;
    private String keyboardLayout;

    public Keyboard(double price, String productName, int amount, int sizePercentage, String keyboardLayout) {
        super(price, productName, amount);
        this.sizePercentage = sizePercentage;
        this.keyboardLayout = keyboardLayout;
    }

    public int getSizePercentage() {
        return sizePercentage;
    }

    public String getLayout() {
        return keyboardLayout;
    }

    public void getFeatures() {
        if (sizePercentage == 100) {
            System.out.println("Size: full-sized (100%)");
        } 

        else if (sizePercentage == 96) {
            System.out.println("Size: compact full-sized (96%)");
        }
        else if (sizePercentage == 80) {
            System.out.println("Size: Tenkeyless (80%)");
        }
        else if (sizePercentage == 65) {
            System.out.println("Size: Compact (65%)");
        }
        else {
            System.out.println("Size percentage " + sizePercentage);
        }

        System.out.println("Keyboard layout " + keyboardLayout);
    }
}
