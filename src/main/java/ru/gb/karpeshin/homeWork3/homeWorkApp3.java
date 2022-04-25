package ru.gb.karpeshin.homeWork3;

public class homeWorkApp3 {
    public static void main(String[] args) {
        /*
        1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
         */
        int[] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int maxMass = mass.length;
        for (int i = 0; i < maxMass; i++) {
            System.out.print(i + "-" + mass[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < maxMass; i++)
            if (mass[i] == 1) {
                mass[i] = 0;
            } else mass[i] = 1;
        for (int i = 0; i < maxMass; i++) {
            System.out.print(i + "-" + mass[i] + " ");
        }
    }
}