
package kata3_1;

public class Kata3_1 {


    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram();
        
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
        
    }
    
}
