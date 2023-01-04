package test;

public class test6 {
    public static void main(String[] args) {
        /*
        某系统的数字密码（大于0）。比如1983，采用加密方式进行传输，
        规则如下：
            每位数加上5
            再对10求余，
            最后将所有数字反转，
            得到一串新数。*/
        //分析：
        //1.先把数字密码存入到数组中
        int[] arr = {1, 9, 8, 3};
        //2.加密
        //每位数加上5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }
        //再对10求余
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }
        //将所有数字反转
        //定义两个指针，依次交换,条件是前面的索引必须小于后面的索引
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //得到新数字
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            //每次*10表示顺序拼接
            number = number * 10 + arr[i];
        }
        System.out.println(number);
    }
}
