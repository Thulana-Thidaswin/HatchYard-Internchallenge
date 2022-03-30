public class Preminum_Pizza {
    private Integer breadType = 0;
    private Integer meat = 0;
    private Double price = 0.0;
    private static Integer[] list={0, 0, 0, 0,0,0};
    private Integer counter = 0;

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

    public void viewPrice() {
        Double totalPrice = 0.0;

        System.out.println("This is your Bill till now");
        if (breadType == 0) {
            System.out.println("Whole wheat bread-----------$2.00");
        } else {
            System.out.println("Kurakhan bread-----------$3.00");
            totalPrice = totalPrice + 3.00;
        }
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
                    break;
                case 2:
                    System.out.println("Carrots-----------$3.5");
                    break;
                case 3:
                    System.out.println("Extra cheese-----------$5.00");
                    break;
                case 4:
                    System.out.println("Extra sauce-----------$5.00");
                    break;
                case 5:
                    System.out.println("Extra Meat-----------$5.00");
                    break;
                case 6:
                    System.out.println("Spicy-----------$5.00");
                    break;
                case 7:
                    System.out.println("Garlic Bread-----------$5.00");
                    break;
                case 8:
                    System.out.println("Thin Crust-----------$5.00");
                    break;
            }
            totalPrice = totalPrice + price;
            System.out.println();
            System.out.println(("The grand Total of your bill is......") + totalPrice);
        }


    }
}
