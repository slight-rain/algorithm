import sort.BubbleSort;

public class Main {
    public static void main(String[] args) {
        int[] a=new int[]{4,2,6,3,5,8,9,1,5};
        BubbleSort.sort(a);
        for(int i:a){
            System.out.print(i+" ");
        }

    }
}
