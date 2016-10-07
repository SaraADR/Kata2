package kata2;


import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
       // Integer[] data= {1,1,1,100,2,4,5,6,8,8,4,5,6,2,-4};
         String[] data= {"uno", "dos", "uno", "uno", "dos", "juan", "yop"};
        Histogram histo = new Histogram (data);
        Map<String,Integer> Hgr = histo.getHistogram();
       
        
        for(String key : Hgr.keySet()){
            System.out.println(key + "-->" + Hgr.get(key));
        }
        
        
        
    }
}
