package test;

import java.util.Random;

public class test10 {
    public static void main(String[] args) {
        /* 需求：
        一个大V直播抽奖，奖品是现金红包，分别有{2, 588 , 888, 1000, 10000}五个奖金。
        请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。
        打印效果如下：（随机顺序，不一定是下面的顺序）
            888元的奖金被抽出
            588元的奖金被抽出
            10000元的奖金被抽出
            1000元的奖金被抽出
            2元的奖金被抽出
        */
        //分析：
        //思路2：把奖池中奖项的顺序打乱，在遍历
        //1.定义数组，打乱顺序
        int[] arr = {2, 588, 888, 1000, 10000};
        //定义随机抽取
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //随机抽取索引
            int randomTndex = r.nextInt(arr.length);
            //在用随机抽取的索引值与原来的数字调换位置
            int temp = arr[i];
            arr[i] = arr[randomTndex];
            arr[randomTndex] = temp;
        }
        //2.遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
