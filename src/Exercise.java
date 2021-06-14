public class Exercise {

    public static void main(String[] args) {

        String str =  "abcde";
        System.out.println (midСhar(str));

        String str2 =  "abcd";
        System.out.println (midСhar(str2));

        String str3 =  "abcd";
        System.out.println (swap(str3));

        String str4 =  "abcde";
        System.out.println (swap(str3));

    }


    public static String midСhar(String str) {
        int strLen = str.length();
        if (strLen % 2 != 0) {
            String mid = str.substring(strLen / 2, strLen / 2 + 1);
            return mid;
        } else{
            String mid = str.substring(strLen / 2 - 1, strLen / 2 + 1);
            return mid;
        }
    }

    public static String swap(String str) {
        int strLen = str.length();
        if (strLen % 2 != 0) {
            String newStr = str.substring(strLen / 2 + 1);
            String mid = str.substring(strLen / 2, strLen / 2 + 1);
            str = str.substring(0, strLen / 2);
            newStr = newStr + mid + str;
        return newStr;
        } else{
            String newStr = str.substring(strLen / 2);
            str = str.substring(0, strLen / 2);
            newStr = newStr + str;
            return newStr;
        }
    }
}
