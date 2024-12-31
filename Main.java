import java.util.List;

public class Main
{
    // instance variables - replace the example below with your own
    public static void main(){
            for (int i = 0; i < 28; i++) {
            int years = 1990 + i;
            String path = "C:/Users/zacha/Documents/School/Spring 2024/Java/CSV Files for midterm/names" + years + ".csv";

            MyFileReader fileReader = new MyFileReader(path);
            List<Baby> babies = fileReader.readAndRecord();
    
            List<List<Object>> firstSet = ListCreator.splitDataFirstSet(babies);
            List<List<Object>> secondSet = ListCreator.splitDataSecondSet(babies);
    
            DataSorter.sortByString(firstSet, 1); 
            DataSorter.sortByString(secondSet, 1); 
            
            System.out.println("List of Male Babies from "+ years + " :\n");
            for (List<Object> data : firstSet) {
                System.out.println(data);
            }
            
            System.out.println("List of Female Babies from "+ years + " :\n");
            for (List<Object> data : secondSet) {
                System.out.println(data);
            }
        }
    }
}
