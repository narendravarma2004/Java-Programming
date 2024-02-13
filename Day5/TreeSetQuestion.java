import java.util.TreeSet;

public class TreeSetQuestion {
    public static void main(String[] args)
    {
        TreeSet<String> K=new TreeSet<String>();
        K.add("Saveetha");
        K.add("School");
        K.add("Of");
        K.add("Engineering");
        System.out.println(K);
        K.remove("Of");
        System.out.println(K);

    }
}
