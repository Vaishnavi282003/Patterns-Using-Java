/* 1
  212
 32123
4321234
*/

class Q9
{
    public static void main(String[] args)
    {
        for(int i=1; i<=4; i++)
        {
            for(int j=4; j>=1; j--)
            {
                if(j<=i)
                {
                    System.out.print(j);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for(int k=2; k<=i; k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}