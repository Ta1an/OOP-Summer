public class DuracellBattery extends Battery {
    private double voltage;
    private double currency;
    private double energy;
    private double internalVoltage;

    public double getPower(){
        return currency*voltage;
    }
    public double getLifeTime(){
        return energy/getPower();
    }

}
