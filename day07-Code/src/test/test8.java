package test;

public class test8 {
    public static void main(String[] args) {
        /*某系统的数字密码（大于0）。比如1983，采用加密方式进行传输，
        规则如下：
            每位数加上5
            再对10求余，
            最后将所有数字反转，
            得到一串新数。
            按照以上规则进行解密：
            比如1983加密之后变成8346，解密之后变成1983
        */
        //1.定义数组，存放加密的数字
        int[] arr = {8, 3, 4, 6};
        //2.将数组中的数字反转
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //3.这些数字是通过加5得到的，由此可得出0~9加上5的范围是5到14
        //我们知道5~9对10取余还是本身，所以保持不变
        //10~14是0~4加上10得到的
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4) {
                arr[i] = arr[i] + 10;
            }
            //5~9之间的数字不需要做操作
        }
        //4.最后再减去第一步加上的5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 5;
        }
        //5.打印最终的结果
        //定义变量做拼接操作
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
        System.out.println(number);
    }
}
