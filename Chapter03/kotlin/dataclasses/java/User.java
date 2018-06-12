package quickstartguide.kotlin.chapter3.kotlin.dataclasses.java;

public final class User {
    private String firstName;
    private String lastName;
    private int birthYear;

    public User(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User) {
            User other = (User)obj;
            return this.firstName.equals(other.firstName)
                    && this.lastName.equals(other.lastName)
                    && this.birthYear == other.birthYear;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 31;
        result = 31 * result + this.firstName.hashCode();
        result = 31 * result + this.lastName.hashCode();
        result = 31 * result + birthYear;
        return result;
    }

    @Override
    public String toString() {
        return "User(firstName="+this.firstName
                + ", lastName=" + this.lastName
                + ", birthYear=" + this.birthYear
                + ")";
    }
}

