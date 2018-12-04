import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;


/**
 * Created by alekspribysh on 9/7/15.
 */
public class ArrayR {
    String[] array = {"2", "3", "a", "b", "c", "3", "2", "2"};

    public void array1() {

        Map<Integer, String> map = new TreeMap<Integer, String>();
        int c;
        for (int i = 0; i < array.length; i++) {
            for (int k = i + 1; k < array.length; k++) {
                if (array[i].equals(array[k])) {
                    c = k - i;
                    map.put(c, array[i]);

                }
            }
        }

        Map.Entry<Integer, String> entry = map.entrySet().iterator().next();
        String value = entry.getValue();
        System.out.println(value);
    }


    public void array2() {
        int c = array.length;
        String x = null;
        for (int i = 0; i < array.length; i++) {
            for (int k = i + 1; k < array.length; k++) {
                if (array[i].equals(array[k])) {
                    int b = k - i;
                    if (b < c) {
                        c = b;
                        x = array[i];

                    }

                }
            }
        }
        System.out.println(x);
    }


    public void array3(){

        int [] arrayP = new int[5];
        for (int k =0; k < arrayP.length; k++){
            arrayP[k] = (int) (Math.random()*10);

        }


        for (int i = 0; i < arrayP.length - 1; i++) {
    /* устанавливаем начальное значение минимального индекса */
            int min = i;
	    /* находим индекс минимального элемента */
            for (int j = i + 1; j < arrayP.length; j++) {
                if (arrayP[j] < arrayP[min]) {
                    min = j;
                }
            }
                    /* меняем значения местами */
            int temp = arrayP[i];
            arrayP[i] = arrayP[min];
            arrayP[min] = temp;
            System.out.print(arrayP[i] + " ");
        }
    }


}



