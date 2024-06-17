public class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    @Override
    public void getSound(){
        System.out.println("meow");
    }
}
