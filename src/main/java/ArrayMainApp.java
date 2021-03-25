import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMainApp {
    public static void main(String[] args) {

        String [] arr = new String[]{"A", "B"};

        changePosition(arr);
        toArrayList(arr);


    }
    public static <T> void changePosition(T[] array){
        T element;
        for (int i = 1; i < array.length; i++) {
            element = array[i - 1];
            array[i - 1] = array[i];
            array[i] = element;
        }
        System.out.println (Arrays.toString(array));
    }

    public static <T> void toArrayList(T[] array){
        List <T> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(list);
    }


}