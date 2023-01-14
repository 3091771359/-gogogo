package stringDemo;

public class StringDemo10 {
    public static void main(String[] args) {
        //输出身份信息
        //1、定义身份ID
        String id = "622701200109234272";
        //2、截取对应的年月日
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);
        System.out.println("信息如下：");
        System.out.println("出生年月：" + year + "年" + month + "月" + day + "日");
        //3、截取倒数第二位，对性别进行判断，利用ASCII码表对字符进行转换，然后再判断
        char gender = id.charAt(16);
        //类型转换
        int num = gender - 48;
        if (num % 2 == 0) {
            System.out.println("性别为：女");
        } else {
            System.out.println("性别为：男");
        }
    }
}
