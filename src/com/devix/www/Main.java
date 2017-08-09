package com.devix.www;

public class Main {

    private static int count = 2;

    public static void main(String[] args) {

        for (int value : getValues()) {
            System.out.println(value);
        }
    }

    private static int[] getValues() {
        int[] array = new int[3];
        array[0] = count++;
        array[1] = count++;
        array[2] = count++;
        return array;
    }
}
