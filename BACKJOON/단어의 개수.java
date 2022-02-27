import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String str = scan.nextLine();

        String[] arry = str.split(" ");
        if(arry.length!=0) {

            if (arry[0].equals("")) {
                System.out.println((arry.length - 1));

            } else {
                System.out.println(arry.length);
            }

        }
        else {
            System.out.println(0);
        }
    }

}
