package AI;


import java.util.Random;

public class Ai {

    Random random = new Random();

    public int randomPosition() {
        int position = random.nextInt(10);

        return position;
    }

    public String[][] fleetCreate(String[][] battleplan) {
        int counter=4;

        while (counter!=0) {
            for (int i=0;i<5-counter;i++) createShip(battleplan,counter);

            counter-=1;
        }


        return battleplan;
    }


    public String[][] createShip(String[][] battleplan, int decknum) {

        int startingPositionX = random.nextInt(10-decknum);
        int startingPositionY = random.nextInt(10-decknum);
        int rotate = random.nextInt(2);

        for (int i = 0; i < decknum; i++) {
            if (rotate == 0) {
                if (battleplan[startingPositionX + i][startingPositionY] == "S") {
                    createShip(battleplan,decknum);
                }
            } else {
                if (battleplan[startingPositionX][startingPositionY + i] == "S") {
                    createShip(battleplan,decknum);
                }

            }
        }

        for (int i = 0; i < decknum; i++) {
            if (rotate == 0) {
                battleplan[startingPositionX + i][startingPositionY] = "S";
            } else {
                battleplan[startingPositionX][startingPositionY + i] = "S";
            }
        }


        return battleplan;
    }



    public  String[][] fire(String[][] battleplan){

        int shotX = randomPosition();
        int shotY = randomPosition();

        if (battleplan[shotX][shotY]!="X"){
            if (battleplan[shotX][shotY]!="S") battleplan[shotX][shotY]="*";
            else battleplan[shotX][shotY]="X";
        }
        else fire(battleplan);
        return battleplan;

    }





}

