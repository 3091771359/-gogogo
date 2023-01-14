package test;

public class Test2Case1 {
    public static void main(String[] args) {
        /* 给定两个字符串, A和B。
        A的旋转操作就是将A 最左边的字符移动到最右边。
        例如, 若A = 'abcde'，在移动一次之后结果就是'bcdea'
        如果在若干次调整操作之后，A能变成B，那么返回True。
        如果不能匹配成功，则返回false*/

        //分析：
        //1、定义两个字符串
        String strA = "abcde";
        String strB = "AAAA";
        //2、旋转
        boolean result = check(strA, strB);
        System.out.println(result);
    }

    //定义方法，做字符串的比较
    public static boolean check(String strA, String strB) {
        //循环的次数等于字符串的长度
        for (int i = 0; i < strA.length(); i++) {
            //每一次旋转玩。把结果返回上去，进行下一次判断
            strA = revolve(strA);
            //对字符串进行比较
            if (strA.equals(strB)) {
                return true;
            }
        }
        return false;
    }

    //定义方法。对字符串做旋转操作
    //取出0索引的字符，拼接到字符串的后面，返回新的字符串
    public static String revolve(String strA) {
        //取出0索引的字符串
        String frist = strA.substring(0, 1);
        //在截取出剩余的字符串
        String end = strA.substring(1);
        //拼接
        //直接返回拼接的结果
        return end + frist;
    }
}
