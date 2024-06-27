import java.util.Arrays;

public class ResortPlace {
    private String name;
    private String city;
    private final Tourist[] tourists = new Tourist[1000];
    private int touristCount = 0;

    public ResortPlace(String name, String city) {
        this.name = name;
        this.city = city;
    }
    public ResortPlace(){
        name = "Almasaran";
        city = "Almaty";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void addTourist(Tourist tourist) {
        tourists[touristCount] = tourist;
        touristCount++;
    }
    public double getTotalInCome(){
        double total = 0;
        for(int i = 0; i < touristCount; i++){
            total += tourists[i].getIncomeMoney();
        }
        return total;
    }
    public int getTotalTourists() {
        return touristCount;
    }
    @Override
    public String toString() {
        System.out.println("Resort Place: " + name + ", City: " + city + "\n____________________________\n" + "Tourists:\n");

        int index;
        for(index = 0; index < touristCount; index++){
            System.out.println(tourists[index].toString());
        }
        System.out.println("____________________________\n" + "Total Income Money: " + getTotalInCome());
        return "";
    }

}
