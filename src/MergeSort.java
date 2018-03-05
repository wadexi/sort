/**
 * 归并排序
 * 速度仅次于快速排序，内存少的时候使用，可以进行并行计算的时候使用。

 选择相邻两个数组成一个有序序列。

 选择相邻的两个有序序列组成一个有序序列。

 重复第二步，直到全部组成一个有序序列。
 */
public class MergeSort {

    public static int[] sort(int[] a,int left,int right){

        int center = a.length/2;

        FastSort.quickSort(a,left,center);
        FastSort.quickSort(a,center + 1,right);
        merage(a,left,center + 1,right);
        return a;
    }

    public static void merage(int[] a,int left,int center,int right){

        int[] tempArray = new int[a.length];
        int tempIndex = left;
        int mid = center;

        while (left < center && mid <=right){
            if(a[left] < a[mid]){
                tempArray[tempIndex++] = a[left++];
            }else {
                tempArray[tempIndex++] = a[mid++];
            }
        }

        while (left < center){
            tempArray[tempIndex++] = a[left++];
        }

        while (mid <= right){
            tempArray[tempIndex++] = a[mid++];
        }

        int temp = 0;
        while (temp < a.length){
            a[temp] = tempArray[temp ++];
        }
    }
}
