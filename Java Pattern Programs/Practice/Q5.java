class Q5
{
    public static void main(String args[])
    {
        int cnt = 0;
        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=i; j++)
            {
                cnt = cnt + 1; //cnt++
                System.out.print(cnt*2 + " ");
            }
            System.out.println();
        }
    }
}