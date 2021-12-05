package Frost;


import VP.Game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GamePanel {
    List<String> logList = new ArrayList<>();
    List<String[]> splitLogList = new ArrayList<>();

    public String[][] pole1 = new String[][]{
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ",},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ",},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ",},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ",},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ",},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ",},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ",},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ",},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ",},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ",},

    };
    public String[][] pole2 = new String[][]{
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ",},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ",},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ",},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ",},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ",},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ",},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ",},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ",},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ",},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ",},
    };

    public void showPole(String[][] strings) {
        int count = 1;
        System.out.print("   A B C D I F G H I J");
        System.out.println();
        for (int i = 0; i < strings.length; i++) {
            if (count <= 9) {
                System.out.print(count++ + " |");
            } else {
                System.out.print(count + "|");
            }
            for (int j = 0; j < strings[i].length; j++) {
                System.out.print(strings[i][j] + "|");
            }
            System.out.println();
        }
        count = 0;
        System.out.println();
    }


    public void readFile(String fileName) {
        File file = new File(fileName);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }
        while (scanner.hasNextLine()) {
            logList.add(scanner.nextLine());
        }

    }

    public void test(List<String> logList) {
        for (String el :
                logList) {
            this.splitLogList.add(el.split("\\W+"));
        }
        for (int i = 16; i <splitLogList.size()-2; i++) {
            splitLogList.get(i)[1]=splitLogList.get(i)[1].replaceAll("A","0");
            splitLogList.get(i)[1]=splitLogList.get(i)[1].replaceAll("B","1");
            splitLogList.get(i)[1]=splitLogList.get(i)[1].replaceAll("C","2");
            splitLogList.get(i)[1]=splitLogList.get(i)[1].replaceAll("D","3");
            splitLogList.get(i)[1]=splitLogList.get(i)[1].replaceAll("E","4");
            splitLogList.get(i)[1]=splitLogList.get(i)[1].replaceAll("F","5");
            splitLogList.get(i)[1]=splitLogList.get(i)[1].replaceAll("G","6");
            splitLogList.get(i)[1]=splitLogList.get(i)[1].replaceAll("H","7");
            splitLogList.get(i)[1]=splitLogList.get(i)[1].replaceAll("I","8");
            splitLogList.get(i)[1]=splitLogList.get(i)[1].replaceAll("J","9");
            }
        for (String[] el:
             splitLogList) {
            System.out.println(Arrays.toString(el));
        }
        }
    }


