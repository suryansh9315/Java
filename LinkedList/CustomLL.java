package com.company.LinkedList;

public class CustomLL {

    private Node head;
    private Node tail;
    private int size;

    public CustomLL() {
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

    public void addstart(int num){
        Node node;
        if(size==0){
            node = new Node(num);
        }else{
            node = new Node(num, head);
        }
        head = node;
        if(tail==null){
            tail = head;
        }
        size++;
    }
    public void addend(int num){
        Node node;
        if(tail==null){
            node = new Node(num);
        }else{
            node = new Node(num);
            tail.next = node;
        }
        tail = node;
        if(head==null){
            head = tail;
        }
        size++;
    }
    public void addindex(int index,int num){
        if(index > size){
            return;
        }
        if(index==0){
            addstart(num);
            return;
        }
        if(index==size){
            addend(num);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(num,temp.next);
        temp.next = node;
        size++;
    }
    public void addindexRecursion(int index,int num){
        head = head.next;
        if(index == 1){
            Node node = new Node(num);

        }
        addindexRecursion(index-1,num);
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }
    public void deletestart(){
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
    }
    public void deleteend(){
        Node temp = head;
        for (int i = 1; i < size-1; i++) {
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        size--;
    }
    public void deleteindex(int index){
        if(index > size){
            return;
        }
        if(index==0){
            deletestart();
            return;
        }
        if(index==size){
            deleteend();
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
}

