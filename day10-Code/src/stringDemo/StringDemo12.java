package stringDemo;

public class StringDemo12 {
    public static void main(String[] args) {
        //replace字符替换方法
        String talk = "你玩的很好，以后别TM玩了，你个菜逼，我CNM的";
        //定义一个数组，用来存储敏感词
        String[] arr = {"TMD", "CNM", "MLGB", "逼","TM"};
        //循环对每一个字符做判断
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i], "***");
        }
        System.out.println(talk);
    }
}
