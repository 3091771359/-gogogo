package stringDemo;

public class StringDemo9 {
    public static void main(String[] args) {
        //subString 方法的使用(字符串截取方法)
        //1、定义一个手机号
        String StringDemo8 = "13888886666";
        //2、截取前三位
        String start = StringDemo8.substring(0, 3);
        //3.截取后四位
        String end = StringDemo8.substring(7);
        //4、拼接
        String result = start + "****" + end;
        //5.打印最终结果
        System.out.println(result);
    }
}
