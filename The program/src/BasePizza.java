public class BasePizza {

    private static Integer breadType = 0;
    private static Integer meat = 0;
    private static Double price = 0.0;
    private static Integer[] list={0, 0, 0, 0,0,0};
    private static Integer counter = 0;

    public BasePizza(Integer bread, Integer meatType, Double currentPrice) {
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

    public static Integer getList(Integer position) {
        return list[position];
    }

    public static void viewPrice() {
        Double totalPrice = 0.0;
        Double addtionalPrice=0.0;
        System.out.println("-----------------------------------------------------------------");
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
            while (counter < 6) {
                Integer listItem = getList(counter);
                switch (listItem) {
                    case 1:
                        System.out.println("Cabbage-----------$ 2.89");
                        addtionalPrice = addtionalPrice + 2.89;
                        break;
                    case 2:
                        System.out.println("Carrots-----------$3.5");
                        addtionalPrice = addtionalPrice + 3.5;
                        break;
                    case 3:
                        System.out.println("Extra cheese-----------$4.9");
                        addtionalPrice = addtionalPrice + 4.9;
                        break;
                    case 4:
                        System.out.println("Extra sauce-----------$1.69");
                        addtionalPrice = addtionalPrice + 1.69;
                        break;
                    case 5:
                        System.out.println("Extra Meat-----------$9.25");
                        addtionalPrice = addtionalPrice + 9.25;
                        break;
                    case 6:
                        System.out.println("Spicy-----------$2.22");
                        addtionalPrice = addtionalPrice +2.22 ;
                        break;
                    case 7:
                        System.out.println("Garlic Bread-----------$4.65");
                        addtionalPrice = addtionalPrice + 4.65;
                        break;
                    case 8:
                        System.out.println("Thin Crust-----------$5.60");
                        addtionalPrice = addtionalPrice +5.6 ;
                        break;
                }
                counter = counter + 1;
            }
            totalPrice = totalPrice + price+ addtionalPrice;
            counter=0;
            System.out.println();
            System.out.println(("The grand Total of your bill is......") + totalPrice);
            System.out.println("-----------------------------------------------------------------");
        }


}
