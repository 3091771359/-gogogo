package twoArray;

public class Demo2 {
    public static void main(String[] args) {
        /*
        二维数组的动态初始化格式：
            数据类型[][] 数组名 = new 数据类型[m][n]
            m:表示这个二维数组，可以存放一维数组的个数
            n:表示每一个一维数组，可以存放多少个元素
         */
        //1.利用动态初始化创建二维数组
        int[][] arr = new int[3][5];
        //2.给二维数组赋值
        arr[0][0] = 10;
        //3.遍历二维数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
