package javaapplication1;

import java.util.HashMap;

public class JavaApplication1 {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 1, 24, 2, 1, 4, 21, 5, 2};

        String[] array1 = {"Ana", "Juan", "Pedro", "Ana", "Juan", "Ana", "Juan", "Pedro"};
        Histogram<String> histo = CalculaHisto.computeHisto(array1);
        Histogram<Integer> histo2 = CalculaHisto.computeHisto(array);
        for (Object key : histo.keySet()) {
            System.out.println(key + " : " + histo.get(key));
        }
        for (Object key : histo2.keySet()) {
            System.out.println(key + " : " + histo2.get(key));
        }
    }
}
