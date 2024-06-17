

public class AnimalLinkedList {
    private int size;
    private Node header;

    public AnimalLinkedList() {
        header = new Node(null, null, null);
        header.next = header;
        header.prev = header;
        size = 0;
    }
    public int getSize(){
        return size;
    }
    private void add(Animal animal, Node node) {
        Node newNode = new Node(animal, node.next, node);
        newNode.prev.next = newNode;
        newNode.next.prev = newNode;
        size++;
    }
    public void add(Animal animal) {
        add(animal, header.next);
    }
    public void addAll(Animal animalArrayList) {
        add(animalArrayList, header.next);

    }
    private Node findNodeByIndexOf(int index) {
        Node current = header;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
    public Animal get(int index) {
        return findNodeByIndexOf(index).element;
    }
    public void set(int index, Animal element) {
        if(findNodeByIndexOf(index).element != null) {
            index = index--;
            findNodeByIndexOf(index).next.element = element;
            findNodeByIndexOf(index).prev.element = element;
            findNodeByIndexOf(index).next.prev.element = element;
            findNodeByIndexOf(index).prev.next.element = element;
        }
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void clear(){
        header = null;
    }
    private static class Node {
        Animal element;
        Node next;
        Node prev;

        public Node(Animal element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
}