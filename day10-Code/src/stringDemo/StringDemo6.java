package stringDemo;

public class StringDemo6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        String str = arrToString(arr);
        System.out.println(str);
    }

    //1.我要干什么---把数组中的数据拿出来，拼接成一个字符串
    //2.我干这件事，需要什么---需要这个数组
    //3.需不需要返回值---需要返回这个字符串
    public static String arrToString(int[] arr) {
        //需要判断传过来的数组不能为null或者索引不能为0
        if (arr == null) {
            //如果为空，返回一个空值
            return "";
        }
        if (arr.length == 0) {
            //返回值里面什么都没有
            return "[]";
        }
        //如果以上两种情况都不是，表示是一个有数据的数组
        //还需要定义一个原始字符串做拼接操作
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            //对数组的索引进行判断，如果拼接的是最后一个索引的元素。则不需要打印", "
            if (i == arr.length - 1) {
                result = result + arr[i];
            } else {
                result = result + arr[i] + ", ";
            }
        }
        //拼接完之后还需要加一个“]”
        result = result + "]";
        return result;
    }
}
