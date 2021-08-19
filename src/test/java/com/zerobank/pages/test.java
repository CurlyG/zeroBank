package com.zerobank.pages;

import jdk.internal.misc.FileSystemOption;

import java.sql.SQLOutput;

public class test {
    public static void main(String[] args) {
        int[] AB = {1, 2, 4};
        System.out.println("asd");

    }
    public static int sol(int[] A) {
        int N=0;
        for (int j = 1; j < 100000; j++) {
         for (int i = 0; i < A.length - 1; i++) {

                if (A[i] != A[j]) {
                   N=A[j];
                }
            }

        }
        return N;
    }

    }
