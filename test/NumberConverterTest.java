public class NumberConverterTest {

    public static void main(String[] args) {
        NumberConverterTest.inttostrTest();
        NumberConverterTest.strtointTest();
        NumberConverterTest.dbltostrTest();
        NumberConverterTest.strtodblTest();

    }

    public static void printResultOfTest(boolean condition, String methodName) {
        if (condition) {
            System.out.printf("method %s test is successful%n", methodName);
        } else {
            System.out.printf("method %s test is fail%n", methodName);
        }
    }


    public static void inttostrTest() {

        String result1 = NumberConverter.inttostr(15);
        String result2 = NumberConverter.inttostr(-15);
        printResultOfTest(result1.equals("15"), "inttostr");
        printResultOfTest(result2.equals("-15"), "inttostr");
    }

    public static void strtointTest() {

        int result1 = NumberConverter.strtoint("15");
        int result2 = NumberConverter.strtoint("-15");
        printResultOfTest(result1 == 15, "strtoint");
        printResultOfTest(result2 == -15, "strtoint");

    }

    public static void dbltostrTest() {

        String result1 = NumberConverter.dbltostr(15.5);
        String result2 = NumberConverter.dbltostr(-15.5);
        printResultOfTest(result1.equals("15.5"), "dbltostr");
        printResultOfTest(result2.equals("-15.5"), "dbltostr");

    }


    public static void strtodblTest() {

        double result1 = NumberConverter.strtodbl("15.5");
        double result2 = NumberConverter.strtodbl("-15.5");
        printResultOfTest(result1 == 15.5, "strtodbl");
        printResultOfTest(result2 == -15.5, "strtodbl");
    }
}
