
import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        String S=scan.nextLine();
        int count = 0;
        int[] alpabat = new int[26 - count];
        char[] Schar = S.toCharArray();
        Arrays.fill(alpabat, -1);

        for (int i = 0; i < Schar.length; i++) {

            int num = Schar[i] - 'a';

            if (alpabat[num] == -1) {

                alpabat[num] = i;
            }

        }

        for (int j = 0; j < alpabat.length; j++) {
            System.out.println(alpabat[j]);

        }

    }

}