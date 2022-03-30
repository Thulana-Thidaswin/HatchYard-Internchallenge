import java.util.Scanner;

public class PizzaYard_Pvt_Ltd {
    private static void Menu(){
        System.out.println("--------------------------------");
        System.out.println("Our Menu");
        System.out.println("1) Pizza");
        System.out.println("More to come soon......");
        System.out.println("--------------------------------");
        System.out.print("Please enter your option   ");
    }
    private static void MeatMenu(){
        System.out.println("--------------------------------");
        System.out.println("Select your meat Type please ");
        System.out.println("1) Chicken ");
        System.out.println("2) Beef ");
        System.out.println("3) Mutton");
        System.out.println("4) Sea Food");
        System.out.print("Please enter your option   ");

    }
    private static void AdditonalMenu(){
        System.out.println("--------------------------------");
        System.out.println("Select 4 additionals");
        System.out.println("1) Cabbage ");
        System.out.println("2) Carrots ");
        System.out.println("3) Extra cheese");
        System.out.println("4) Extra sauce");
        System.out.println("5) Extra Meat");
        System.out.println("6) Spicy");
        System.out.println("7) Garlic Bread");
        System.out.println("8) Thin Crust");
        System.out.print("Please enter your option   ");

    }
    private  static void PizzaTypeMenu(){
        System.out.println("--------------------------------");
        System.out.println("Select your Pizza type");
        System.out.println("1) Normal Pan pizza ");
        System.out.println("2) Healthy Pan pizza ");
        System.out.println("3) Premium Pan Pizza");
        System.out.print("Please enter your option   ");
    }
    public static void main(String[] args){
        Scanner userInput=new Scanner(System.in);
        Integer menuInput=0;
        Integer breadtype=0;
        Integer meatType=0;
        Integer optionalItems=0;
        Integer userItem=0;
        Integer[] items = {0,0,0, 0,0,0};
        Integer type=0;
        Boolean valid=false;
        Integer counter=0;
        Double addtionalPrice=0.00;
        Pizza NormalPizza=new Pizza(breadtype,meatType);
        HealthyPizza HPizza=new HealthyPizza(breadtype,meatType);
        Preminum_Pizza PrePizza=new Preminum_Pizza(breadtype,meatType);

        System.out.println("Welcome to PizzaYard Private Limited");
        PizzaTypeMenu();
        while (valid==false) {
            try {
                type = Integer.parseInt(userInput.nextLine());
                if (type == 1 | type == 2 | type == 3) {
                    valid = true;
                } else {
                    System.out.println("Please enter an option in the menu");
                    type = Integer.parseInt(userInput.nextLine());
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number please");
            }
        }

        MeatMenu();
        try{
            meatType=Integer.parseInt(userInput.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number please");
        }
        if(type==1){
            NormalPizza.setMtype(meatType);
        }
        if(type==2){
           HPizza.setBtype(2);
           HPizza.setMtype(meatType);
        }
        if(type==1){
           PrePizza.setMtype(meatType);
        }
        AdditonalMenu();
        while (optionalItems<4){
            try{
                userItem=Integer.parseInt(userInput.nextLine());
                items[optionalItems]=userItem;
                optionalItems++;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number please");
            }
        }
        while (counter<6) {
            if (items[counter]==1) {
                addtionalPrice=addtionalPrice+2.89;
            }
            if (items[counter]==2) {
                addtionalPrice=addtionalPrice+3.5;
            }
            if (items[counter]==3) {
                addtionalPrice=addtionalPrice+4.9;
            }
            if (items[counter]==4) {
                addtionalPrice=addtionalPrice+1.69;
            }
            if (items[counter]==5) {
                addtionalPrice=addtionalPrice+9.25;
            }
            if (items[counter]==6) {
                addtionalPrice=addtionalPrice+2.22;
            }
            if (items[counter]==7) {
                addtionalPrice=addtionalPrice+4.65;
            }
            if (items[counter]==8) {
                addtionalPrice=addtionalPrice+5.00;
            }
         }
        NormalPizza.setPrice(addtionalPrice);
        HPizza.setPrice(addtionalPrice);
        PrePizza.setPrice(addtionalPrice);
    }



}
