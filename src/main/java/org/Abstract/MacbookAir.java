package org.Abstract;

public class MacbookAir extends AbstractKomputer {

    public static String brand;
    public static String model;

    public static void setBrand(String brand) {
        MacbookAir.brand = brand;
    }

    public static void setModel(String model) {
        MacbookAir.model = model;
    }

    @Override
    public String getBrand() {
        return null;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public void powerDirect(int oneToON, int zeroToOFF) {
        if (oneToON == 1) {
            System.out.println("Computer is runnigng");
        } else if (zeroToOFF == 2) {
            System.out.println("Computer is turning off");
        } else {
            throw new IllegalArgumentException();
        }


    }

}