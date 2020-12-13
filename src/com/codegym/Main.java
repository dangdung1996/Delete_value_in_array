package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Nhập số lượng phần tử:");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];


        for (int i = 0; i < arr.length; i++) {
            System.out.println("Phần tử thứ " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }


        for (int j = 0; j < arr.length; j++) {
            System.out.print(+arr[j] + ", ");
        }


        //xl
        int X;
        int index_del;
        System.out.println("Nhập value cần xóa: ");
        X = sc.nextInt();


        for (int i = 0; i < arr.length; i++) {
            if (X == arr[i]) {
                index_del = i;
                System.out.println("Xoa phan tu: " + arr[i] + ", Vi tri thu : " + index_del);

                for (int j = index_del; j < arr.length; j++) {
                    arr[j] = arr[j + 1];
                    if ((j + 1) == arr.length - 1) {
                        arr[arr.length - 1] = 0;
                        break;
                    }
                }
            }

        }

        //in
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

    }

}
