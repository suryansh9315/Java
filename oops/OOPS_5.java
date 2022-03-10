package com.company.oops;

public class OOPS_5 {
    public int num;
    private String name;
    protected int[] arr;

    public OOPS_5(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
// public -> Can be accessed everywhere
// private -> Can be accessed in one class only
// default -> Allowed in same package but not in different package
// protected -> Allowed in same package and as subclass of different package
// In built Packages
// 1. lang  ->  language specific (Automatically Imported)
// 2. io  ->  contains input output classes
// 3. util  -> contains utility classes like collection framework,etc.
// 4. applet
// 5. awt  -> For GUI
// 6. net  -> For Networking


