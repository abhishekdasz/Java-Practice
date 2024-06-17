public class Pr18 
{
    public static void main(String[] args) 
    {
        int no = 1634;
        int temp1 = no;
        int length = 0;
        
        while(temp1!=0)
        {
            length = length + 1;
            temp1 = temp1 / 10;
        }
        System.out.println(length);





        int temp2 = no;
        int rem;
        int arm = 0;
        while(temp2 != 0)
        {
            int mul = 1;
            rem = temp2%10;
            for(int i=1; i<=length; i++)
            {
                mul = mul * rem;
            }
            arm = arm + mul;
            temp2 = temp2 / 10;
        }

        if(arm == no)
        {
            System.out.println("Armstrong number.");
        }
        else 
        {
            System.out.println("Not armstrong number.");
        }
    }    
}
