package test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
    /* 机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
    按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，
    淡季（11月到来年4月）头等舱7折，经济舱6.5折。*/
        //分析：
        //1.键盘录入机票的原价，月份，头等舱或经济舱
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的原价：");
        int price = sc.nextInt();
        System.out.println("请输入购买机票的月份：");
        int month = sc.nextInt();
        System.out.println("请输入购买的是头等舱还是经济舱 0 表示头等舱 1表示经济舱");
        int seat = sc.nextInt();
        //2.先判断月份是旺季还是淡季
        if (month >= 5 && month <= 10) {
            //旺季
            //调用方法计算最终价格
            price = getPrice(seat, price, 0.9, 0.85);
            //3.继续判断当前机票是头等舱还是经济舱
//            if (seat == 0) {
//                //头等舱
//                //4.根据实际情况计算出对应的价格
//                price = (int) (price * 0.9);
//            } else if (seat == 1) {
//                //经济舱
//                price = (int) (price * 0.85);
//            } else {
//                System.out.println("没有这个舱位");
//            }
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            //淡季
            //调用方法计算最终价格
            price = getPrice(seat, price, 0.7, 0.65);
            //3.继续判断当前机票是头等舱还是经济舱
//            if (seat == 0) {
//                //头等舱
//                //4.根据实际情况计算出对应的价格
//                price = (int) (price * 0.7);
//            } else if (seat == 1) {
//                //经济舱
//                price = (int) (price * 0.65);
//            } else {
//                System.out.println("没有这个舱位");
//            }
        } else {
            System.out.println("您输入的月份是一个非法数据");
        }
        System.out.println(price);
    }

    //由于代码中有多处重复代码，还可以优化，抽取方法
    //1.我要干什么？  根据座位和优惠力度算出最终的价格
    //2.我干这件事需要什么？  原价 优惠力度 头等舱还是经济舱
    //3.需不需要返回值？    需要返回值
    //Ctrl + Alt + M 快速抽取方法
    public static int getPrice(int seat, int price, double v1, double v2) {
        if (seat == 0) {
            //头等舱
            //4.根据实际情况计算出对应的价格
            price = (int) (price * v1);
        } else if (seat == 1) {
            //经济舱
            price = (int) (price * v2);
        } else {
            System.out.println("没有这个舱位");
        }
        return price;
    }
}
