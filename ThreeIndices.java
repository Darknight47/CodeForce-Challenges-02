import java.util.Scanner;

public class ThreeIndices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int antal = input.nextInt();
        while(antal-- > 0)
        {
            int sze = input.nextInt();
            int[] arr = new int[sze];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = input.nextInt();
            }
            boolean found = false;
            int a = 0, b = 0, c = 0;
            for (int i = 1; i < arr.length - 1; i++) {
                if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]){
                    found = true;
                    a = i;
                    b = i + 1;
                    c = i + 2;
                    break;
                }
            }
            if(found)
            {
                System.out.println("YES");
                System.out.println(a + " " + b + " "+ c);
            }
            else{
                System.out.println("NO");
            }
        }
        input.close();

    }
}
