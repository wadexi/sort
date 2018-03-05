/**
 * 简单选择排序
 * 基本思想：在要排序的一组数中，选出最小的一个数与第一个位置的数交换；

 然后在剩下的数当中再找最小的与第二个位置的数交换，如此循环到倒数第二个数和最后一个数比较为止。
 */
public class SimpleChoiceSort {


    public static int[] sort(int[] array){

        for(int i =  0; i < array.length - 1;i++){

//            int minNum = array[i];
            int minNumIndex = i;
            for (int j = i + 1;j < array.length;j++){
                //查找出最小
                if(array[j] < array[minNumIndex]){
                    minNumIndex = j;
                }
            }
            int temp = array[minNumIndex];
            array[minNumIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
