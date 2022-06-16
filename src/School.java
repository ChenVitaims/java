public class School {
    //学生学号
    int  sid;
    public  School(String sname,String sclass,String ssex,String shobby){
        System.out.println("这位学生的名字为-----"+ sname);
        System.out.println(sname+"的班级为-----"+sclass);
        System.out.println(sname+"的性别为-----"+ssex);
        System.out.println(sname+"的爱好为-----"+shobby);
        System.out.println(sname+"的学号为-----"+sid);
    }

    public  void  setSid(int age){
        sid = 10;
        sid = age;
    }
    public static void main(String[] args) {
        School school = new School("富贵","高三八班","男","穿越火线");

    }

}
