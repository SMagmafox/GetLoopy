import java.util.Random;
import java.util.Scanner;

public class DieRollar
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        Random gen = new Random();
        boolean continueYN = true;
        int die1=0;
        int die2=-1;
        int die3=-2;
        int dieSum = 0;
        int dieRoll = 0;
        do {
            System.out.println("\tDie1\tDie2\tDie3\tDieSum\tRoll#");
            System.out.println("\t------------------------------------");

            while (die1 != die2 || die1 != die3 || die2 != die3) {
                die1 = gen.nextInt(6) + 1;
                die2 = gen.nextInt(6) + 1;
                die3 = gen.nextInt(6) + 1;
                dieSum = die1 + die2 + die3;
                dieRoll++;
                System.out.printf("%6d\t%6d\t%6d\t%6d\t%6d\n", die1, die2, die3, dieSum, dieRoll);
            }
            System.out.print("Do you want to roll for triples again?[Y/N]: ");
            if(console.nextLine().equalsIgnoreCase("Y"))
            {
                continueYN = true;
                die1=0;
                die2=-1;
                die3=-2;
                dieSum = 0;
                dieRoll = 0;
            }else{
                continueYN = false;
            }
        }while(continueYN);
    }
}
