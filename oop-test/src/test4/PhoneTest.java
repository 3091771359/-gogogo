package test4;

public class PhoneTest {
    public static void main(String[] args) {
        //1、创建数组
        Phone[] arr = new Phone[3];
        //2.创建三个手机对象
        Phone p1 = new Phone("小米", 1999, "暗夜紫");
        Phone p2 = new Phone("华为", 5999, "海峰蓝");
        Phone p3 = new Phone("VIVO", 3999, "钻石白");
        //3、将手机对象保存在数组当中
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        //4、求三部手机的价格总和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            sum = sum + phone.getPrice();
        }
        //5、计算平均价格
        int avg = sum / arr.length;
        System.out.println(avg);
    }
}
