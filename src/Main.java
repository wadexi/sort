public class Main {


    public static void main(String[] args) {
        int[] array = new int[]{11,9,13,2,18,8,16,19,1,5,7,10,12,20,14,3,15,6,17,4};
        System.out.println("待排序数组");
        System.out.println(Utils.arrayToString(array));

        array = new int[]{11,9,13,2,18,8,16,19,1,5,7,10,12,20,14,3,15,6,17,4};
        System.out.println("插入排序!");
        System.out.println(Utils.arrayToString(InsertSort.sort(array)));

        array = new int[]{11,9,13,2,18,8,16,19,1,5,7,10,12,20,14,3,15,6,17,4};
        System.out.println("希尔排序!");
        System.out.println(Utils.arrayToString(HillSort.sort(array)));

        System.out.println("简单选择排序!");
        array = new int[]{11,9,13,2,18,8,16,19,1,5,7,10,12,20,14,3,15,6,17,4};
        System.out.println(Utils.arrayToString(SimpleChoiceSort.sort(array)));
        System.out.println("堆排序!");
        array = new int[]{11,9,13,2,18,8,16,19,1,5,7,10,12,20,14,3,15,6,17,4};
        System.out.println(Utils.arrayToString(HeapSort.sort(array)));

        System.out.println("冒泡排序!");
        array = new int[]{11,9,13,2,18,8,16,19,1,5,7,10,12,20,14,3,15,6,17,4};
        System.out.println(Utils.arrayToString(BubbleSort.sort(array)));

        System.out.println("快速排序!");
        array = new int[]{11,9,13,2,18,8,16,19,1,5,7,10,12,20,14,3,15,6,17,4};
        System.out.println(Utils.arrayToString(FastSort.quickSort(array,0,array.length-1)));

        System.out.println("归并排序!");
        array = new int[]{11,9,13,2,18,8,16,19,1,5,7,10,12,20,14,3,15,6,17,4};
        System.out.println(Utils.arrayToString(MergeSort.sort(array,0,array.length-1)));

        System.out.println("基数排序!");
        array = new int[]{11,9,13,2,18,8,16,19,1,5,7,10,12,20,14,3,15,6,17,4};
        System.out.println(Utils.arrayToString(BaseSort.baseSort(array)));

//        System.out.println(Math.pow(10,2));//10的2次幂 值为100
    }
}
