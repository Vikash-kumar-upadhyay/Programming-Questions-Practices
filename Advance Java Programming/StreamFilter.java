import java.util.*;

class StreamFilter {
    public static void main(String[] args) {

        List<Integer> list = List.of(23, 22, 24, 34, 56, 75, 89, 0, 78, 53);

        List<Integer> result = list.stream()
                                  .filter(x -> x % 2 == 0)
                                  .toList();

        System.out.println(result);
    }
}
