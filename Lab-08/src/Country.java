public class Country {
    private String name;
    private final ResortPlace[] resortPlaces = new ResortPlace[1000];
    private int resortCount = 0;

    public Country(String name) {
        this.name = name;
    }
    public Country(){
        this.name = "Kazakhstan";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void addResort(ResortPlace resortPlace) {
        resortPlaces[resortCount++] = resortPlace;
    }
    public void printAllResort() {
        for (int i = 0; i < resortCount; i++) {
            System.out.println(resortPlaces[i]);
        }
    }
    public double getTotalInCome(){
        double total = 0;
        for (int i = 0; i < resortCount; i++) {
            total += resortPlaces[i].getTotalInCome();
        }
        return total;
    }
    public int getResortCount() {
        return resortCount;
    }

}
