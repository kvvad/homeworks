package homework1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("****  ****      *      *   *");
        System.out.println("*     *  *     * *     ** **");
        System.out.println("**    ****    *   *    * * *");
        System.out.println("*     *      *******   *   *");
        System.out.println("****  *     *       *  *   *\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter a symbol: ");
        // Elements for strings to make a word HELLO from symbols
        String s = sc.nextLine();
        String sn = s + " ";
        String ssp = " ";
        String s2sp = "  ";
        String s3 = s + s + s;
        String s4 = s + s + s + s;
        String she = sn + ssp + sn + s4 + ssp;
        String s3sp = ssp + s2sp;
        String s4sp = s2sp + s2sp;
        // Ready strings
        String str1 = she + sn + s3sp + sn + s3sp + s2sp + s + s;
        String str2and4 = sn + ssp + sn + s + s4sp + sn + s3sp + sn + s4sp + sn + ssp + s;
        String str3 = s4 + ssp + s3 + s2sp + sn + s3sp + sn + s3sp + sn + s3sp + s;
        String str5 = she + s4 + ssp + s4 + ssp + s2sp + s + s;

        System.out.println(str1);
        System.out.println(str2and4);
        System.out.println(str3);
        System.out.println(str2and4);
        System.out.println(str5);
    }
}