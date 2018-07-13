package quickstartguide.kotlin.chapter5;

import java.util.ArrayList;
import java.util.List;

public class JavaPlatformTypes {
    public void callKotlinImmutableList() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        List<Integer> nums = KotlinPlatformTypesKt.castToInt(strings);
    }

    public void checkStrings(List<String> strings) {
        for (String s : strings) {
            // do something
        }
        strings.add("Item added in Java");
    }
}
