package AI;


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

        for (int i = 0; i < decknum; i++) {
            if (rotate == 0) {
                if ((battleplan[startingPositionX + i][startingPositionY] == "S") || (battleplan[startingPositionX + i][startingPositionY] == "-")) {

                    startingPositionX = random.nextInt(10 - decknum);
                    startingPositionY = random.nextInt(10 - decknum);
                    rotate = random.nextInt(2);
                    i = 0;
                }
            } else {
                if ((battleplan[startingPositionX][startingPositionY + i] == "S") || (battleplan[startingPositionX][startingPositionY + i] == "-")) {
                    startingPositionX = random.nextInt(10 - decknum);
                    startingPositionY = random.nextInt(10 - decknum);
                    rotate = random.nextInt(2);
                    i = 0;
                }

            }
        }
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

        int shotX = randomPosition();
        int shotY = randomPosition();

        if (battleplan[shotX][shotY] != "X") {
            if (battleplan[shotX][shotY] != "S") battleplan[shotX][shotY] = "*";
            else {
                battleplan[shotX][shotY] = "X";
                setWincounter(getWincounter() + 1);
            }
        } else fire(battleplan);
        return battleplan;

    }

    public int takeAim(String[][] battleplan, int X, int Y) {

        switch (random.nextInt(4)) {
            case 0:
                return 1;
        }

        return 1;
    }

    public String[][] aimedFire(String[][] battleplan, int takeAimX, int takeAimY, int presumeRotation) {

        int shotX = takeAimX;
        int shotY = takeAimY;


        if (battleplan[shotX][shotY] != "X") {
            if (battleplan[shotX][shotY] != "S") battleplan[shotX][shotY] = "*";
            else battleplan[shotX][shotY] = "X";
        } else aimedFire(battleplan, takeAimX, takeAimY, presumeRotation);
        return battleplan;

    }


}

