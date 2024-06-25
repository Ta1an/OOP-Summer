public class Teacher extends Worker{
    private double tiredness = 0.2;

    public Teacher(String fullName, double energy, double power){
        setFullName(fullName);
        setEnergy(energy);
        setPower(power);
    }
    public double getTiredness() {
        return tiredness;
    }
    public void setTiredness(double tiredness){
        this.tiredness = tiredness;
    }
    @Override
    public String toString() {
        return "Full Name: " + getFullName() +
                ", Energy: " + getEnergy() +
                " kJ, Power: " + getPower() +
                " kW, Tiredness: " + tiredness;
    }
    @Override
    public double toWork(int time){
        double energy = getEnergy();
        double power = getPower();
        double work = 0;
        if(energy != 0){
            for(int i = 0; i < time; i++){
                work = work + power*time * tiredness;
                energy = energy - work;
            }
            return work;
        }
        return 0;
    }
}
