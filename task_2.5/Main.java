package com.main;
public class Main {
    public static void main(String[] args) {
        String[] temp = {"мама", "мыла", "раму"};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i == j)
                        continue;
                    if (k == i)
                        continue;
                    if (k == j)
                        continue;
                    System.out.print(temp[i]);
                    System.out.print(temp[j]);
                    System.out.println(temp[k]);

                }
            }
        }
    }
}
