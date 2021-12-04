package VP;

import java.util.*;

public class Game {

    static List<Person> personList = new ArrayList<>();
    static List<Product> productList = new ArrayList<>();

    static Person vremennaiaPerson = new Person();

    static void startMenu() {
        System.out.printf("Welcome %s", vremennaiaPerson.getName() + " to our Game! \n" +
                "Enter your chose: \n" +

                "1. Select game mode \n" +
                "2. Add players name \n" +
                "3. Arrange the ships \n" +
                "4. Choosing who starts first /flip a coin/ \n" +
                "5. ExitProgram\n" +
                "_____________________\n");
        if (vremennaiaPerson.getName().equals("Guest")){
            System.out.println( "6. Sing in \t" + "|| 7. Registration \n" +
                    "_____________________\n");}
        else {
            System.out.println("6. Sing out\t"+"|| 7.Enter a private office\n"+
                    "_______________________\n");
        }
        choseMenu(userChose());
    }

    static void loginMenu (){
        System.out.println("Enter your login: ");
        String login = new String(userChose());
        System.out.println("Enter your password");
        String password = new String(userChose());

        for (Person el: personList) {
            if (login.equals(el.getLogin())
                    &&
                    password.equals(el.getPassword())){
                vremennaiaPerson =el;
                return;
            }
        }
        System.out.println("Account not found. Please try again");
        System.out.println();
    }

    static void choseMenu(String chose) {
        switch (chose) {
            case "1":
                System.out.println("Select game mode\n" +
                        "Player-AI --- 1, Player-Player --- 2, AI-AI --- 3");
                //  метод выбора режима игры
                String choseMode = userChose();
                switch (choseMode){
                    case "1":
                        System.out.println("Game mode: Player-AI");
                        // метод игры Игрок-ИИ
                        break;
                    case "2":
                        System.out.println("Game mode: Player-Player");
                        // метод игры Игрок-Игрок
                        break;
                    case "3":
                        System.out.println("Game mode: AI-AI");
                        // метод игры ИИ-ИИ
                        break;
                    default:

                }
                break;
            case "2":
                System.out.println("Add players name ");
                // методов добавления имя игроков
                System.out.println("_____________________");
                startMenu();
                break;
            case "3":
                System.out.println("Arrange the ships ");
                // метод расстановки кораблей
                System.out.println("_____________________");
                startMenu();
                break;
            case "4":
                System.out.println("Choosing who starts first /flip a coin/");
                // метод "подбрось монетку"
                flipCoin();

                System.out.println("_____________________");
                startMenu();
                break;
            case "5":
                System.exit(0);
                break;
            case "6":
                if (vremennaiaPerson.getName().equals("Guest")){
                    loginMenu();
                    startMenu();
                    break;}else{
                    System.out.printf("Bye, %s", vremennaiaPerson.getName()+ "\n\n");
                    vremennaiaPerson =new Person();
                    startMenu();
                    break;
                }
            case "7":
                if (vremennaiaPerson.getName().equals("Guest")){
                    registrationMenu();
                    break;} else {
                    privateOfficemenu();
                    break;
                }
            default:
                startMenu();
        }
    }


    static void privateOfficemenu(){
        System.out.println("1. Change name \n"+
                "2. Change password\n" +
                "3. Add cash\n");
        String chose = userChose();
        if(chose.equals("1")){
            System.out.println("Enter your name: ");
            vremennaiaPerson.setName(userChose());
            changeAccount();
            startMenu();
        }else if(chose.equals("2")){
            System.out.println("Enter your old password: ");
            if(userChose().equals(vremennaiaPerson.getPassword())){
                System.out.println("Enter your new password: ");
                vremennaiaPerson.setPassword(userChose());
                changeAccount();
                startMenu();
            }
        }
        else if(chose.equals("3")){
            System.out.println("Enter your cash ");
            vremennaiaPerson.setCash(Integer.parseInt(userChose()));
            changeAccount();
            startMenu();
        }else {
            System.out.println("Not correct enter!");
            privateOfficemenu();
        }
    }

    static void changeAccount() {
        for (Person elementBD : personList) {
            elementBD.getLogin().equals(vremennaiaPerson.getLogin());
            elementBD.setName(vremennaiaPerson.getName());
            elementBD.setPassword(vremennaiaPerson.getPassword());
            elementBD.setCash(vremennaiaPerson.getCash());
        }
    }
    static void registrationMenu(){
        System.out.println("Get registration");
        System.out.println("Are your 18\n" +
                "Y/N");
        if (userChose().toUpperCase(Locale.ROOT).equals("Y")) {
            System.out.println("Enter your name, login, password");
            personList.add(new Person(userChose(),userChose(),userChose()));
            vremennaiaPerson =personList.get(personList.size()-1);
            startMenu();
        }else {
            startMenu();
        }
    }

    static String userChose() {
        Scanner scanner = new Scanner(System.in);
        String str = new String(scanner.nextLine());
        return str;
    }

    static void showAllProduct(){
        for (Product el: productList){
            System.out.println(el);
        }
    }

    static int flipCoin() {
        Random r = new Random();
        int min = 1;
        int max = 3;
        int result = r.nextInt(max - min) + min;
        if (result == 1) {
            System.out.println("Решка!");
            return result;
        } else {
            System.out.println("Орел!");
            return result;
        }
    }
}
