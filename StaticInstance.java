
public class StaticInstance {

    static int noInstance = 0;
    {
        noInstance += 1;
    }

    public static void main(String[] args) {
        
        StaticInstance si1 = new StaticInstance(); 
        StaticInstance si2 = new StaticInstance(); 
        StaticInstance si3 = new StaticInstance(); 
        System.out.println(StaticInstance.noInstance);
    }
    
}  