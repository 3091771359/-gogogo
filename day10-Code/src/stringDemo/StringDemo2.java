package stringDemo;

public class StringDemo2 {
    public static void main(String[] args) {
        //字符串比较
        String str1 = new String("abc");
        String str2 = "abc";


        boolean result1 = str1.equals(str2);
        System.out.println(result1);


        String str3 = new String("abc");
        String str4 = "ABC";

        //忽略大小写
        //只能是英文状态下
        boolean result2 = str3.equalsIgnoreCase(str4);
        System.out.println(result2);
    }
}
