import java.util.ArrayList;
import java.util.List;
public class ListCreator
{
    
    public static List<List<Object>> splitDataFirstSet(List<Baby> babies) {
        List<List<Object>> firstSet = new ArrayList<>();
        for (Baby baby : babies) {
            int int0 = baby.getInt0();
            String string1 = baby.getString1();
            int int1 = baby.getInt1();
            List<Object> data = new ArrayList<>();
            data.add(int0);
            data.add(string1);
            data.add(int1);
            
            firstSet.add(data);
        }
        return firstSet;
    }

    public static List<List<Object>> splitDataSecondSet(List<Baby> babies) {
        List<List<Object>> secondSet = new ArrayList<>();
        for (Baby baby : babies) {
            int int0 = baby.getInt0();
            String string2 = baby.getString2();
            int int2 = baby.getInt2();
            List<Object> data = new ArrayList<>();
            data.add(int0);
            data.add(string2);
            data.add(int2);
            
            secondSet.add(data);
        }
        return secondSet;
    }
}
