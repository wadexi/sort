/**
 * 希尔排序
 * 基本思想：算法先将要排序的一组数按某个增量d（n/2,n为要排序数的个数）分成若干组，
 * 每组中记录的下标相差d.对每组中全部元素进行直接插入排序，
 * 然后再用一个较小的增量（d/2）对它进行分组，在每组中再进行直接插入排序。
 * 当增量减到1时，进行直接插入排序后，排序完成。
 */
public class HillSort {

    public static int[] sort(int[] waitArray){

        int len = waitArray.length;

        while (len != 0){
            len = len/2;

            for (int i = 0; i < len; i++){

               for (int j = i + len;j < waitArray.length; j+= len){

                   int temp = waitArray[j];//要插入的元素
                   int k = j -len;

                   while ( k >= 0 && waitArray[k] > temp){
                        waitArray[k + len] = waitArray[k];
                       k-=len;
                   }
                   waitArray[k+len] = temp;
               }


            }
        }

        return waitArray;
    }
}
