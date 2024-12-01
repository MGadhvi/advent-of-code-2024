package org.mg.aoc.day1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Day1 {

    private static List<Integer> list1 = new ArrayList<>();
    private static List<Integer> list2 = new ArrayList<>();

    private static void createArrays() {
        try {
            var bufferedReader = new BufferedReader(new FileReader("src/main/java/org/mg/aoc/day1/day1.txt"));
            for (String input = bufferedReader.readLine(); input != null; input = bufferedReader.readLine()) {
                String[] s = input.split(" ");
                int firstNumber = Integer.parseInt(s[0]);
                list1.add(firstNumber);

                int secondNumber = Integer.parseInt(s[3]);
                list2.add(secondNumber);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void sortArrays() {
        Collections.sort(list1);
        Collections.sort(list2);
    }

    private static int getTotal() {
        int total = 0;
        for (int i = 0; i < list1.size(); i++) {
                if (list1.get(i) > list2.get(i)) {
                    total = total + (list1.get(i) - list2.get(i));
                } else {
                    total = total + (list2.get(i) - list1.get(i));
                }
            }
        return total;
        }


    public static void main(String[] args) {
        createArrays();
        sortArrays();
        System.out.println(getTotal());
    }
}
