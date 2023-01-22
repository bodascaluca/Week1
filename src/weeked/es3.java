package weeked;

import java.util.Scanner;

public class es3 {
    public static void main(String[] args) {
        /*
         *Da PDF
         * */
        Scanner scan = new Scanner(System.in);
        System.out.println("Dammi una data");
        int data = scan.nextInt();

        if(data%400==0)
            System.out.println("Anno bisestile");
        else
            if(data%4==0 && !(data%100==0))
                System.out.println("Anno bisestile");
            else
                System.out.println("Anno non bisestile");
    }
}
