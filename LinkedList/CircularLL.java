package com.company.LinkedList;

public class CircularLL {
    private Node head;
    private Node tail;
    private int size;

    public CircularLL() {
        this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public void AddEnd(int num){
        Node node = new Node(num);
        if(head == null){
            head = node;
            tail = node;
        }
        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }
    public void display(){
        Node node = head;
        if(node == null){
            return;
        }
        do{
            System.out.print(node.value + " -> ");
            node = node.next;
        }while(node != head);
        System.out.println("End");
    }
    public void DeleteValue(int value){
        Node node = head;
        if(node == null){
            return;
        }
        if(node.value == value){
            head = head.next;
            tail.next = head;
            size--;
            return;
        }
        do {
            if(node.next.value == value){
                node.next = node.next.next;
                break;
            }
            node = node.next;
        }while (node != head);
    }
}
