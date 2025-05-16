public class Q7
{
    public static void main(String[] args)
    {
        for(int i=1; i<=5; i++)
        {
            int num =1;
            for(int j=4; j>=i; j--)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++)
            {
                System.out.print(num + " ");
                num = num * (i-k) / k;
            }
            System.out.println();
        }    
        for(int i=4; i>=1; i--)
        {
            int num = 1;
            for(int j=4; j>=i; j--)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++)
            {
                System.out.print(num + " ");
                num = num * (i-k) / k;
            }
            System.out.println();
        }
    }    
}
