package test;

public class Test2Case2 {
    public static void main(String[] args) {
        /* 给定两个字符串, A和B。
        A的旋转操作就是将A 最左边的字符移动到最右边。
        例如, 若A = 'abcde'，在移动一次之后结果就是'bcdea'
        如果在若干次调整操作之后，A能变成B，那么返回True。
        如果不能匹配成功，则返回false*/

        //分析：
        //1、定义两个字符串
        String strA = "abcde";
        String strB = "bcdea";
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
    //把字符串转换为数组，在通过改变其位置来旋转
    public static String revolve(String strA) {
        char[] arr = strA.toCharArray();//["a","a""a"]
        //先把 0索引上的字符拿出来
        char frist = arr[0];
        //把剩余的字符依次往前移动，从1索引开始
        for (int i = 1; i < arr.length; i++) {
            //往前移动
            arr[i - 1] = arr[i];
        }
        //移动完毕之后，再把取出来的放到最后面
        arr[arr.length - 1] = frist;
        String str = new String(arr);
        return str;
    }
}
