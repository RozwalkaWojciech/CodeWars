package javer.codewars.fourkyu;

/*
Create a function that takes a positive integer and returns the next bigger number that can be formed by rearranging its digits.
For example:
12 ==> 21
513 ==> 531
2017 ==> 2071
If the digits can't be rearranged to form a bigger number, return -1 (or nil in Swift):
9 ==> -1
111 ==> -1
531 ==> -1
*/
public class NextBiggerNumberWithTheSameDigits {
    public static long nextBiggerNumber(long n) {

        String strNum = String.valueOf(n);
        var sb = new StringBuilder(strNum);

        for (int i = strNum.length() - 1; i > 0; i--) {
            if (strNum.charAt(i) == '0' && strNum.charAt(i - 1) != '0') {
                sb.setCharAt(i - 1, strNum.charAt(i));
                sb.setCharAt(i, strNum.charAt(i - 1));
                i--;
            } else if (strNum.charAt(i) > strNum.charAt(i - 1)) {
                sb.setCharAt(i - 1, strNum.charAt(i));
                sb.setCharAt(i, strNum.charAt(i - 1));

                return Long.parseLong(sb.toString());
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(nextBiggerNumber(311));
        //expected:<19009> but was:<10909>
        System.out.println(nextBiggerNumber(10990));
        //expected:<154983735> but was:<154983753>
        System.out.println(nextBiggerNumber(154983573));
        //expected:<1234567908> but was:<1234568709>
        System.out.println(nextBiggerNumber(1234567890));
    }
}
