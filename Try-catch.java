import java.util.Scanner;


class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the numaritor and denominator ");

            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = x/y;

            System.out.println("Divition = " + z);


        } catch (ArithmeticException ex) {
            System.out.println("Catch block \n" + 
                                    ex.toString());

        } finally {
            System.out.println("Finally block \n" +
                                    "System is devoloped for learning purposes \n" + 
                                    "System closing..........");
            sc.close();
            
        }  
    }
}