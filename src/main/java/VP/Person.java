package VP;

public class Person {

        private String name = "Guest";
        private String login;
        private String password;
        private boolean age18;

        private int cash;

        public Person() {
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", login='" + login + '\'' +
                    ", password='" + password + '\'' +
                    ", age18=" + age18 +
                    ", cash=" + cash +
                    '}';
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public boolean isAge18() {
            return age18;
        }

        public void setAge18(boolean age18) {
            this.age18 = age18;
        }

        public int getCash() {
            return cash;
        }

        public void setCash(int cash) {
            this.cash = cash;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getName() {
            return name;
        }

        public String getLogin() {
            return login;    }

        public String getPassword() {
            return password;
        }

        public Person(String name, String login, String password) {
            this.name = name;
            this.login = login;
            this.password = password;
            this.age18=true;
        }

        public Person(String name, String login, String password, boolean age18, int cash) {
            this.name = name;
            this.login = login;
            this.password = password;
            this.age18 = age18;
            this.cash = cash;
        }
    }
