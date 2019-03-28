package sort;

/*
希尔排序其实就是先让元素尽可能的有序。真正完成排序的其实是increment为1的时候进行的插入排序
 */
public class ShellSort {
    public static void sort(int[] a){
        int increment,i,j;
        for(increment=a.length/2;increment>0;increment/=2){
            //遍历的同时会把各组都走完，不用再按组遍历了。
            for(i=increment;i<a.length;i++){
                int temp=a[i];
//                int location=-1;
                //插入排序的二次循环定位
                for(j=i-increment;j>=0;j=j-increment){
                    //之前用的是if(a[i]<a[j]),但a[i]是会变的，所以导致排序出错。
                    if(temp<a[j]){
                        a[j+increment]=a[j];
//                        location=j;
                    }else{
//                        location=j+increment;
                        break;
                    }
                }
                a[j+increment]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] a=new int[]{4,2,6,3,5,8,9,1,5};
        sort(a);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
