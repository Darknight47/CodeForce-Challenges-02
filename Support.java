import java.util.Scanner;

public class Support
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int antal = input.nextInt();
        while(antal-- > 0)
        {
            int sze = input.nextInt();
            String str = input.next();
            char[] arr = str.toCharArray();
            int counter = 0;
            for (int i = 0; i < sze; i++) {
                char temp = arr[i];
                if(temp == 'Q'){
                    counter++;
                }else{
                   counter--;
                   if(counter < 0)
                        counter = 0;
                }         
            }
            if(counter == 0)
            {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        input.close();
    }
}