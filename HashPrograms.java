/* Hash Table, Hash Map and Linked Hash Map */
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Set;

public class HashPrograms {
    public static void main(String[] args) {
        Hashtable<String, String> ht = new Hashtable<String, String>();
        HashMap<String, String> hm = new HashMap<String, String>();
        HashMap<Integer, String> myMap = new HashMap<Integer, String>();// Q
        LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
        ht.put("Microsoft", "Windows 11");
        ht.put("IBM", "IBM Quantum");
        ht.put("Google", "Fushia OS");

        hm.put("1", "Tizen OS");
        hm.put("Apple", "Mac OS");
        hm.put("1", "z/OS");

        lhm.put("Microsoft", "Windows 11");
        lhm.put("IBM", "IBM Quantum");
        lhm.put("Google", "Fushia OS");

        System.out.println("Hash Table:");
        System.out.println(ht);

        System.out.println("- - - - - - - - - - - -");

        System.out.println("Hash Map:");
        System.out.println(hm);

        System.out.println("- - - - - - - - - - - - -");

        System.out.println("Linked Hash Map:");
        System.out.println(lhm);

        System.out.println("- - - - - - - - - - ");
        System.out.println("Hash Table Values:");
        Set<String> keys_ht = ht.keySet();

        for (String s : keys_ht)
            System.out.println(ht.get(s));

        System.out.println("- - - - - - - - - - ");
        System.out.println("Hash Map Values:");
        Set<String> keys_hm = hm.keySet();

        for (String s : keys_hm)
            System.out.println(hm.get(s));

        System.out.println("- - - - - - - - - - ");
        System.out.println("Linked Hash Map Values:");
        Set<String> keys_lhm = lhm.keySet();

        for (String s : keys_lhm)
            System.out.println(lhm.get(s));
    }
}
