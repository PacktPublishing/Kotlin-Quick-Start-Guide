package quickstartguide.kotlin.chapter5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class JavaCollectionsApi {
    public Collection<Integer> filterEvens(Collection<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (Integer n : numbers) {
            if (n % 2 == 0) {
                result.add(n);
            }
        }
        return result;
    }

    public Collection<Integer> produceSquares(Collection<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (Integer n : numbers) {
            result.add(n * n);
        }
        return result;
    }

    public Collection<Integer> filterEvensThenSquare(Collection<Integer> numbers) {
        Collection<Integer> evens = filterEvens(numbers);
        return produceSquares(evens);
    }
}
