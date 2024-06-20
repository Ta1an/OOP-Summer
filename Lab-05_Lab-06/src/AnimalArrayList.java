import java.util.Arrays;

public class AnimalArrayList {
    private Animal[] arrayList;
    private int size;

    public AnimalArrayList(int initSize) {
        arrayList = new Animal[initSize];
    }
    public AnimalArrayList() {
        arrayList = new Animal[10];
    }
    public int size(){
        return this.size;
    }
    public boolean isEmpty(){
        return this.size == 0;
    }
    private void copyElementsFrom(Animal[] olderElements){
        this.size = olderElements.length;
        this.arrayList = olderElements;
    }
    public void checkSize(int needCapacity){
        if(size + needCapacity > arrayList.length){
            Animal[] newArray = new Animal[arrayList.length * 2];
            copyElementsFrom(arrayList);
            newArray = arrayList;
        }
    }
    public void add(Animal animal){
        checkSize((int) (arrayList.length*0.3));
        arrayList[size++] = animal;
    }
    public void set(int index, Animal animal){
        arrayList[index] = animal;
    }
    public Animal get(int index){
        return arrayList[index];
    }
    public void clear(){
        for(int i = 0; i < size; i++){
            arrayList[i] = null;
        }
    }
    @Override
    public String toString(){
        return Arrays.toString(arrayList);
    }
}