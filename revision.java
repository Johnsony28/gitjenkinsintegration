
//arrays 
//arrays is a list of elements of same type and placed at a contiguous loction 
//contiguous meaning one by one 
import java.util.*;

public class revision {
  public static void main(String[] args) {
    System.out.println("Welcome to hotel Raina !!!");
    int orderid = 1;
    System.out.println("Your order id is : " + orderid);
    Scanner sc = new Scanner(System.in);
    int orderID[] = new int[10];
    orderID[0]=sc.nextInt();
    orderID[1]=sc.nextInt();
          System.out.println(orderID[0]+orderID[1]);

    String menu[] = { "Rice Plate", "Chapati", "Porota", 
      "Chicken", "Fish", "Mutton" };
    System.out.print("The menu is as follows: ");
    System.out.println(Arrays.deepToString(menu));
    for(int i=0;i<menu.length;i++){
    }

    // System.out.println("The previous orders are as follows: ");
    // System.out.println(orderID);

    System.out.println("Thankyou for choosing Hotel Raina ");
  }
}