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
    public static void main(String[] args){
        Scanner userInput=new Scanner(System.in);
        Integer menuInput=0;
        Integer meatType=0;
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





    }
}
