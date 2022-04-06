import java.util.ArrayList;

public class CafeUtil{
    
    public Integer getStreakGoal(){
        int sum = 0;
        for (int i=1; i<=10; i++){
            sum = sum + i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices){
        double total = 0;
        for(int i = 0 ; i < prices.length; i++){
            total = total + prices[i];
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for (int i=0; i < menuItems.size(); i++){
            String menuItem = menuItems.get(i);
            System.out.println(i + " " + menuItem);
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName);
        int numOfCustomers = customers.size();
        System.out.println("There are " + numOfCustomers + " people in front of you.");
        customers.add(userName);
        System.out.println(customers);
    }
        
}