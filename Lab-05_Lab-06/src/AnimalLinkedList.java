import java.util.LinkedList;

public class AnimalLinkedList implements AnimalList{
    private int size;
    private Node header;
    private Node tail;

    public AnimalLinkedList(){
        header = new Node(null, null, null);
        header.next = header;
        header.prev = header;
        size = 0;
    }
    private void add(Animal animal, Node node){
        Node newNode = new Node(animal, node, node.prev);
        newNode.next.prev = newNode;
        newNode.prev.next = newNode;
        size++;
    }
    public void add(Animal animal){
        add(animal, header.next);
    }
    public void addAll(AnimalArrayList animalArrayList){
        for(int i = 0; i < animalArrayList.size(); i++){
            add(animalArrayList.get(i), header);
            size++;
        }
    }
    private Node findNodeByIndexOf(int index){
        Node current = header;
        if(index < 0 || index >= size){
            return null;
        }
        if(index < size/2){
            for(int i = 0; i < size/2; i++){
                if(index == i){
                    return current;
                }
                current = current.next;
            }
        }
        else{
            for(int i = 0; i < size; i++){
                if(index == i){
                    return current;
                }
                current = current.next;
            }
        }
        return null;
    }
    public Animal get(int index){
       Node node = findNodeByIndexOf(index);
       if(node == null){
           return null;
       }
       return node.element;
    }
    public void set(int index, Animal element){
        Node node = findNodeByIndexOf(index);
        if(node != null){

            node.prev.next.element = element;
            node.prev.element = element;

            node.prev.next = node;
            node.next.prev = node;
        }
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void clear(){
        Node current = header;
        for(int i = 0; i < size; i++){
            current = current.next;
            current.element = null;
        }
        size = 0;
    }
    private class Node{
        Animal element;
        Node next;
        Node prev;

        Node(Animal element, Node next, Node prev){
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
}