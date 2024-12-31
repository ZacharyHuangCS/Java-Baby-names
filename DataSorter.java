import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DataSorter {
    public static void sortByString(List<List<Object>> data, int stringIndex) {
        Collections.sort(data, new Comparator<List<Object>>() {
            @Override
            public int compare(List<Object> list1, List<Object> list2) {
                String str1 = (String) list1.get(stringIndex);
                String str2 = (String) list2.get(stringIndex);
                return str1.compareTo(str2);
            }
        });
    }

    public static void sortByInt(List<List<Object>> data, int intIndex) {
        Collections.sort(data, new Comparator<List<Object>>() {
            @Override
            public int compare(List<Object> list1, List<Object> list2) {
                Integer int1 = (Integer) list1.get(intIndex);
                Integer int2 = (Integer) list2.get(intIndex);
                return int1.compareTo(int2);
            }
        });
    }
}
