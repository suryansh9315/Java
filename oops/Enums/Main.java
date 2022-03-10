package com.company.oops.Enums;

public class Main {
    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        // These are enums Constant
        // public, static and final
        // Can Not Create Child enums
        // Type is Week
        Week(){
            System.out.println("Constructor Called For "+this);
        }
        // This is Not Public or Protected (Only Private or Default)
        // Internally : public static final Week Monday = new Week();
    }
    public static void main(String[] args) {
        Week week1;
        week1 = Week.Monday;

        for(Week day:Week.values()){
            System.out.println(day);
        }

        System.out.println(week1);
        System.out.println(week1.ordinal());
    }
}
