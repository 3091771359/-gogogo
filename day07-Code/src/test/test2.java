package test;

public class test2 {
    public static void main(String[] args) {
        //判断101~200之间有多少个质数，并打印所有的质数。
        //1.定义循环获取所有的数字
        //3.定义count进行统计
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            //2.定义内部循环对每一个数字进行判断，打标记
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    //说明不是一个质数
                    flag = false;
                    //直接跳出内部循环，进行下一个数字的判断
                    break;
                }
            }
            if (flag) {
                count++;
                System.out.println(i + "是一个质数");
            }
        }
        System.out.println("一共有" + count + "个质数");
    }
}
