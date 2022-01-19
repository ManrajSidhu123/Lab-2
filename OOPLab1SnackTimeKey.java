/********************************************************************
 * Programmer:      your name here
 * Class:           CS30S
 *
 * Assignment:      OOP Lab 1 Driver
 *
 * Description:     add you code as directed by the comments to complete the 
 *                  driver code for this lab. Note that you will also 
 *                  have to write the class code for the Product class
 ***********************************************************************/
public class OOPLab1SnackTimeKey{
    public static void main(String[] args){

        // create some Product objecrs
        ProductKey snack1 = new ProductKey("Chocolate", 1.75);
        ProductKey snack2 = new ProductKey("Chips", 1.89);
        ProductKey snack3 = new ProductKey("Banana", 0.95);
        ProductKey snack4 = new ProductKey();
        
        //print snack details
        System.out.println(snack1.getName());
        System.out.println(snack2.getPrice());
        System.out.println(snack3);
        
        // use setters
        System.out.println();
        System.out.println(snack4);
        snack4.setName("JellyBean");
        snack4.setPrice(0.25);
        System.out.println(snack4);
        
        System.out.println();
        System.out.println(snack1);
        snack1.setName("Cookie");
        System.out.println(snack1);
        
        
        
        System.out.println("\nend of program.");
    }
}
