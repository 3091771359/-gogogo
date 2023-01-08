package test3;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        //1、创建数组，接受对象
        Car[] arr = new Car[3];
        //2、创建对象，数据手动输入
        Scanner sc = new Scanner(System.in);
        //循环创建对象
        for (int i = 0; i < arr.length; i++) {
            Car c = new Car();
            System.out.println("请输入第" + (i + 1) + "辆车的品牌");
            String blook = sc.next();
            //输入完之后需要存入到对象中
            c.setBlook(blook);
            System.out.println("请输入第" + (i + 1) + "辆车的价格");
            int price = sc.nextInt();
            c.setPrice(price);
            System.out.println("请输入第" + (i + 1) + "辆车的颜色");
            String color = sc.next();
            c.setColor(color);
            //讲创建的对象存放到数组当中
            arr[i] = c;
        }
        System.out.println("===============================");
        for (int i = 0; i < arr.length; i++) {
            //现在数组中存的是对象的名字
            //在通过对象的名字调取不同的属性，依次表示不同的对象
            Car car = arr[i];
            System.out.println(car.getBlook() + ", " + car.getPrice() + ", " + car.getColor());
        }
    }
}
