public class Preminum_Pizza {
    private static Integer breadType = 0;
    private static Integer meat = 0;
    private static Double price = 0.0;
    private static Integer[] list={0, 0, 0, 0,0,0};
    private static Integer counter = 0;

    public Preminum_Pizza(Integer bread, Integer meatType, Double currentPrice) {
        this.breadType = bread;
        this.meat = meatType;
        this.price = currentPrice;
    }

    public void setBtype(Integer breadType) {
        this.breadType = breadType;
    }

    public void setMtype(Integer meat) {
        this.meat = meat;
    }

    public void setPrice(Double addprice) {
        this.price = addprice;
    }

    public void setList(Integer addOnItem, Integer position) {
        this.list[position] = addOnItem;
    }

    public Integer getBtype() {
        return breadType;
    }

    public Integer getMtype() {
        return meat;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getList(Integer position) {
        return list[position];
    }

    public static void viewPrice() {
        System.out.println("-----------------------------------------------------------------");
        Double totalPrice = 0.0;
        System.out.println("This is your Bill till now");
        System.out.println("Whole wheat bread-----------$2.00");
        totalPrice = totalPrice + 2.00;
        switch (meat) {
            case 1:
                System.out.println("Chicken-----------$5.00");
                totalPrice = totalPrice + 5.00;
                break;
            case 2:
                System.out.println("Beef-----------$6.00");
                totalPrice = totalPrice + 6.00;
                break;
            case 3:
                System.out.println("Mutton-----------$8.00");
                totalPrice = totalPrice + 8.00;
                break;
            case 4:
                System.out.println("Seafood-----------$6.50");
                totalPrice = totalPrice + 6.50;
                break;
        }
            System.out.println("This meal comes with chips and Drinks.....$10");
            totalPrice=totalPrice+10;
            System.out.println();
            System.out.println(("The grand Total of your bill is......") + totalPrice);
        System.out.println("-----------------------------------------------------------------");



    }
}
