public class Main {
    public static void main(String[] args) {
        AnimalLinkedList animalArrayList = new AnimalLinkedList();

        Animal cat = new Cat("Kara");
        Animal dog = new Dog("Connor");

        animalArrayList.add(cat);
        animalArrayList.add(dog);

        System.out.println("Second animal is " + animalArrayList.get(1));

        Animal newDog = new Dog("Markus");

        animalArrayList.set(1, newDog);

        for(int i = 0; i < animalArrayList.getSize(); i++){
            Animal curAnimal = animalArrayList.get(i);
            System.out.print("Animal " + curAnimal.getName() + " says ");
            curAnimal.getSound();
        }
        animalArrayList.clear();
    }
}
