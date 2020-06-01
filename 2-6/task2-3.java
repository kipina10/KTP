package com.company;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        System.out.println(isAvgWhole(new int[] {1, 3}));
        System.out.println(isAvgWhole(new int[] {1, 2, 3, 4}));
        System.out.println(isAvgWhole(new int[] {1, 5, 6}));
        System.out.println(isAvgWhole(new int[] {1, 1, 1}));
        System.out.println(isAvgWhole(new int[] {9, 2, 2, 5}));
    }
    public static boolean    isAvgWhole(int[] mass) {
        float s=0;
        for(int i = 0; i < mass.length; i++){
        s+=mass[i];
       }
        s=s/mass.length;
       return (s % 1==0);
    }
}
