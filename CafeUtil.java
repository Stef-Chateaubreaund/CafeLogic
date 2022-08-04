import java.util.ArrayList;//always first import the list
//1 ake the public class

public class CafeUtil {

    // Get the customer streak goal
    public int getStreakGoal() {
        // Rewards system for customers who buy everyweek...
        // sum together each integer from 1 to numWeeks
        // for loop
        // Returns the sum
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i;
        }
        return sum;
    }
    
     //   getorder 
    // public double getOrderTotal(double[] prices) {
    //     double sum= 0.00;
    //     for (double price : prices){
    //         sum += price; 
    //     }
    //     return sum;
    // }//try to ask to heidi 
    public double getOrderTotal(double[] lineItems){
        double total = 0;
        for(double i = 0; i< lineItems.length; i++){
            total += lineItems[(int) i];
        }//remember t always convert back int to double 
        return total;
    }
    // public double getOrderTotal(double[] prices){
    //     double total = 0;
    //     for(int i = 0; i< prices.length; i++){
    //         total += prices[i];
    //     }
    //     return total;


            //void is when we dont have a return just maping 
    public void displayMenu(ArrayList<String>menuItems){
        for (int i=0; i<menuItems.size(); i++){
            System.out.println(i + " " + menuItems.get(i));
        }
    }






    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Oi, " + userName + ":)");
        System.out.println("There are " + " "+ customers.size() +" " +  "people in front of you");
        customers.add(userName);
        System.out.println(customers);

    }

    public void coffee(String product, double price, int maxQuantity ){
        //print the name of the product 
        System.out.println(product);
        //go trhu the max quantity ???
        double sumPricing = 0;
        int counter = 1;
        // ArrayList<String> bulkPricingList = new  ArrayList<String>();
        for (int i =1; i <= maxQuantity; i++ ){
            // String product = "Colombian Coffee Ground";
            // double price = 15.00;
            // int maxQuantity = 3;
            sumPricing += price;
            System.out.println(String.format("%d - $%.2f,", i, sumPricing) );
        }
        }
    
    
    }



