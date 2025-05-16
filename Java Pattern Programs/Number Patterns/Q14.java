/*   0
 *  0 1
 * 0 1 0
 *0 1 0 1
 0 1 0 1 0
 */

public class Q14
{
    public static void main(String[] args)
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=4; j>=i; j--)
            {
                System.out.print(" ");
            }
            for(int k=0; k<i; k++)
            {
                System.out.print((k%2) + " ");
            }
            System.out.println();
        }    
    }    
}
