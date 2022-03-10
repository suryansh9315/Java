package com.company.recursion;

public class Recursion_basics_2 {
    public static void main(String[] args) {
        int n=1;
//        numbers(n);
        rprint(n);
    }

    static void rprint(int n){
        if (n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        rprint(n+1);
    }

    static void numbers(int n){
        System.out.println(n);
        numbers1(2);
    }
    static void numbers1(int n){
        System.out.println(n);
        numbers2(3);
    }
    static void numbers2(int n){
        System.out.println(n);
        numbers3(4);
    }
    static void numbers3(int n){
        System.out.println(n);
        numbers4(5);
    }
    static void numbers4(int n){
        System.out.println(n);
    }
}

// While the function is not finshed executing it will remain in stack
// When a function finishes executing it is removed from stack and flow of program is restored to where that function was called
// Base Conditions is the condition where our recursion stops
// Base Conditions is determined by answers we already have
// Every Iteration in Recursion takes different memory in stack though it is calling a same function
// When the memory taken by the function exceeds the limit  : Stackoverflow Error Appears
// Why Recursion ?    It helps in solving complex problems easily.
// space Complexity is constant in recursion
// In recursion always try to break the problem in smaller parts by making recursive relations

