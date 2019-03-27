package sort;

public class ShellSort {
    public static void sort(int[] a){
        int increament,i,j;
        for(increament=a.length/2;increament>0;increament/=2){
            //遍历的同时会把各组都走完，不用再按组遍历了。
            for(i=0;i<a.length;i++){
                int temp=a[i];
                //先将组内最小数确定
                for(j=i+increament;j<a.length;j+=increament){
                    if(a[i]>a[j]){
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
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
