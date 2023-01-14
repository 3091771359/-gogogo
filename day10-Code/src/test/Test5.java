package test;

public class Test5 {
    public static void main(String[] args) {
        /* 给定两个以字符串形式表示的非负整数num1和num2，返回num1和num2的乘积，它们的乘积也表示为字符串形式。
        注意：需要用已有的知识完成。*/

        //不需要考虑乘积过大之后的结果
        //就认为乘积一定是小于int的最大值的


        String num1 = "20";
        String num2 = "10";

        //1.把num1和num2变成对应的整数才可以
        //"123456789"
        //先遍历字符串依次得到每一个字符 '1'  '2'  '3'  '4'  '5'  '6'  '7'  '8'  '9'
        //再把字符变成对应的数字即可     1    2    3     4    5    6    7    8    9
        //把每一个数字组合到一起 123456789

        int sum1 = stringToInt(num1);
        int sum2 = stringToInt(num2);

        //2.利用整数进行相乘

        int sum3 = sum1 * sum2;

        //3.可以把整数变成字符串
        //通过空字符串拼接
        String result = "";
        result = result + sum3;
        System.out.println(result);


    }


    //定义字符串转换为整数的方法
    public static int stringToInt(String num) {
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            //转换为整数
            int c1 = c - 48;
            sum = sum * 10 + c1;
        }
        return sum;
    }
}
