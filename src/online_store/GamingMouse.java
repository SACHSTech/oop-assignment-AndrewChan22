package online_store;

public class GamingMouse extends Mouse {
    
    private double dotsPerInch;
    private boolean RGB;
    private int programmableButtons;

    public GamingMouse (double price, String productName, int amount, boolean isWireless, boolean isErgonomic, String size, double dotsPerInch, boolean RGB, int programmableButtons) {
        super(price, productName, amount, isWireless, isErgonomic, size);

        this.dotsPerInch = dotsPerInch;
        this.RGB = RGB;
        this.programmableButtons = programmableButtons;
    }

    public double getDPI() {
        return dotsPerInch;
    }

    public boolean getRGB() {
        return RGB;
    }

    public void showFeatures() {

        super.showFeatures();
        System.out.println(dotsPerInch + " DPI delivers pro-level accuracy and speed");
        System.out.println(programmableButtons + " individually programmable buttons customize functions and store your preferred settings");

        if (RGB) {
            System.out.println("This mouse allows you to personalize your gaming setup using customized lightning");
        }

    }

}
