import java.util.Scanner;
public class voteeligible{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter u r age");
        int age = scanner.nextInt();
        if (age >= 18){
            System.out.println("u r eligible");
        }
        else {
            System.out.println("ur not eligible");
        }
        }
        }
    
