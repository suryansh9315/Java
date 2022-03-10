package com.company.LinkedList;

public class DoublyLL {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLL() {
        this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next,Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
    public void AddStart(int num){
        Node node = new Node(num);
        node.next = head;
        node.prev = null;
        if(head == null){
            return;
        }
        head.prev = node;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }
    public void AddEnd(int num){
        Node node;
        if(tail == null){
            node = new Node(num);
        }else{
            node = new Node(num);
            tail.next = node;
        }
        node.next = null;
        node.prev = tail;
        tail = node;
        if(head == null){
            head = tail;
        }
        size++;
    }
    public void AddIndex(int index,int num){
        if(index > size){
            return;
        }
        if(index==0){
            AddStart(num);
            return;
        }
        if(index==size){
            AddEnd(num);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(num);
        node.next = temp.next;
        node.prev = temp;
        temp.next = node;
        node.next.prev = node;
        size++;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void displayRev(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            last = temp;
            temp = temp.next;
        }
        while(last != null){
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("END");
    }
    public void DeleteStart(){
        if(head == null){
            return;
        }
        head.next.prev = null;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
    }
    public void DeleteEnd(){
        Node temp = head;
        for (int i = 1; i < size-1; i++) {
            temp = temp.next;
        }
        tail = temp;
        temp.next = null;
        size--;
    }
    public void DeleteIndex(int index){
        if(index > size){
            return;
        }
        if(index==0){
            DeleteStart();
            return;
        }
        if(index==size-1){
            DeleteEnd();
            return;
        }
        Node temp = head;
        for (int i = 1 ; i < index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
        size--;
    }
    public Node find(int num){
        Node node = head;
        while(node != null){
            if(node.value == num){
                return node;
            }
            node = node.next;
        }
        return null;
    }
}
