/**
 * 插入排序
 * 首先设定插入次数，即循环次数，for(int i=1;i<length;i++)，1个数的那次不用插入。

 设定插入数和得到已经排好序列的最后一个数的位数。insertNum和j=i-1。

 从最后一个数开始向前循环，如果插入数小于当前数，就将当前数向后移动一位。

 将当前数放置到空着的位置，即j+1。
 */
public class InsertSort {

    public static int[] sort(int[] waitSortArray){

        int len = waitSortArray.length;
        int insertNum;
        for (int i = 1; i < len;i++){
            //带插入的数据
            insertNum = waitSortArray[i];
            int j = i -1;
            //将凡是比这个数大的 往后移动一个位置
            while (j >= 0 && waitSortArray[j] > insertNum){
                waitSortArray[j +1] = waitSortArray[j];
                j --;
            }
            //j+1 是当前这i个数array[i] 的正确位置
             waitSortArray[j+1] = insertNum;
        }

        return waitSortArray;
    }
}
