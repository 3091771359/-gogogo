package test;

import java.util.Random;
import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        System.out.println("*********************************");
        System.out.println("++++++欢迎来到双色球抽奖系统+++++++");
        System.out.println("*********************************");
        //1.生成中奖号码
        //定义数组接收方法传过来的值
        int[] arr = createNumber();
        System.out.println("==================================");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i] + " ");
        }
        System.out.println();
        System.out.println("==================================");
        //2.用户输入中奖号码
        //定义新数组接收方法传过来的值
        int[] userinputArray = userinputNumber();
        //3.判断用户中奖情况
        //需要统计红球于蓝球的个数
        System.out.println("----------------------------------");
        int redCount = 0;
        int blueCount = 0;
        //利用双层循环对输入的号码与生成的号码作比较
        //外层循环，表示取一个用户输入的红色号码
        //红球只有6个，所以-1
        for (int i = 0; i < userinputArray.length - 1; i++) {
            int redNumber = userinputArray[i];
            //内层循环用来拿外层循环获取的数与生成的号码作比较
            for (int j = 0; j < arr.length - 1; j++) {
                //如果找到了，就直接跳出循环，进行下一个数的判断
                if (redNumber == arr[j]) {
                    redCount++;
                    break;
                }
            }
        }
        //对蓝球做判断
        //把用户输入的蓝球号码取出来
        int blueNumber = userinputArray[userinputArray.length - 1];
        if (blueNumber == arr[arr.length - 1]) {
            blueCount++;
        }
        //根据红球和蓝球的个数对中奖情况做判断
        if (redCount == 6 && blueCount == 1) {
            System.out.println("恭喜你，中奖1000万");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜你，中奖500万");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜你，中奖3000元");
        } else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)) {
            System.out.println("恭喜你，中奖200元");
        } else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)) {
            System.out.println("恭喜你，中奖10元");
        } else if ((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1) || (redCount == 0 && blueCount == 1)) {
            System.out.println("恭喜你，中奖5元");
        } else {
            System.out.println("***感谢您的参与，欢迎下次光临***");
        }
    }

    //定义用户输入中奖号码
    public static int[] userinputNumber() {
        //需要定义数组接收用户输入号码
        int[] arr = new int[7];
        //键盘录取红球号码，1~33之间而且不重复
        Scanner sc = new Scanner(System.in);
        //需要录入6个红球号码，需要循环
        for (int i = 0; i < 6; ) {
            System.out.print("请输入第" + (i + 1) + "个红球号码:");
            int redNumber = sc.nextInt();
            //对输入的红球号码进行判断
            if (redNumber >= 1 && redNumber <= 33) {
                //可以正常录入
                //调用方法对红球号码做进一步判断，看是否存在于数组中
                boolean flag = contains(arr, redNumber);
                if (!flag) {
                    arr[i] = redNumber;
                    i++;
                } else {
                    System.out.println("***您输入的号码已经存在，请重新输入***");
                }
            } else {
                System.out.println("***您输入的红球号码超出范围***");
            }
        }
        //需要录入一个蓝球号码，1~16之间
        //由于输入的蓝球号码可能超出范围,需要重新录入,所以需要循环
        //Ctrl + Alt + T快速生成循环结构
        while (true) {
            System.out.print("请输入一个蓝球号码:");
            int blueNumber = sc.nextInt();
            if (blueNumber >= 1 && blueNumber <= 16) {
                //蓝球号码放在数组最后
                arr[arr.length - 1] = blueNumber;
                //输入正确，结束循环
                break;
            } else {
                System.out.println("***您输入的蓝球号码超出范围***");
            }
        }
        return arr;
    }

    //定义方法，用来生成红球和蓝球号码,用数组来接收
    public static int[] createNumber() {
        //生成数组，用于接收号码
        int[] arr = new int[7];
        //生成红球号码，红球是五个，而且五个号码都是唯一的
        Random r = new Random();
        //范围
        for (int i = 0; i < 6; ) {
            int rednumber = r.nextInt(33) + 1;
            //把生成的号码添加到数组当中，并且进行唯一性判断
            boolean flag = contains(arr, rednumber);
            //如果数组中没有，则添加
            if (!flag) {
                arr[i] = rednumber;
                //只有当不重复时i才++
                i++;
            }
        }
        //生成蓝球号码，1~16之间，只有一个
        int blueNumber = r.nextInt(16) + 1;
        //蓝球位置在最后一位
        arr[arr.length - 1] = blueNumber;
        //最后返回数组，供主方法使用
        return arr;
    }

    //定义方法，做号码唯一性判断
    //true:表示重复，需要重新生成
    //flase:表示不重复，添加
    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}
