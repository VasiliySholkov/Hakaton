package Frost;


import java.io.File;
import java.util.Arrays;

public class GamePanel {
    File file = new File("");
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

    }


    public void readFile(){

    }
}
