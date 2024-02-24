import java.util.Scanner;
public class Addrannum{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any number between 0 and 1000");
        int n=input.nextInt();
        int first_dig=n%10;
        int remaining_dig=n/10;
        int second_dig=remaining_dig%10;
        remaining_dig=remaining_dig/10;
        int sum =first_dig+second_dig+remaining_dig;
        System.out.println("the additon of the digit is :"+sum);



    }
    
}
