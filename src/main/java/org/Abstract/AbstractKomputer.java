package org.Abstract;

public abstract class AbstractKomputer {
    public static final String POWER_SOURCE = "AC";
    public abstract void powerDirect(int oneToON, int zeroToOFF);

    public abstract String getBrand();
    public abstract String getModel();

}
