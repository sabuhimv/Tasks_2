package com.mycompany.task_2;

public class Task_2 {

    public static void main(String[] args) {
        //TASK 2
        String[] arr = {"sabuhi", "slm", "mamed"};
        int max = 0;
        String uzun = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > max) {
                max = arr[i].length();
                uzun = arr[i];
            }

        }
        System.out.println(max);
        System.out.println("EN UZUN SOZ : " + uzun);
    }
}
