package javaapplication1;

import java.util.HashMap;

public class JavaApplication1 {

    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,1,24,2,1,4,21,5,2};
        
        String[] array1 = {"Ana", "Juan", "Pedro", "Ana", "Juan", "Ana", "Juan", "Pedro"};
        Histogram histo = new Histogram(array1);
        HashMap<String, Integer> histograma = histo.getHisto();
        for (Object key : histograma.keySet()) {
            System.out.println(key + " : " + histograma.get(key));
        }
    }
}
