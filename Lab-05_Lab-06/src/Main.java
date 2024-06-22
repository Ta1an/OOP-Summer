public class Main {
    public static void main(String[] args) {
        AnimalList animalLinkedList = new AnimalLinkedList();
        Animal cat = new Cat("Kara");
        Animal dog = new Dog("Connor");

        animalLinkedList.add(cat);
        animalLinkedList.add(dog);

        System.out.println("Second animal is " + animalLinkedList.get(1));

        Animal newDog = new Dog("Markus");

        animalLinkedList.set(1, newDog);

        for(int i = 0; i < animalLinkedList.size(); i++) {
            Animal curAnimal = animalLinkedList.get(i);
            System.out.print("Animal " + curAnimal.getName() + " says ");
            curAnimal.sound();
        }
        animalLinkedList.clear();
    }
}
