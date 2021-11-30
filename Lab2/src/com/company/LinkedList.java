package com.company;

public class LinkedList<E>{
    private Node first;
    private Node last;
    private int size = 0;

    private class Node<E>{
        E value;
        Node<E> next;

        public Node(E value){
            this.value = value;
            next = null;
        }
    }

    public void add(E value){
        if(first == null){
            first = new Node(value);
            last = first;
        }
        else{
            last.next = new Node(value);
            last = last.next;
        }
        size++;
    }

    public int size(){
        return size;
    }

    public boolean remove(E value){
        Node previousNode = null;
        Node currentNode = first;
        while(currentNode != null){
            if(currentNode.value.equals(value)){
                if(previousNode != null){
                    previousNode.next = currentNode.next;
                    if(currentNode.next == null){
                        last = previousNode;
                    }
                }
                else{
                    first = first.next;
                    if(first == null){
                        last = null;
                    }
                }
                size--;
                return true;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        return false;
    }

    public boolean contains(E value){
        Node currentNode = first;
        while(currentNode != null){
            if(currentNode.value.equals(value)){
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public void printList(){
        Node currentNode = first;
        while(currentNode != null){
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }
    }
}
