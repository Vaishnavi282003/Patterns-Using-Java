public class Q10
{
    public static void main(String[] args)
    {
        int num = 1;
        for(int i=1; i<=5; i++)
        {
            for(int j=4; j>=i; j--)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++)
            {
                System.out.print(num + " ");
                num = num + 1; //num++
            }
            System.out.println();
        }    
    }    
}
