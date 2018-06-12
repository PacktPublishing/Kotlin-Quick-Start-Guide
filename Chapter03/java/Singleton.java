package quickstartguide.kotlin.chapter3.java;

public final class User {

    public static final User INSTANCE;

    private User() {

    }

    public void sayMyName() {
        System.out.println("I'm a singleton");
    }

    static {
        INSTANCE = new User();
    }
}
