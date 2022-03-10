package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Array2d {
    public static void main(String[] args) {
        int[][] arr2d = {{2,3},{2,3,4}};
//        System.out.println(Arrays.toString(arr2d[0]));

        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j] = input.nextInt();
            }
        }
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static class Armstrong {
        public static void arm1(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Total Number of Indexes : ");
            int n = input.nextInt();
            System.out.print("Enter the Number : ");
            int number = input.nextInt();
            int sum = 0;
            int rem;
            int num = number;
            while(num>0){
                rem = num%10;
                sum+=Math.pow(rem,n);
                num=num/10;
            }
            if (number==sum){
                System.out.println("The Number is Armstrong Number");
            }else{
                System.out.println("The Number is not Armstrong Number");
            }
        }
        public static void arm2(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter The Number : ");
            int n = input.nextInt();
            int num = n;
            int count = 0;
            while (num>0){
                num=num/10;
                count++;
            }
            int rem;
            int sum = 0;
            int num2 = n;
            while(num2>0){
                rem = num2%10;
                sum+=Math.pow(rem,count);
                num2=num2/10;
            }
            if (sum==n){
                System.out.println("Given Number is an Armstrong Number.");
            }else{
                System.out.println("Given Number is Not an Armstrong Number.");
            }
        }
        public static void main(String[] args) {
    //        arm1();
            arm2();
        }
    }

    public static class basicarray {
        public static void main(String[] args) {
            int[] roll = {1,2,3,4,5};
            System.out.println(Arrays.toString(roll));
        }
    }
}
