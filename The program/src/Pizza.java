public class Pizza {

        private Integer breadType=0;
        private Integer meat=0;
        private Double price;

        public Pizza(Integer bread, Integer meatType) {
            this.breadType = bread;
            this.meat = meatType;
        }

        public void setBtype(Integer breadType) {
            this.breadType=breadType;
        }
        public void setMtype(Integer meat) {
            this.meat=meat;
        }
        public Integer getBtype(){
            return breadType;
        }
        public Integer getMtype(){
            return meat;
        }
        public Double getPrice(){
            return price;
        }
    private static void Menu(){
        System.out.println("--------------------------------");
        System.out.println("Our Menu");
        System.out.println("1) Pizza");
        System.out.println("More to come soon......");
        System.out.println("--------------------------------");
        System.out.print("Please enter your option   ");
    }

    }
