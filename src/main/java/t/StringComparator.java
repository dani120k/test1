package t;



import java.util.Comparator;


public class StringComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        try {
            Integer first = Convertor.convert(o1);
            Integer second = Convertor.convert(o2);
            return first.compareTo(second);
        } catch (Exception ex){
            ex.printStackTrace();
            return 0;
        }

    }

}
