import java.util.Arrays;
import java.util.List;

public class Streams {
  //  public static void main(String[] args) {
    private List<Integer> get() {

        //  Sum all elemnets using streams
        List<Integer> numbers = Arrays.asList(1,4,3);
        int add = numbers.stream().mapToInt(Integer :: intValue).filter(a -> a> 1).sum();
        return List.of(add);
    }

    //To write a program maximum element using streams
    private List<Integer> getMaxValue() {
        List<Integer> numbers = Arrays.asList(2,4,1,3);
        numbers.stream().sorted();

    }

    //String strats with particular character using streams

    //convert to upper case



    public static void main(String[] args) {
        Streams s = new Streams();
       List<Integer> total = s.get();
       System.out.println(total);
    }
}

