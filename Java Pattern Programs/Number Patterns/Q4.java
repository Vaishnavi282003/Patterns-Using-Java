/*1
  2 1
  3 2 1
  4 3 2 1
  5 4 3 2 1
 */

public class Q4
{
    public static void main(String[] args)
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=i; j>=1; j--)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }    
    }    
}
