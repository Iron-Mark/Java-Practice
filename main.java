import java.util.Scanner;
public class main {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input first number: ");
        
        String firstNumber = sc.nextLine();
        int intFirstnumber = Integer.parseInt(firstNumber);

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Input second number: ");
        String secondNumber = sc2.nextLine();
        int intSecondnumber = Integer.parseInt(secondNumber);

        intFirstnumber = 125;
        intSecondnumber = 24;

        System.out.println("Expected Output: ");
        System.out.println(intFirstnumber + " + " + intSecondnumber + " = " + (intFirstnumber + intSecondnumber));
        System.out.println(intFirstnumber + " + " + intSecondnumber + " = " + (intFirstnumber - intSecondnumber));
        System.out.println(intFirstnumber + " + " + intSecondnumber + " = " + (intFirstnumber * intSecondnumber));
        System.out.println(intFirstnumber + " + " + intSecondnumber + " = " + (intFirstnumber / intSecondnumber));
        System.out.println(intFirstnumber + " + " + intSecondnumber + " = " + (intFirstnumber % intSecondnumber));
    }


}
