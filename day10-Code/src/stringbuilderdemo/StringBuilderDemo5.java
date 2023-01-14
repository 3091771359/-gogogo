package stringbuilderdemo;

import java.util.StringJoiner;

public class StringBuilderDemo5 {
    //StringJoiner
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        String str = sj.add("aaa").add("bbb").add("ccc").toString();
        System.out.println(str);
    }
}
