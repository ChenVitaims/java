public class Puppy {
    int puppyAge;

    public Puppy(String name) {
        //这个构造器只有一个参数:name
        System.out.println("小狗的名字为:" + name);
    }

    public void setAge(int age) {
        puppyAge = age;
    }

    public int getAge() {
        System.out.println("小狗的年龄为:" + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
        /*创建对象*/
        Puppy myPuppy = new Puppy("白白");
        /*通过方法来设定age*/
        myPuppy.setAge(1);
        /*调用另一个方法来获取age*/
        myPuppy.getAge();

    }


}
