public class ToshibaBattery extends Battery {
    private double voltage;
    private double currency;
    private double energy;
    private double extraEnergy;

    public ToshibaBattery(double voltage, double currency, double energy, double extraEnergy) {
        this.voltage = voltage;
        this.currency = currency;
        this.energy = energy;
        this.extraEnergy = extraEnergy;
    }
    public double getVoltage() {
        return voltage;
    }
    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }
    public double getCurrency() {
        return currency;
    }
    public void setCurrency(double currency) {
        this.currency = currency;
    }
    public double getEnergy() {
        return energy;
    }
    public void setEnergy(double energy) {
        this.energy = energy;
    }
    public double getExtraEnergy() {
        return extraEnergy;
    }
    public void setExtraEnergy(double extraEnergy) {
        this.extraEnergy = extraEnergy;
    }
    @Override
    public double getPower() {
        return currency * voltage;
    }
    @Override
    public double getLifeTime() {
        return energy/getPower();
    }
    @Override
    public String toString() {
        return "Toshiba Battery{ Voltage = " + voltage +
                ", Currency = " + currency +
                ", Energy = " + energy +
                ", ExtraEnergy = " + extraEnergy + "}";

    }
}
