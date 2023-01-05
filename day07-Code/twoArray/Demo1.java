package twoArray;

public class Demo1 {
    public static void main(String[] args) {
        //定义二维数组并遍历
        //1.定义
        //每一个一维数组占一行
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };
        //2.获取元素的值
        //arr[i][j]
        //i:表示一维数组的索引值
        //j:表示每一个一维数组的值
        System.out.println(arr[0][2]);//3
        System.out.println(arr[1][0]);//5
        //3.二维数组的遍历
        //第一层循环用来遍历每一个一维数组的索引值
        System.out.println("==============================");
        for (int i = 0; i < arr.length; i++) {
            //第二次循环用来遍历每一个一维数组的元素
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        //每一个一维数组遍历完成之后在换行
        System.out.println();
    }
}
