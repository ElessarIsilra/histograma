package javaapplication1;
import java.util.HashMap;
public class JavaApplication1 {

    public static void main(String[] args) {
        
        int[] array = {2,2,11,4,2,6,11,2,3,5,11,5};
        Histogram histo=new Histogram(array);
        HashMap<Integer, Integer> histograma =histo.getHisto();
        for(Integer key : histograma.keySet()){
            System.out.println(key+" : "+ histograma.get(key));
        }
    }
}
