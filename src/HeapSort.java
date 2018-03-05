/**
 * 堆排序 构建一个完全二叉树
 * 基本思想：堆排序是一种树形选择排序，是对直接选择排序的有效改进。
 * 完全二叉树： 若设二叉树的深度为h，除第 h 层外，其它各层 (1～h-1) 的结点数都达到最大个数，第 h 层所有的结点都连续集中在最左边，这就是完全二叉树。
 */
public class HeapSort {

    public static  int[] sort(int[] array){
        //构建大顶堆
        for(int i = array.length/2-1;i >=0 ; i--){
            adjustHeap(array,i,array.length);
        }

        //将大顶堆和尾元素进行交换
        for (int i = array.length -1; i>0; i--){
            swapValue(array,0,i);
            adjustHeap(array,0,i);
        }

        return array;
    }

    /**
     *
     * @param array
     * @param i 当前元素索引
     * @param arraylen
     */
    public static void adjustHeap(int[] array,int i,int arraylen){
        //调整堆序列
        int temp = array[i];
        for (int k = 2*i + 1;k < arraylen;k = 2*k+1){
            if( k+1 < arraylen && array[k] < array[k+1]){
                k++;
            }

            if(array[k] > temp){
                array[i] = array[k];
                i = k;
//                swapValue(array,k,i);
            }else {
                break;
            }
        }
        array[i] = temp;

    }

    public static void swapValue(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}
