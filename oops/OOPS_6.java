package com.company.oops;

public class OOPS_6 {
    int num;

    public OOPS_6(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((OOPS_6)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        OOPS_6 B = new OOPS_6(20);
        System.out.println(B.hashCode());
        OOPS_6 C = new OOPS_6(20);
        System.out.println(C.hashCode());

        if(B == C){
            System.out.println("They are Equal , Boss.");
        }
        if(B.equals(C)){
            System.out.println("They are Equal , Bitch.");
        }

        System.out.println(B instanceof OOPS_6);

        System.out.println(B.getClass());
    }
}

// hashCode -> Gives a Number Representation of an Object
// == -> Checks if two reference variables are pointing to same object
// .equals() -> Checks if two objects have same values
// instanceof -> Tells if object is an instance of given class
// getClass() -> Gives Info about Class