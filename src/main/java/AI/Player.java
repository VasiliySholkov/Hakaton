package AI;

import Frost.GamePanel;

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
        GamePanel gamePanel = new GamePanel();

        System.out.println("Ship created at " + startingPositionX + " " + startingPositionY + " its lenght " + decknum + " and rotation " + rotate);
        for (int i = 0; i < decknum; i++) {
            if (rotate == 0) {
                battleplan[startingPositionX + i][startingPositionY] = "S";
            } else {
                battleplan[startingPositionX][startingPositionY + i] = "S";
            }
        }
        gamePanel.showPole(battleplan);

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
                System.out.println("Success!! Current player  may fire again (Enter shot coordinates( X Y )");
                fire(battleplan);
            }
        } else fire(battleplan);
        return battleplan;

    }
}
