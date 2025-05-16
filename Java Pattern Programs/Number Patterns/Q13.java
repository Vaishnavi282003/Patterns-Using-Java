/*   1
 *  1 1
 * 1 2 1
 *1 3 3 1
 1 4 6 4 1
 */


public class Q13
{
    public static void main(String[] args)
    {
        for(int i=1; i<=5; i++)
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
