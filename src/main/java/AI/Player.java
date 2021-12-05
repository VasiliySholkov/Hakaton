package AI;

import java.util.Scanner;

public class Player {
    int wincounter;


    public int getWincounter() {
        return wincounter;
    }

    public void setWincounter(int wincounter) {
        this.wincounter = wincounter;
    }


    Scanner scanner = new Scanner(System.in);

    public String[][] fleetCreate(String[][] battleplan) {
        setWincounter(0);
        int counter = 4;

        while (counter != 0) {
            for (int i = 0; i < (5 - counter); i++) createShip(battleplan, counter);

            counter -= 1;
        }


        return battleplan;
    }

    public String[][] createShip(String[][] battleplan, int decknum) {

        int startingPositionX = scanner.nextInt();
        int startingPositionY = scanner.nextInt();
        int rotate = scanner.nextInt();


        System.out.println("Ship created at " + startingPositionX + " " + startingPositionY + " its lenght" + decknum + "and rotation" + rotate);
        for (int i = 0; i < decknum; i++) {
            if (rotate == 0) {
                battleplan[startingPositionX + i][startingPositionY] = "S";
            } else {
                battleplan[startingPositionX][startingPositionY + i] = "S";
            }
        }
        return battleplan;
    }

    public String[][] fire(String[][] battleplan) {


        int shotX = scanner.nextInt();
        int shotY = scanner.nextInt();

        if (battleplan[shotX][shotY] != "X") {
            if (battleplan[shotX][shotY] != "S") battleplan[shotX][shotY] = "*";
            else {
                battleplan[shotX][shotY] = "X";
                setWincounter(getWincounter() + 1);
            }
        } else fire(battleplan);
        return battleplan;

    }
}
