package test6;

public class StudentTest {
    public static void main(String[] args) {
         /*定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
        学生的属性：学号，姓名，年龄。
        要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        要求2：添加完毕之后，遍历所有学生信息。
        要求3：通过id删除学生信息
        如果存在，则删除，如果不存在，则提示删除失败。
        要求4：删除完毕之后，遍历所有学生信息。
        要求5：查询数组id为“2”的学生，如果存在，则将他的年龄+1岁*/

        //分析：
        //1.创建数组
        Student[] arr = new Student[3];
        //2.创建学生对象
        Student stu1 = new Student(1, "zhangsan", 18);
        Student stu2 = new Student(2, "lisi", 18);
        Student stu3 = new Student(3, "wangwu", 18);
        //3.将学生对象存放在数组当中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        //4.在添加一个学生对象
        Student stu4 = new Student(4, "zhaoliu", 18);
        //5.对学生学号进行唯一性判断
        //5.1如果学号重复，提醒学号重复
        //5.2如果没有重复，则添加到数组当中
        boolean flag = contains(arr, stu4.getId());
        if (flag) {
            //学号重复
            System.out.println("您输入的学号重复，无需添加");
        } else {
            //没有重复
            //6.添加对象判断
            //6.1添加对象时。如果数组满了，就需要定义新数组，在把老数组的元素复制到新数组中，在把新的对象添加到新数组最后
            //6.2添加对象时。如果数组没有满，只需要将新对象添加到数组的后面
            int count = getCount(arr);
            if (count == arr.length) {
                //表示数组满了
                //在把新的对象添加到新数组最后
                Student[] newArr = createNewArr(arr);
                newArr[count] = stu4;
                printArr(newArr);
                System.out.println("=================================");


                /*要求3：通过id删除学生信息
                如果存在，则删除，如果不存在，则提示删除失败。*/
                int index1 = getIndex(newArr, 4);
                if (index1 >= 0) {
                    //存在
                    newArr[index1] = null;
                    //要求4：删除完毕之后，遍历所有学生信息.
                    printArr(newArr);
                } else {
                    //不存在
                    System.out.println("删除失败");
                }
                System.out.println("=================================");
                //要求5：查询数组id为“2”的学生，如果存在，则将他的年龄+1岁
                int index = getIndex(arr, 2);
                if (index >= 0) {
                    //表示存在
                    Student student = arr[index];
                    //把更改后的年龄添加到变量里面
                    int newAge = student.getAge() + 1;
                    //在通过set方法，把修改后的值塞回去
                    student.setAge(newAge);
                    printArr(newArr);
                } else {
                    //表示不存在
                    System.out.println("您查找的信息不存在");
                }


            } else {
                //没有存满
                //只需要将新对象添加到数组的后面
                //count还表示下一次添加数据的数组下标
                arr[count] = stu4;
                printArr(arr);


                System.out.println("=================================");
                int index1 = getIndex(arr, 5);
                if (index1 >= 0) {
                    //存在
                    arr[index1] = null;
                    //要求4：删除完毕之后，遍历所有学生信息.
                    printArr(arr);
                } else {
                    //不存在
                    System.out.println("删除失败");
                }
                //要求5：查询数组id为“2”的学生，如果存在，则将他的年龄+1岁
                int index = getIndex(arr, 2);
                if (index >= 0) {
                    //表示存在
                    Student student = arr[index];
                    //把更改后的年龄添加到变量里面
                    int newAge = student.getAge() + 1;
                    //在通过set方法，把修改后的值塞回去
                    student.setAge(newAge);
                    printArr(arr);
                } else {
                    //表示不存在
                    System.out.println("您查找的信息不存在");
                }
            }
        }
    }

    //定义方法对索引进行判断
    public static int getIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            //依次获取数组中的每一个学生对象
            Student stu = arr[i];
            //对stu进行非空判断
            if (stu != null) {
                //获取数组中的学生id
                int id1 = stu.getId();
                if (id1 == id) {
                    //如果找到了，就返回索引
                    return i;
                }
            }
        }
        //如果找完都没有找到,就返回-1,因为索引没有-1
        return -1;
    }

    //要求2：添加完毕之后，遍历所有学生信息。
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student student = arr[i];
            //如果数组中没有空值，就打印当前数组
            if (student != null) {
                System.out.println(student.getId() + ", " + student.getName() + ", " + student.getAge());
            }
        }
    }

    //定义新数组，在把老数组的元素复制到新数组中
    public static Student[] createNewArr(Student[] arr) {
        //定义一个新数组
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    //定义方法，判断数组是否满了
    //如果数组中有null，就表示没有满
    public static int getCount(Student[] arr) {
        //定义计数器，
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        //返回数组中存储的个数
        return count;
    }

    //定义方法对学号进行唯一性判断
    //1.我要干嘛？  唯一性判断
    //2.我干这件事情，需要什么才能完成？ 数组 id
    //3.调用处是否需要继续使用方法的结果？ 必须返回
    public static boolean contains(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            //依次取出数组中的学号
            //与ID进行比较，如果为真，则表示重复，相反为不重复
            Student stu = arr[i];
            //如果stu为null，就不能调用方法，所以要对stu做判断
            if (stu != null) {
                int id1 = stu.getId();
                if (id1 == id) {
                    return true;
                }
            }
        }
        //只有所有的都判断完毕，没有找到才会返回false
        return false;
    }
}
