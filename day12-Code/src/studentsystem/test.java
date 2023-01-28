package studentsystem;

import java.util.ArrayList;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        //打印最终的验证码
        System.out.println(getCode());
    }

    private static String getCode() {
        //1.创建一个集合存储大小写字母，都是字符（Character）
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }
        StringBuilder sb = new StringBuilder();
        //2.抽取4个字符,在集合当中
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            //获取到随机索引
            int index = r.nextInt(list.size());
            //在根据随机索引获取随机字符
            char c = list.get(index);
            //拼接在循环内完成，将随机字符拼接到sb当中
            sb.append(c);
        }
        //3.将一个随机数字添加到字符串当中
        int number = r.nextInt(10);
        sb.append(number);
        //4.将字符串转换为字符数组，在打乱顺序
        char[] arr = sb.toString().toCharArray();
        //获取字符数组的随机索引
        int randomIndex = r.nextInt(arr.length);
        char temp = arr[randomIndex];
        arr[randomIndex] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        //返回一个新的字符串(将数组转换为字符串)
        return new String(arr);
    }
}
