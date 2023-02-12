import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INPUT SIZE");
        //Declared Input to get input size
        int Input = scanner.nextInt();
        //Create  a temp string to take the values
        String str = "";
        // Declare String input to get all numbers
        String NumbersInput = scanner.next();
        //Declare a List of Integer
        List<Integer> IntList = new ArrayList<Integer>();
        //Created a for loop to  convert all characters of  a String to Integer;
        List<Integer> IntegerSecondList = new ArrayList<Integer>();
        //if statement to check if input of size is greater than  2 and smaller then 100
        if (Input >= 2 && Input <= 100) {

            for (int i = 1; i <= Input; i++) {
                //Created a variable to convert to  string the integer numbers ,in this case we can compare
                str += Integer.toString(i);
            }
            //Insert into a list each element of a string
            for (int i = 0; i < Input; i++) {
                ///create a list with string elements;
                Integer temp = Integer.parseInt(String.valueOf(str.charAt(i)));
                IntegerSecondList.add(temp);
            }
            //Created a for loop get all String number into  the list
            for (int i = 0; i < NumbersInput.length(); i++) {
                Integer secondTemp = Integer.parseInt(String.valueOf(NumbersInput.charAt(i)));
                IntList.add(secondTemp) ;
            }
            //create  for loop to compare elements
            for (int i = 0; i < Input ; i++) {
                if (IntegerSecondList.get(i) != IntList.get(i)) {
                    ///If  are not equqal ,that index will be 0
                    IntList.add(i,0);
                    System.out.println(IntegerSecondList.get(i));
                }

            }
        }

    }
}