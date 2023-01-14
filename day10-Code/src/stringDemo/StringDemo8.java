package stringDemo;

import java.util.Scanner;

public class StringDemo8 {
    public static void main(String[] args) {
        //发票金额转换
        //1、键盘录入金额，做合法性判断
        //因为对位数进行判断，所以要用到循环
        Scanner sc = new Scanner(System.in);
        //money定义在外面
        int money;
        while (true) {
            System.out.println("请输入一个整数");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                //合法数据
                break;//不需要重新录入
            } else {
                //不合法
                System.out.println("超出范围");
            }
        }
        //2、将合法的金额从各位依次取出来，通过大写转换方法转换为大写，在拼接在一块
        //定义变量对转换后的结果做拼接操作
        String numberStr = "";
        while (true) {//2135
            //取出money中的各位
            int ge = money % 10;
            //每一次取完之后都要减去去掉以为
            money = money / 10;
            String getcapitalNumber = getcapitalNumber(ge);
            numberStr = getcapitalNumber + numberStr;
            if (money == 0) {
                break;
            }
        }

        //3、在按照发票要求，给大写数字前面补0
        //分析总长度和数字的位数之差，确定补几位0
        int count = 7 - numberStr.length();
        for (int i = 0; i < count; i++) {
            numberStr = "零" + numberStr;
        }

        //4、在通过遍历一个数字一个单位的方法给大写数字添加单位
        //定义一个数组按照顺序存放单位
        String[] arr = {"佰", "拾", "万", "仟", "佰", "拾", "元",};
        //遍历numberStr，在把单位插入进去，（（先遍历数字在遍历单位））
        String result = "";
        for (int i = 0; i < numberStr.length(); i++) {
            //取出
            char c = numberStr.charAt(i);
            //因为长度相同，所以数字和单位可以用一个循环
            result = result + c + arr[i];
        }

        //5.打印最终结果
        System.out.println("======================================");
        System.out.println(result);
    }

    //1、我要干什么？---将小写数字转换为大写数字
    //2、干这件事，需要什么？---需要每一个小写数字
    //3、需不需要返回值？---需要将转换后的大写数字返回
    public static String getcapitalNumber(int number) {
        //用查表法，将所有大写按照所有放到数组中
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖",};
        //直接根据数字对应的索引返回对应的大写就可以
        return arr[number];
    }
}
