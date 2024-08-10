package generics_collections.lesson_5_2_13;

import java.util.HashSet;
import java.util.Set;

public class SymmetricTest {
    public static Set symmetricDifference(Set set1, Set set2) {
        Set symmetricDiff = new HashSet(set1);
        symmetricDiff.addAll(set2);

        Set temp = new HashSet(set1);
        temp.retainAll(set2);
        symmetricDiff.removeAll(temp);
        return symmetricDiff;
    }
}
