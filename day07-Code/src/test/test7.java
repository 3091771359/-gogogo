package test;

public class test7 {
    public static void main(String[] args) {
        //需求：
        //把整数上的每一位都添加到数组当中
        //反向推导

        int number = 12345;
        //由于number到最后会变为0，不能参与后面的运算，只能定义一个临时变量记录初始值
        int temp = number;
        //1.需要确定数组长度
        int count = 0;
        //对数字除以10的个数就是数组的长度
        while (number != 0) {
            number = number / 10;
            count++;
        }
        //2.需要定义一个数组存放数据
        //动态初始化
        int[] arr = new int[count];
        //3.数字添加到数组当中
        //没有具体的索引值，定义一个临时索引用来存放数据
        int index = arr.length - 1;
        while (temp != 0) {
            //定义变量用来接受每一次的各位数字
            int ge = temp % 10;
            //算完之后，要减去最后以为，用新生成的数组做后面的运算
            temp = temp / 10;
            //将得到的各位数字存放在数组中
            //村后往前存
            arr[index] = ge;
            index--;
        }
        //4.验证
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
