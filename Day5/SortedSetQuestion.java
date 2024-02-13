import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetQuestion {
    public static void main(String[] args)
    {
        SortedSet<String> N= new TreeSet<String>();
        N.add("Narendra");
        N.add("Varma");
        N.add("Kamparaju");
        System.out.println(N);
        N.remove("Varma");
        System.out.println(N);

        }
    }
