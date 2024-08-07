public class Flashlight {
    private Battery[] batteries;

    public Flashlight(Battery[] batteries) {
        this.batteries = batteries;
    }
    public Battery[] getBatteries() {
        return batteries;
    }
    public void setBatteries(Battery[] batteries) {
        this.batteries = batteries;
    }
    public double getTotalPower() {
        double totalPower = 0;
        for (Battery battery : batteries) {
            totalPower += battery.getPower();
        }
        return totalPower;
    }
    public double getTotalEnergy() {
        double totalEnergy = 0;
        for (Battery battery : batteries) {
            totalEnergy += battery.getPower() * battery.getLifeTime();
        }
        return totalEnergy;
    }
    public double getTotalLifeTime(){
        return getTotalEnergy()/getTotalPower();
    }
    @Override
    public String toString() {
        return "FlashLight {" +
                "Batteries = " + java.util.Arrays.toString(batteries) +
                ", Total Power = " + getTotalPower() +
                ", Total Energy = " + getTotalEnergy() + "}";
    }
}
