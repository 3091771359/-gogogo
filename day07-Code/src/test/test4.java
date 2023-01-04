package test;

public class test4 {
    public static void main(String[] args) {
        /*
        把原来数组中的值，复制到新数组当中 */
        //1.定义老数组
        int[] arr = {1, 2, 3, 4, 5};
        //2，定义新数组   新数组的长度和老数组相等
        int[] newArr = new int[arr.length];
        //3.循环遍历老数组的值，并赋予新数组
        for (int i = 0; i < arr.length; i++) {
            //i表示数组的索引，新老数组的索引是一样的
            newArr[i] = arr[i];
        }
        System.out.print("{");
        for (int i = 0; i < newArr.length; i++) {
            if (i == newArr.length - 1) {
                System.out.print(newArr[i]);
            } else {
                System.out.print(newArr[i] + ", ");
            }
        }
        System.out.print("}");
    }
}
