import java.util.*;

public class pattern1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // for(int i=1;i<=4;i++)
        // {
        //     for(int j=1;j<=5;j++)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println("* ");
        // }
        int n;
        int m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row value");
        System.out.println("Enter collumn value");
        n=sc.nextInt();
        m=sc.nextInt();

        sc.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    }
}