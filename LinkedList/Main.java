package com.company.LinkedList;

public class Main {
    public static void main(String[] args) {
        CLL();
//        DLL();
//        CirLL();
    }
    public static void CLL(){
        CustomLL list = new CustomLL();
        list.addstart(34);
        list.addend(12);
        list.addstart(3);
        list.addend(560);
        list.addstart(4);
        list.addend(1200);
        list.addstart(3445);
        list.addend(0);
        list.addindex(3,100);
        list.addindex(0,1000);
        list.addindex(10,1001);
        list.display();
        list.deletestart();
        list.display();
        list.deleteend();
        list.display();
        list.deleteindex(3);
        list.display();
        list.addindex(9,23);
        list.display();
    }
    public static void DLL(){
        DoublyLL list = new DoublyLL();
        list.AddStart(23);
        list.AddEnd(34);
        list.AddStart(100);
        list.AddIndex(2,200);
        list.display();
        list.DeleteStart();
        list.display();
        list.DeleteEnd();
        list.display();
        list.AddStart(230);
        list.AddEnd(3445);
        list.AddIndex(2,2002);
        list.display();
        list.DeleteIndex(3);
        list.display();
        list.displayRev();
    }
    public static void CirLL(){
        CircularLL list = new CircularLL();
        list.AddEnd(40);
        list.AddEnd(100);
        list.AddEnd(4);
        list.AddEnd(1234);
        list.AddEnd(9876);
        list.display();
        list.DeleteValue(40);
        list.display();
        list.DeleteValue(9876);
        list.display();
        list.DeleteValue(4);
        list.display();
    }
}
