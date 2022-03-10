package com.company;

public class Prime_sieve_of_eratosthenes {
    public static void main(String[] args) {
        int n = 40;
        boolean[] arr = new boolean[n+1];
        jod(n,arr);
    }
    public static void jod(int n,boolean[] primes){
        for(int i=2;i*i<=n;i++){
            if(!primes[i]){
                for(int j=2*i;j<=n;j+=i){
                    primes[j]=true;
                }
            }
        }
        for (int i=2;i<=n;i++){
            if(!primes[i]){
                System.out.print(i+" ");
            }
        }
    }
}
