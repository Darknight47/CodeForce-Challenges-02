import java.util.Scanner;

public class Administrator
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int antal = input.nextInt();
        int pingASucced = 0;
        int pingAMissed = 0;
        int pingBSucced = 0;
        int pingBMissed = 0;
        for(int i = 0; i < antal; i++)
        {
            int ping = input.nextInt();
            int tempSucc = 0;
            int tempMiss = 0;
            int j = 0;
            while(j < 2)
            {
                tempSucc = input.nextInt();
                tempMiss = input.nextInt();
                j += 2;
            }
            if(ping == 1)
            {
                pingASucced += tempSucc;
                pingAMissed += tempMiss;
            }
            else
            {
                pingBSucced += tempSucc;
                pingBMissed += tempMiss;
            }
        }
        int pingATotal = pingASucced + pingAMissed;
        int halfPingA = pingATotal / 2;
        if(pingASucced >= halfPingA)
        {
            System.out.println("LIVE");
        }
        else
        {
            System.out.println("DEAD");
        }
        int pingBTotal = pingBSucced + pingBMissed;
        int halfPingB = pingBTotal / 2;
        if(pingBSucced >= halfPingB)
        {
            System.out.println("LIVE");
        }
        else
        {
            System.out.println("DEAD");
        }

        input.close();
    }
}