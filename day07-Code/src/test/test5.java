package test;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        //在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。
        // 选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
        //分析：
        //1.定义方法，存储键盘录入六位评委的打分（0~100）
        int[] scoreArr = getScores();
        //2.定义方法，找出评分的最大值
        int max = getMax(scoreArr);
        //3.定义方法，找出评分的最小值
        int min = getMin(scoreArr);
        //4.定义方法，计算出评分的总和
        int sum = getSum(scoreArr);
        //5.计算除最高分和最低分之外的平均分
        int avg = (sum - max - min) / (scoreArr.length - 2);
        //6.打印最终成绩
        System.out.println("---------------------------");
        System.out.println("最终平均成绩为" + avg);
    }

    //1.我要干嘛？定义一个数组，用来存储6名评委的打分（0~100）
    //2.我需要什么？都不需要
    //3.干完了这件事情，是否需要返回？必须返回
    public static int[] getScores() {
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {
            System.out.println("请输入评委的打分");
            int score = sc.nextInt();
            //条件限制（0~100）之间
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                //循环判断条件写在里面，表示只有输入正确的数据，才会往下一个索引中录入数据
                //条件不合法，循环判断条件不执行
                i++;
            } else {
                System.out.println("您输入的成绩超出了范围，请重新输入");
            }
        }
        return scores;
    }

    //定义求最大值的方法
    public static int getMax(int[] scoreArr) {
        int max = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if (scoreArr[i] > max) {
                max = scoreArr[i];
            }
        }
        return max;
    }

    //定义求最大值的方法
    public static int getMin(int[] scoreArr) {
        int min = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if (scoreArr[i] < min) {
                min = scoreArr[i];
            }
        }
        return min;
    }

    //定义求和的方法
    public static int getSum(int[] scoreArr) {
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum = sum + scoreArr[i];
        }
        return sum;
    }
}
