// Student ID:
// First Name:
// Last Name:
//
// Team Members:
// 1.6030300741 พัชร อัครประสิทธิ์
// 2.6030300318 ณัฐพงค์ ตื่มสูงเนิน
// 3.6030300075 กัลยารัตน์ ศรีชัย
import java.util.Scanner;
import java.util.ArrayList;

public class Problem3_1 {
    public static void main(String[] args) {
        // TODO
        Scanner sn = new Scanner(System.in);
        int number;
        int number2;
        int i = 1;
        int sum=0;
        System.out.println("Input");
        number = sn.nextInt();

        while ( i <= number ) {
            System.out.print(">");
            number2 = sn.nextInt();
            ++i;
            if(number2%4==0)
            {
                if(sum<number2)
                {
                    sum=number2;
                }
            }

        }
        System.out.println("Output");     
        System.out.print(sum);
    }
}
