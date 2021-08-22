import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task1 {
    public static void printWords () {
        Set<String> set = new HashSet<>();
        set.add("расцветали");
        set.add("яблони");
        set.add("и");
        set.add("грушы");
        set.add("поплыли");
        set.add("туманы");
        set.add("над");
        set.add("над");
        set.add("рекой");
        set.add("выходила");
        set.add("на");
        set.add("берег");
        set.add("Катюша");
        set.add("на");
        set.add("высокий");
        set.add("берег");
        set.add("на");
        set.add("крутой");

        Iterator<String> iter = set.iterator();
        while(iter.hasNext()){
            String str = iter.next();
            if(str.equals("на"))
                iter.remove();
                System.out.println(set);
        }
    }
}
