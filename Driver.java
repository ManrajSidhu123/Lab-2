import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.ArrayList;
/** ***************************************************
 *  Name:           Manraj
 *  Class:          CS30S
 * 
 *  Assignment:     Lab 2
 * 
 *  Description:    loading from file directly in driver
 * 
 *************************************************************/

public class Driver {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
    // ***** variables *****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          //  delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
        
         ArrayList<ProductKey> data = new ArrayList<>();
       
    // ***** objects *****
    
        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        BufferedReader fin = new BufferedReader(new FileReader("snackTimeData.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
    
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Manraj" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  Lab 2" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        //fout.print(banner);
    
    // ***** Get Input *****
    
        // prompt for input
        // read input from keyboard
        // echo input back to console window
    
    // ***** Main Processing *****
    
            ProductKey n1 = new ProductKey("Chocolate", 1.75);
            ProductKey n2 = new ProductKey("Chips", 1.89);
            ProductKey n3 = new ProductKey("Banana", 0.95);
            ProductKey n4 = new ProductKey("Cookie", 0.75);
            ProductKey n5 = new ProductKey("Unknown", 0.0);
            ProductKey n6 = new ProductKey("Fishstick", 2.15);
            ProductKey n7 = new ProductKey("JellyBean", 0.25);
            
        // loading array list   
            data.add(n1);
            data.add(n2);
            data.add(n3);
            data.add(n4);
            data.add(n5);
            data.add(n6);
            data.add(n7);
        
        strin = fin.readLine();
        while(strin != null){
            //System.out.println(strin);
            
            tokens = strin.split(delim);
            String Name = tokens[0];
            Double Price = Double.parseDouble(tokens[1]);
            
            strin = fin.readLine();
        }// end eof
        
        for(ProductKey n: data){
            System.out.println(n);
        } // end for
        
          System.out.println();    
          System.out.println("The 4th menu item is: " + data.get(3).getName());
          System.out.println("The 2nd menu costs: " + data.get(1).getPrice());
          
          System.out.println();    
          
          data.get(3).setName("Oreo Cookie");
          data.get(2).setPrice(1.05);
          data.get(4).setName("Sushi");
          data.get(4).setPrice(3.45);
          
        // print the list
        
        for(ProductKey n: data){
            System.out.println(n);
        } // end for

    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close(); 
    } // end main 
} // end FormatTemplate
