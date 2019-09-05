import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public int numJewelsInStones(String J, String S){
        int ans = 0;
        for (char s: S.toCharArray())
            for (char j: J.toCharArray())
                if (j == s){
                    ans++;
                    break;
                }
        return ans;
    }

    public int numJewelsInStonesHashSet(String J, String S){
        Set<Character> Jset = new HashSet();
        for (char j: J.toCharArray())
            Jset.add(j);

        int ans = 0;
        for (char s: S.toCharArray())
            if (Jset.contains(s))
                ans++;

         return ans;
    }
}
