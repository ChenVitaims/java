public class TestArray {
    public static void main(String[] args) {
        double[] myList = {1.1,1.2,1.3,1.4};
        //打印所有数组元素
        for(int i=0;i<myList.length;i++){
            System.out.println(myList[i]+"");
        }
        //计算所有元素的总和
        double total = 0;
        for(int i = 0;i<myList.length;i++){
            total+=myList[i];
        }
        System.out.println("总和为:"+total);

        //查找最大元素
        double max = myList[0];
        for(int i = 0;i<myList.length;i++){
            if (myList[i]>max){
                max = myList[i];
            }
            System.out.println("最大值为:"+max);
            //For-Each循环
            //打印所有数组
            for (double elment:myList){
                System.out.println(elment);
            }

        }
    }

}
