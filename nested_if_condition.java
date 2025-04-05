import java.util.*;
public class nested_if_condition 
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value for a and b");
        a=sc.nextInt();
        b=sc.nextInt();
        sc.close();
        if(a>b){

            if(a%2 ==0)

             System.out.println("Special Number");

            else
            System.out.println("Not Special Number");
        }

        else
        System.out.println("b is Greater Than a");

    }
    
}
