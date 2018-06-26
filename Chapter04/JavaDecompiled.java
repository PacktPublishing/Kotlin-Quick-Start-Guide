package quickstart.kotlin.chapter4;

import kotlin.jvm.functions.Function0;

public class $callNotInlined$1 extends kotlin.jvm.internal.Lambda implements Function0<String> {

    private $callNotInlined$1() {
        super(0);
    }

    @Override
    public String invoke() {
        String str$iv = "Kotlin";
        return str$iv;
    }

    public static final $callNotInlined$1 INSTANCE;

    static {
        INSTANCE = new $callNotInlined$1();
    }
}
