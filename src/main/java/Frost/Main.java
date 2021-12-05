package Frost;

import AI.Ai;
import AI.Player;

public class Main {
    public static void main(String[] args) {
        GamePanel gamePanel = new GamePanel();
//        gamePanel.showPole(gamePanel.pole1);
//        gamePanel.showPole(gamePanel.pole2);
        gamePanel.readFile("LOG.txt");
        gamePanel.test(gamePanel.logList);
        Ai ai1 = new Ai();
        Player player1 =new Player();
        ai1.fleetCreate(gamePanel.pole1);

        gamePanel.showPole(gamePanel.pole1);

       while (ai1.getWincounter()!=20){
           ai1.fire(gamePanel.pole1);
       }
       gamePanel.showPole(gamePanel.pole1);



    }
}
