package Frost;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GamePanel {
    List<String> logList = new ArrayList<>();

    public String[][] pole1 = new String[][]{
            { " "," "," "," "," "," "," "," "," "," ",},
            { " "," "," "," "," "," "," "," "," "," ",},
            { " "," "," "," "," "," "," "," "," "," ",},
            { " "," "," "," "," "," "," "," "," "," ",},
            { " "," "," "," "," "," "," "," "," "," ",},
            { " "," "," "," "," "," "," "," "," "," ",},
            { " "," "," "," "," "," "," "," "," "," ",},
            { " "," "," "," "," "," "," "," "," "," ",},
            { " "," "," "," "," "," "," "," "," "," ",},
            { " "," "," "," "," "," "," "," "," "," ",},

    };
    public String[][] pole2 = new String[][]{
            { " "," "," "," "," "," "," "," "," "," ",},
            { " "," "," "," "," "," "," "," "," "," ",},
            { " "," "," "," "," "," "," "," "," "," ",},
            { " "," "," "," "," "," "," "," "," "," ",},
            { " "," "," "," "," "," "," "," "," "," ",},
            { " "," "," "," "," "," "," "," "," "," ",},
            { " "," "," "," "," "," "," "," "," "," ",},
            { " "," "," "," "," "," "," "," "," "," ",},
            { " "," "," "," "," "," "," "," "," "," ",},
            { " "," "," "," "," "," "," "," "," "," ",},
    };

   public void showPole(String[][] strings){
       int count =1;
       System.out.print("   A B C D I F G H I J");
       System.out.println();
  for (int i=0;i<strings.length;i++){
      if(count<=9){
      System.out.print(count++ +" |");}
      else {
          System.out.print(count+"|");
      }
      for (int j = 0; j < strings[i].length; j++) {
          System.out.print(strings[i][j]+"|");
      }
      System.out.println();
        }count=0;
       System.out.println();
    }


    public void readFile(){
        File file = new File("LOG.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }
        while (scanner.hasNextLine()){
            logList.add(scanner.nextLine());
        }
        for (String el:
             logList) {
            System.out.println(el);
        }
    }
}
