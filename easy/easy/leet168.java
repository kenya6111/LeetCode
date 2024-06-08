package easy;
public class leet168 {
    static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // 1ベースのため1を引く
            System.out.println(columnNumber%26);
            System.out.println('A'+ columnNumber%26);
            char ch = (char) ('A' + columnNumber % 26);
            result.append(ch);
            System.out.println(result);
            columnNumber /= 26;
        }

        return result.reverse().toString();
    }

    public static String convertToTitle2(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            char c = (char) ('A' + columnNumber % 26);
            result.insert(0, c);
            columnNumber /= 26;
        }
        return result.toString();
    }

    public static void main(String[] args){
        System.out.println(convertToTitle2(1));                                                                         // "A"
        System.out.println(convertToTitle2(28));                                                                                                 // "AB"
        System.out.println(convertToTitle2(701));                                                                                                   // "ZY"
        System.out.println(convertToTitle2(1000));                                                                                                          // "ZY"

        // StringBuilder result2 = new StringBuilder();
        // result2.append('A');
        // result2.append('B');
        // result2.append('C');
        // System.out.println(result2);
        // System.out.println(result2.reverse().toString());


        // System.out.println(0%23);
        // System.out.println(24%23);
        // System.out.println(26%23);

        // System.out.println((int)'A');
        // System.out.println((char)'A');
        // System.out.println((char)('A' + 1));
        //System.out.println('A'+1);
        //System.out.println("A"+1);
        System.err.println((char)65);
        System.err.println((char)90);
        System.err.println((char)91);
        System.err.println((char)93);
        System.err.println((char)98);
        System.err.println((char)99);
        System.err.println((char)112);
        System.out.println(0000000111/10);

    }

}
