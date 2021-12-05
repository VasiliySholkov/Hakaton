package AI;


import java.util.Objects;
import java.util.Random;

public class Ai {

    Random random = new Random();

    int wincounter;

    public int getWincounter() {
        return wincounter;
    }

    public void setWincounter(int wincounter) {
        this.wincounter = wincounter;
    }

    public int randomPosition() {
        int position = random.nextInt(10);

        return position;
    }

    public String[][] fleetCreate(String[][] battleplan) {
        int counter = 4;

        while (counter != 0) {
            for (int i = 0; i < (5 - counter); i++) createShip(battleplan, counter);

            counter -= 1;
        }


        return battleplan;
    }


    public String[][] createShip(String[][] battleplan, int decknum) {

        int startingPositionX = random.nextInt(10 - decknum);
        int startingPositionY = random.nextInt(10 - decknum);
        int rotate = random.nextInt(2);
        boolean placeable=true;

        for (int i = 0; i < decknum; i++) {
            if (rotate == 0) {
                placeable= (!Objects.equals(battleplan[startingPositionX + i][startingPositionY], "S")) && (!Objects.equals(battleplan[startingPositionX + i][startingPositionY], "-"));
            } else {
                placeable= (!Objects.equals(battleplan[startingPositionX][startingPositionY + i], "S")) && (!Objects.equals(battleplan[startingPositionX][startingPositionY + i], "-"));

            }
        }
        if (placeable) {
            System.out.println("Ship created at " + startingPositionX + " " + startingPositionY + " its lenght" + decknum + "and rotation" + rotate);
            for (int i = 0; i < decknum; i++) {
                if (rotate == 0) {
                    battleplan[startingPositionX + i][startingPositionY] = "S";
//                    if (startingPositionY > 0) {
//                        battleplan[startingPositionX + i][startingPositionY - 1] = "-";
//                        if (startingPositionX + decknum != 9)
//                            battleplan[startingPositionX + decknum][startingPositionY - 1] = "-";
//                        if (startingPositionX != 0) battleplan[startingPositionX - 1][startingPositionY - 1] = "-";
//                    }
//                    if (startingPositionY < 9) {
//                        battleplan[startingPositionX + i][startingPositionY + 1] = "-";
//                        if (startingPositionX + decknum != 9)
//                            battleplan[startingPositionX + decknum][startingPositionY + 1] = "-";
//                        if (startingPositionX != 0) battleplan[startingPositionX - 1][startingPositionY + 1] = "-";
//                    }

            } else {
                battleplan[startingPositionX][startingPositionY + i] = "S";
//                if (startingPositionX>0) {
//                    battleplan[startingPositionX - 1][startingPositionY + i] = "-";
//                    if (startingPositionY+decknum!=9)battleplan[startingPositionX -1][startingPositionY + decknum] = "-";
//                    if (startingPositionY!=0)battleplan[startingPositionX-1][startingPositionY - 1] = "-";
//                }
//                if (startingPositionX<9) {
//                    battleplan[startingPositionX + 1][startingPositionY + i] = "-";
//                    if (startingPositionY+decknum!=9)battleplan[startingPositionX + 1][startingPositionY +decknum] = "-";
//                    if (startingPositionY!=0)battleplan[startingPositionX+1][startingPositionY - 1] = "-";
//                }
              }
          }
        }
        else createShip(battleplan,decknum);


        return battleplan;
    }


    public String[][] fire(String[][] battleplan) {

        int shotX = randomPosition();
        int shotY = randomPosition();
        if (getWincounter()==20)return battleplan;
        if ((!Objects.equals(battleplan[shotX][shotY], "X"))&& (!Objects.equals(battleplan[shotX][shotY], "*"))) {
            if (!Objects.equals(battleplan[shotX][shotY], "S")) battleplan[shotX][shotY] = "*";
            else {
                battleplan[shotX][shotY] = "X";
                setWincounter(getWincounter() + 1);
                takeAim(battleplan,shotX,shotY);
            }
        } else fire(battleplan);
        return battleplan;

    }

    public String[][] takeAim(String[][] battleplan, int X, int Y) {

        if (wincounter==20) return battleplan;
        switch (random.nextInt(4)) {
            case 0:
                if (X+1<=9){
                    if (!Objects.equals(battleplan[X + 1][Y], "X") && !Objects.equals(battleplan[X + 1][Y], "*")) {
                        if (!Objects.equals(battleplan[X + 1][Y], "S")) battleplan[X+1][Y] = "*";
                        else {
                            battleplan[X+1][Y] = "X";
                            setWincounter(getWincounter() + 1);

                        }
                    }
                } else takeAim(battleplan,X,Y);
                return battleplan;
            case 1:
                if (X-1>=0){
                    if (!Objects.equals(battleplan[X - 1][Y], "X") && !Objects.equals(battleplan[X - 1][Y], "*")) {
                        if (!Objects.equals(battleplan[X - 1][Y], "S")) battleplan[X-1][Y] = "*";
                        else {
                            battleplan[X-1][Y] = "X";
                            setWincounter(getWincounter() + 1);

                        }
                    }
                }else takeAim(battleplan,X,Y);

                return battleplan;
            case 2:
                if (Y+1<=9){
                    if (!Objects.equals(battleplan[X][Y + 1], "X") && !Objects.equals(battleplan[X][Y + 1], "*")) {
                        if (!Objects.equals(battleplan[X][Y + 1], "S")) battleplan[X][Y+1] = "*";
                        else {
                            battleplan[X][Y+1] = "X";
                            setWincounter(getWincounter() + 1);

                        }
                    }
                }else takeAim(battleplan,X,Y);
                return battleplan;
            case 3:
                if (Y-1>=0){
                    if (!Objects.equals(battleplan[X][Y - 1], "X") && !Objects.equals(battleplan[X][Y - 1], "*")) {
                        if (!Objects.equals(battleplan[X][Y - 1], "S")) battleplan[X][Y-1] = "*";
                        else {
                            battleplan[X][Y-1] = "X";
                            setWincounter(getWincounter() + 1);

                        }
                    }
                }else takeAim(battleplan,X,Y);
                return battleplan;
        }

        return battleplan;
    }




}

