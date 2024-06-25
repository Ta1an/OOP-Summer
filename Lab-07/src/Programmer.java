public class Programmer extends Worker{
    private double moralMotivation = 1.5;

    public Programmer(String fullName, double energy, double power) {
        setFullName(fullName);
        setEnergy(energy);
        setPower(power);
    }
    public Programmer(){
        super();
    }
    public double getMoralMotivation() {
        return moralMotivation;
    }
    public void setMoralMotivation(double moralMotivation) {
        this.moralMotivation = moralMotivation;
    }
    @Override
    public String toString() {
        return "Full Name: " + getFullName() +
                ", Energy: " + getEnergy() +
                " kJ, Power: " + getPower() +
                " kW, Moral Motivation: " + moralMotivation;
    }
    @Override
    public double toWork(int time){
        double energy = getEnergy();
        double power = getPower();
        double work = 0;
        if(energy != 0){
            for(int i = 0; i < time; i++){
                work = work + power*time * moralMotivation;
                energy = energy - work;
            }
            return work;
        }
        return 0;
    }
}
