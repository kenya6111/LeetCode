package easy;
public class leet1071 {
    public static String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length()) { // 常に str1 が str2 より長いか同じ長さにする
            return gcdOfStrings(str2, str1);
        } else if (!str1.startsWith(str2)) { // str1 が str2 で始まらない場合、共通部分は存在しない
            return "";
        } else if (str2.isEmpty()) { // str2 が空の場合、str1 が答え
            return str1;
        } else {
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }
    }
    public static void main(String[] args){
        System.out.println(gcdOfStrings("ABCABC", "ABC")); // "ABC"
        System.out.println(gcdOfStrings("ABABAB", "ABAB")); // "AB"
        System.out.println(gcdOfStrings("LEET", "CODE"));   // ""

    }
}
