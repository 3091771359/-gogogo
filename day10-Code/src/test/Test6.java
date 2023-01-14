package test;

public class Test6 {
    public static void main(String[] args) {
      /* 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。
        返回字符串中最后一个单词的长度。
        单词是指仅由字母组成、不包含任何空格字符的最大子字符串。

        示例 1：输入：s = "Hello World“	输出：5
        解释：最后一个单词是“World”，长度为5。*/

        String str = "Hello World";

        //倒着遍历
        //直到遇到空格为止
        //那么遍历的次数就是单词的长度

        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                break;
            } else {
                count++;
            }
        }
        System.out.println(count);
    }
}