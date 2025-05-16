public class Q11
{
    public static void main(String[] args)
    {
        for(int i=1; i<=4; i++)
        {
            for(int j=2; j<=i; j++)
            {
                System.out.print(" ");
            }
            for(int k=i; k<=i; k++)
            {
                System.out.print("*");
                /*if(i>=2 && j=i-1)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
                 */
            }
            System.out.println();
        }    
    }   
}
