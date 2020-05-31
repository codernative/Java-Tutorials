package imlementingIterable;

public class App {
    public static void main(String[] args) {
        
        UrlLibrary urlObj = new UrlLibrary();

        for(String html : urlObj){
            System.out.println(html.length());
            System.out.println(html);
        }
        
    }
    
}