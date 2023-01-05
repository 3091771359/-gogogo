package test;

import java.util.Random;

public class test9 {
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
        //1.定义数组，存储奖池奖项
        int[] arr = {2, 588, 888, 1000, 10000};
        //2.定义新数组，用来存储抽到的奖项
        //新数组的长度和arr的长度相等
        int[] newArr = new int[arr.length];
        //3.抽奖
        //抽五次
        Random r = new Random();
        for (int i = 0; i < 5; ) {
            //抽取随机索引
            int randomIndex = r.nextInt(arr.length);
            //把随机索引的值拿出来
            int result = arr[randomIndex];
            //对抽到的结果进行判断，如果存在新数组中，就要重新抽取，如果不存在，就放在新数组中
            //调用方法看是否存在
            boolean flag = contains(newArr, result);
            if (!flag) {
                //取反，不存在的条件下，把结果存在新数组中
                newArr[i] = result;
                //只有存放数据的时候新数组的索引才会增加
                i++;
            }
        }
        //4.遍历新数组的结果
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }

    //定义方法，用来判断抽取出来的结果是否存在于数组中
    //存在：true
    //不存在：false
    public static boolean contains(int[] arr, int result) {
        for (int i = 0; i < arr.length; i++) {
            //表示奖池中有这个奖项
            if (arr[i] == result) {
                return true;
            }
        }
        return false;
    }
}
