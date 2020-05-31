package imlementingIterable;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable<String> {

    private LinkedList<String> Urls = new LinkedList<>();

    public UrlLibrary() {

        //Urls.add("https://www.google.com");
        Urls.add("https://www.bbc.com/");
    }

    public class UrlIterator implements Iterator<String> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < Urls.size();

        }

        @Override
        public String next() {

            StringBuilder sb = new StringBuilder();
            try {
                URL url = new URL(Urls.get(index));

                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                

                String line = null;
               
                while( (line = br.readLine()) != null){
                    sb.append(line);
                    sb.append("\n");
                }
                br.close();

            } catch (Exception e) {
            
                e.printStackTrace();
            }
            index++;
            return sb.toString();
    }
 

    }
    @Override
    public Iterator<String> iterator() {
        
        return new UrlIterator();
    }


    /*
    @Override
    public Iterator<String> iterator() {
      
        return Urls.iterator();
    }
    */
    
}