public class Q12
{
    public static void main(String[] args)
    {
        for(int i=1; i<=4; i++)
        {
            for(int j=3; j>=i; j--)
            {
                System.out.print(" ");
            }
            for(int k=4; k>=4; k--)
            {
                System.out.print("*");
                /*if(i>=2 && k>1)
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
