public class Worker {
    private String fullName;
    private double energy;
    private double power;
    private double efficiency = 0.3;

    public Worker(String fullName, double energy, double power) {
        this.fullName = fullName;
        this.energy = energy;
        this.power = power;
    }
    public Worker(){
        this.energy = 0;
        this.power = 0;
        this.fullName = "";
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public double getEnergy() {
        return energy;
    }
    public void setEnergy(double energy) {
        this.energy = energy;
    }
    public double getPower() {
        return power;
    }
    public void setPower(double power) {
        this.power = power;
    }
    public double getEfficiency() {
        return efficiency;
    }
    public void setEfficiency(double efficiency){
        this.efficiency = efficiency;
    }
    @Override
    public String toString(){
        return "Full Name: " + fullName + ", Energy: " + energy + " kJ, Power: " + power + " kW, Efficiency: " + efficiency;
    }
    public double toWork(int time){
        if(energy != 0){
            double work = 0;
            for(int i = 1; i <= time; i++){
                work = power * time * efficiency + work;
                energy = energy - work;
            }
            return work;
        }
        return 0;
    }
}
