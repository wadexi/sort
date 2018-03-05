public class Utils {

    public static String arrayToString(int[] array){
        StringBuffer stringBuffer = new StringBuffer("[");
        for (int i = 0; i < array.length;i++){
            stringBuffer.append(array[i]).append(",");
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
