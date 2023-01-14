package stringbuilderdemo;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //字符串拼接
        //1、创建对象（容器）
        StringBuilder sb = new StringBuilder();

        //2、添加数据
        sb.append("abc");

        //3、获取长度
        int length = sb.length();
        System.out.println(length);

        //4、打印结果
        //打印的不是地址，而是属性
        System.out.println(sb);

        //5、反转
        sb.reverse();
        System.out.println(sb);

        //6、转换为字符串
        String string = sb.toString();
        System.out.println(string);
    }
}
