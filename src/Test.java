public class Test {
    public void pupAge() {
        int age = 0;
        age = age + 10;
        System.out.println("小狗的年龄是:" + age);
    }
    public void myAge() {

        int  myage = 10;
        myage = myage +100000;
        System.out.println("我的年龄为:" + myage);
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.pupAge();
        Test myage = new Test();
        myage.myAge();
    }
}
