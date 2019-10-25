package com.mashibing.iterator.v5;


public class LinkedList_ implements Collection_ {
    Node head = null;
    Node tail = null;
    private int size = 0;
    public void add(Object o){
        Node node = new Node(o);
        node.next = null;
        if (head == null){
            head = node;
            tail = node;
        }
        tail.next = node;
        tail = node;
        size++;
    }
    public int size(){
        return size;
    }

    @Override
    public Iterator_ iterator() {
        return new LinkedListIterator();
    }
    private class LinkedListIterator implements Iterator_{
        Node currentNode = head;
        @Override
        public boolean hasNext() {
            if (currentNode == null) return false;
            else if (currentNode.equals(currentNode.next)) return false;
            else return true;
        }

        @Override
        public Object next() {
            if (currentNode.equals(head)){
                currentNode = currentNode.next;
                return head;
            }
            if (currentNode.equals(tail)) {
                currentNode = currentNode.next;
                return tail;
            }
            Node temp = currentNode;
            currentNode = currentNode.next;
            return temp;
        }
    }
}
