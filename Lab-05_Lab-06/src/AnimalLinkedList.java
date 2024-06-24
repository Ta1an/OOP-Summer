public class AnimalLinkedList implements AnimalList{
    private class Node{
        Animal element;
        Node next;
        Node prev;

        public Node(Animal element, Node next, Node prev){
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
    private Node head;
    private int size;

    public AnimalLinkedList(){
        head = new Node(null, null, null);
        head.next = head;
        head.prev = head;
        size = 0;
    }
    private void add(Animal element, Node node){
        Node newNode = new Node(element, node, node.prev);
        newNode.next.prev = newNode;
        newNode.prev.next = newNode;
        size++;
    }
    public void add(Animal element){
        Node current = head.next;
        if(size == 0){
            add(element, head);
        }
        else{
            add(element, current);
            current = current.next;
        }
    }
    public void addAll(AnimalArrayList arrayList){
        Node current = head.next;
        for(int i = 0; i < size; i++){
            add(arrayList.get(i), current);
            current = current.next;
        }
    }
    public Node findNodeByIndexOf(int index){
        Node current = head.next;
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
            node.element = element;

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
        Node current = head.next;
        for(int i = 0; i < size; i++){
            current = current.next;
            current.element = null;
        }
    }
}