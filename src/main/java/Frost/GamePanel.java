package Frost;


import java.io.File;

public class GamePanel {
    File file = new File("");
    public String[] pole1 = new String[]{
            "   A B C D I F G H I J ",
            "1 | | | | | | | | | | |",
            "2 | | | | | | | | | | |",
            "3 | | | | | | | | | | |",
            "4 | | | | | | | | | | |",
            "5 | | | | | | | | | | |",
            "6 | | | | | | | | | | |",
            "7 | | | | | | | | | | |",
            "8 | | | | | | | | | | |",
            "9 | | | | | | | | | | |",
            "10| | | | | | | | | | |",
    };
    public String[] pole2 = new String[]{
            "   A B C D I F G H I J ",
            "1 | | | | | | | | | | |",
            "2 | | | | | | | | | | |",
            "3 | | | | | | | | | | |",
            "4 | | | | | | | | | | |",
            "5 | | | | | | | | | | |",
            "6 | | | | | | | | | | |",
            "7 | | | | | | | | | | |",
            "8 | | | | | | | | | | |",
            "9 | | | | | | | | | | |",
            "10| | | | | | | | | | |",
    };

   public void showPole(){
       int count=0;
        for (String el:
             this.pole1) {
            System.out.print(el);
            System.out.print("\t\t\t\t\t");
            System.out.println(this.pole2[count++]);
        }
    }
    public void readFile(){

    }
}
