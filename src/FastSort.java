/**
 * 快速排序
 * 基本思想：选择一个基准元素,通常选择第一个元素或者最后一个元素,通过一趟扫描，将待排序列分成两部分,一部分比基准元素小,一部分大于等于基准元素,此时基准元素在其排好序后的正确位置,然后再用同样的方法递归地排序划分的两部分。
 */
public class FastSort {

    public static int[] quickSort(int[] a,int start,int end){
            if(start < end){
                int i = start;
                int j = end;
                int temp;
                int baseNum = a[start];

                while (i <= j){
                    while (i < end && a[i] < baseNum){
                        i++;
                    }

                    while (j >start && a[j] > baseNum){
                        j--;
                    }
                    if(i <= j){
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                        i++;
                        j--;
                    }
                }

                if(j > start){
                    quickSort(a,start,j);
                }

                if(i < end){
                    quickSort(a,i,end);
                }

            }

        return a;
    }
}
