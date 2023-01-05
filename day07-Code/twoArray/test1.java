package twoArray;

public class test1 {
    public static void main(String[] args) {
        /*
        某商城每一个季度的营业额如下：单位（万元）
        第一季度：22，66，44
        第二季度：77，33，88
        第三季度：25，45，65
        第四季度：11，66，99

        要求计算出每一个季度的总营业额和全年的总营业额
         */
        //1.定义二位数组，记录每一个月份的营业额
        int[][] ArrArr = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99},
        };
        //定义变量用来接收全年总营业额
        int yearSum = 0;
        for (int i = 0; i < ArrArr.length; i++) {
            //i表示每一个一维数组的索引
            //ArrArr[i]表示每个索引中的元素
            int[] arr = ArrArr[i];
            int sum = quarterSum(arr);
            System.out.println("第" + (i + 1) + "季度的营业额为" + sum);
            yearSum = yearSum + sum;
        }
        System.out.println("================================");
        System.out.println("全年的总营业额为" + yearSum);
    }

    //定义求和的方法
    public static int quarterSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i]);
        }
        return sum;
    }
}
