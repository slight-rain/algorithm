package sort;

public class BubbleSort {
    public static void sort(int[] a){

        //是否有序的标志

        for(int i=0;i<a.length;i++){
            //length-1-i控制边界，防止数组越界,并把排好的元素排除在外
            boolean flag=false;
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    //或者用异或
                    //不需要变量进行置换
                    a[j]=a[j]+a[j+1];
                    a[j+1]=a[j]-a[j+1];
                    a[j]=a[j]-a[j+1];
                    flag=true;
                }
            }
            if(!flag){
                return;
            }
        }
    }


}
