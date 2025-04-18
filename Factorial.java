import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        int n;
        int f=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter for a number you want to Factorial");
        n=sc.nextInt();
        sc.close();

        for(int i=0;i<=n;i++)
        {
            
            f=i*n;
            
        }
        System.out.println("Factorial of Given Number = "+f);
    }
}
