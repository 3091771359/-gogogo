package test2;

public class GoodsTest {
    public static void main(String[] args) {
        //1、定义goods类型的数组
        Goods[] arr = new Goods[3];
        //2、创建对象
        Goods g1 = new Goods("001", "华为P40", 5999.0, 80);
        Goods g2 = new Goods("002", "小米13", 4999.0, 100);
        Goods g3 = new Goods("003", "电动牙刷", 299.0, 50);
        //3、把商品对象存入数组中
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g1;
        //4、遍历
        for (int i = 0; i < arr.length; i++) {
            //i表示索引，arr[i]表示元素
            Goods goods = arr[i];
            System.out.println(goods.getId() + ", " + goods.getName() + ", " + goods.getPrice() + ", " + goods.getCount());
        }
    }
}
