public class AnimalArrayList {
    private Animal[] arrayList;
    private int size;

    public AnimalArrayList(int initSize) {
        arrayList = new Animal[initSize];
    }
    public AnimalArrayList() {
        arrayList = new Animal[10];
    }
    public int getSize(){
        return this.size;
    }
    public boolean isEmpty(){
        return this.size == 0;
    }
    private void copyElementsFrom(Animal[] olderElements){
        this.size = olderElements.length;
        this.arrayList = olderElements;
    }
    private void checkSize(int needCapacity){
        Animal[] newArrayList = new Animal[size*2];
        if(this.size + needCapacity > arrayList.length){
            for(int i = 0; i < this.size; i++){
                copyElementsFrom(arrayList);
                newArrayList[i] = arrayList[i];
            }
        }
    }
    public void add(Animal animal){
        checkSize(this.size + 1);
        arrayList[this.size] = animal;
    }
}