package VP;

public class Product {


        private long id;
        private String name;
        private int price;
        private String category;

        static long count=1;

        public Product(String name, int price, String category) {
            this.id = count++;
            this.name = name;
            this.price = price;
            this.category = category;
        }

        public long getId() {
            return id;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    ", category='" + category + '\'' +
                    '}';
        }

    }

