package quickstart.kotlin.chapter6;

import quickstart.kotlin.extensions.ExtensionFunctionsKt;

import static quickstart.kotlin.extensions.ExtensionFunctionsKt.*;

public class JavaExtensionFunctions {
    public void isPowerOfTwo() {
        int n = 8;
        boolean isPowerOf2 = ExtensionFunctionsKt.isPowerOf2(n);
    }

    public void isPowerOfTwo2() {
        int n = 8;
        boolean isPowerOf2 = isPowerOf2(n);
    }
}
