package quickstart.kotlin.chapter4;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public class JavaFunctionTypes {
    public void callWithLambdas() {
        KotlinFunctionTypesKt.applyLambda(10, 2, (a, b) -> a * b);
    }

    public void callWithAnonymousClass() {
        KotlinFunctionTypesKt.applyLambda(10, 2, new Function2<Integer, Integer, Integer>() {
            @Override
            public Integer invoke(Integer a, Integer b) {
                return a * b;
            }
        });
    }
}
