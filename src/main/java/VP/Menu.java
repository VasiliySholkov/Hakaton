package VP;

import VP.Game;

public class Menu {
    public static void main(String[] args) {

        Game.productList.add(new Product("AI 1", 0, "Easy"));
        Game.productList.add(new Product("AI 2", 500, "Medium"));
        Game.productList.add(new Product("AI 3", 1000, "Hard"));

        Game.personList.add(new Person("Alex", "AlexFrost", "qwerty", true, 10000));
        Game.personList.add(new Person("Petrovich", "1111", "1111", true, 3000));
        Game.personList.add(new Person("Adil", "Sheikh", "2222", false, 1_000_000));
        Game.personList.add(new Person("Svetlana", "ketochka11", "1111", true, 20000));

        Game.startMenu();

    }
}
