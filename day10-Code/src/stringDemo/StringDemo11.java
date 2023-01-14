package stringDemo;

public class StringDemo11 {
    public static void main(String[] args) {
        //replace字符替换方法
        String talk = "你TM的玩的真菜，以后别玩了！！！";
        String result = talk.replace("TM", "**");
        System.out.println(result);
    }
}
