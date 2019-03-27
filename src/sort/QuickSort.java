package sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] a=new int[]{4,2,6,3,5,8,9,1,5};
        quickSort(a,0,a.length-1);
        for(int i:a){
            System.out.print(i+" ");
        }

    }

    private static void quickSort(int[] a,int low,int high){
        System.out.println("low="+low+" high="+high);
        if(high<=low){
            System.out.println("low="+low+" high="+high);
            return;
        }
        int pivot=pivot(a,low,high);
        quickSort(a,low,pivot-1);
        quickSort(a,pivot+1,high);
    }
    private static int  pivot(int[] a,int low,int high){
        for(int i:a){
            System.out.print(i+" ");
        }
        int pivot=a[low];
        while(high>low){
            //没加等号导致无限死循环（当第一个元素和最后一个元素相等的情况
            while(a[high]>=pivot&&high>low){
                high--;
            }
            if(low!=high) {
                //小数前移
                a[low] = a[high];
            }
            //没加等号导致无限死循环（当第一个元素和最后一个元素相等的情况
            while(a[low]<=pivot&&high>low){
                low++;
            }
            if(low!=high) {
                //大数后移
                a[high] = a[low];
            }
        }
        a[low]=pivot;

        System.out.println("\n"+low);

        return low;
    }

}
