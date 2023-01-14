import java.util.Scanner;
class sumOfFive {
    public static void main(String[] args) {
        int i,n;
        int sum=0;
        Scanner in=new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            System.out.print("Enter number "+(i+1)+":");
            n=in.nextInt();
            sum=sum+n;
        }
        System.out.println("Sum of five numbers is "+sum);
    }
}
