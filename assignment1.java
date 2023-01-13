import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner in=new Scanner(System.in);
        int n;
        n=in.nextInt();
        if(n>0)
        {
            System.out.println("Positive number");
        }
        else if(n<0)
        {
            System.out.println("Negative number");
        }
        else
        {
            System.out.println("Neither Negative nor Positive");   
        }
        
    }
}
