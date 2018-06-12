package quickstartguide.kotlin.chapter3.java;

import java.util.UUID;

public class User {

    private String userId;

    private static final User.Companion COMPANION = new User.Companion();

    private User(String userId) {
        this.userId = userId;
    }

    public static final class Companion {

        private Companion() {

        }

        public static User newUserWithEmail(String email) {
            return new User(email);
        }

        public static User newUserFromUUID(UUID uuid) {
            return new User(uuid.toString());
        }
    }
}
