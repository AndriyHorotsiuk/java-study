import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class NumberConverter {


    public static String inttostr(int number) {
        //System.out.println("Input namber for converter to String type");
        //Scanner scan =new Scanner(System.in);
        //int namber=scan.nextInt();

        String[] symbol = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String str = "";
        if (number > 0) {
            while (number > 0) {
                int r = number % 10;
                number = number / 10;
                str = symbol[r] + str;

            }


        } else {
            number = Math.abs(number);
            while (number > 0) {
                int r = number % 10;
                number = number / 10;
                str = symbol[r] + str;
            }

            str = "-" + str;

        }
        return (str);
    }

    public static int strtoint(String number) {
        // System.out.println("Input namber for converter to int type");
        //  Scanner scan = new Scanner(System.in);
        // String namber = scan.nextLine();

        String symbol = "0123456789";
        int intnum = 0;
        String[] num = number.split("");

        int length = num.length;
        if ("-".equals(num[0])) {
            for (int i = 1; i < num.length; i++) {
                length = length - 1;
                intnum = (int) (symbol.indexOf(num[i]) * Math.pow(10, length - 1)) + intnum;


            }


        } else {
            for (int i = 0; i < num.length; i++) {
                intnum = (int) (symbol.indexOf(num[i]) * Math.pow(10, length - 1)) + intnum;
                length = length - 1;

            }


        }
        return (intnum);
    }

    public static String dbltostr(double number) {
        String dstr = " ";
        double mult = 1;
        int i1;
        double b1;
        int i = 0;
        if (number > 0) {
            do {
                i++;
                mult *= 10;

                b1 = number * mult;

                i1 = (int) b1;
            } while (i1 / mult - number != 0);

            String intdbl = NumberConverter.inttostr(i1);

            dstr = intdbl.substring(0, intdbl.length() - i) + "," + intdbl.substring(intdbl.length() - i);
        } else {
            number = -1 * number;
            do {
                i++;
                mult *= 10;

                b1 = number * mult;

                i1 = (int) b1;
            } while (i1 / mult - number != 0);

            String intdbl = NumberConverter.inttostr(i1);

            dstr = "-" + intdbl.substring(0, intdbl.length() - i) + "," + intdbl.substring(intdbl.length() - i);

        }
        // System.out.println(dstr);
        return dstr;
    }

    public static double strtodbl(String number) {
        String[] num = number.split("\\.");
        int intpart = NumberConverter.strtoint(num[0]);
        int doublpart = NumberConverter.strtoint(num[1]);
        double a = doublpart / Math.pow(10, num[1].length());


        return (a);
    }

    public static void test() {
        System.out.println("1-inttostr 2-strtoint 3-strtodbl");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a == 1) {
            System.out.println("Enter an integer umber to convert to a string");
            int intnum = scan.nextInt();
            System.out.println(NumberConverter.inttostr(intnum));
        }
        if (a == 2) {
            System.out.println("Enter a string  number to convert to an integer");
            String strnum1 = scan.nextLine();
            System.out.println(NumberConverter.strtoint(strnum1));
        } else {
            System.out.println("Enter a string  number to convert to an double");
            String strnum = scan.nextLine();
            System.out.println(NumberConverter.strtodbl(strnum));

        }
    /* switch (a){
         case 1:
             System.out.println("Enter an integer umber to convert to a string");
             int intnum = scan.nextInt();
             System.out.println(NamberConverter.inttostr(intnum));
               break;
         case 2:
             System.out.println("Enter a string  number to convert to an integer");
             String strnum1=scan.nextLine();
             System.out.println(NamberConverter.strtoint(strnum1));
              break;
         case 3:
             System.out.println("Enter a string  number to convert to an double");
             String strnum=scan.nextLine();
             System.out.println(NamberConverter.strtodbl(strnum));
               break;
     }*/


    }


}