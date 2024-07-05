public class ToshibaBattery extends Battery {
    private double voltage;
    private double currency;
    private double energy;
    private double extraEnergy;

    public double getPower() {
        return currency * voltage;
    }
    public double getLifeTime() {
        return energy/getPower();
    }
}
