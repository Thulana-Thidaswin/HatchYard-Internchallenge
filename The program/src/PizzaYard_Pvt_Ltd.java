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
        System.out.println("Select your additionals");
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
    private  static void PizzaType(){
        System.out.println("--------------------------------");
        System.out.println("Select your Pizza type");
        System.out.println("1) Normal Pan pizza ");
        System.out.println("2) Healthy Pan pizza ");
        System.out.println("3) Premium");
    }
    public static void main(String[] args){
        Scanner userInput=new Scanner(System.in);
        Integer menuInput=0;
        Integer meatType=0;
        Integer optionalItems=0;
        Integer userItem=0;
        Integer[] items = {0,0,0, 0,0,0};
        System.out.println("Welcome to PizzaYard Private Limited");
        Menu();
        menuInput = Integer.parseInt(userInput.nextLine());
        while (menuInput!=1) {
            try {
                System.out.println("Please enter a Number in the Menu");
                menuInput = Integer.parseInt(userInput.nextLine());
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










    }
}
