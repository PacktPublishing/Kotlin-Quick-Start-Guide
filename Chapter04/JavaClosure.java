package quickstart.kotlin.chapter4;

import java.util.ArrayList;
import java.util.List;

public class JavaClosure {
    public void noFinalClosure() {
        int a = 0;
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                a++;
            }
        };
    }

    public void finalClosure() {
        final int[] a = { 0 };
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                a[0]++;
            }
        };
    }
}
