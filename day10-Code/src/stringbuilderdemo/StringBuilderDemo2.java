package stringbuilderdemo;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        //链式编程
        //调用方法的时候不需要定义变量去接收结果，可以继续使用方法调用其他方法
        StringBuilder sb = new StringBuilder();

        int len = sb.append("aaa").append("bbb").append("ccc").append("ddd").length();
        System.out.println(len);
        System.out.println(sb);
    }
}
