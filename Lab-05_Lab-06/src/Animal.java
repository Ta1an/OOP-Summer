public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void sound(){
        System.out.println("The animal is sound: ");
    }
    @Override
    public String toString() {
        return name;
    }
}

