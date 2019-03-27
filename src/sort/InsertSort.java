package sort;
/*
插入排序
时间复杂度为n的平方
 */
public class InsertSort {
    public static void sort(int[] a){
        for(int i=1;i<a.length;i++){
            //待插入的元素
            int guard=a[i];
            //记录插入位置
            int location;
            //二次遍历进行插入
            for(int j=i-1;j>=0;j--){
                if(guard<a[j]){
                    //元素后移
                    a[j+1]=a[j];
                    location=j;
                }else{
                    //不需要移动
                    location=j+1;
                    break;
                }
                //之前未加这一行导致数据丢失
                a[location]=guard;
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
