/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themirror;

import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class TheMirror {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(PrimeNumberBetween(a,b));
        }
    }

    private static int PrimeNumberBetween(int a, int b) {
        int count=0;
        for (int i=a;i<b;i++) {
            if (isPrimeNumber(i)) count++;
        }
        return count;
    }

    private static boolean isPrimeNumber(int a) {
        if (a==1) return false;
        for (int i=2;i<a;i++){
            if (a%i==0) return false;
        }
        return true;
    }
}
