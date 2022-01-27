//Lab2 Q2
import java.util.Scanner;
public class Average {
    public static void main(String[] args) 
    {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double[] nums = new double[3];

        for (int i = 0 ; i < 3; i++)
        {
            if(input.hasNextDouble()) //if has next input
            {
                nums[i] = input.nextDouble(); //loop through i
            }
            else //only one input
            {
                nums[1] = input.nextDouble(); //ask for second input
                nums[2] = input.nextDouble(); //ask for third inpt

            }
            

        }



        double mean = (nums[0] + nums[1] + nums[2])/3;
        System.out.println("The average of " + nums[0] + " " + nums[1] + " " + nums[2] + " is " + mean);
        input.close();


 
    }

}
