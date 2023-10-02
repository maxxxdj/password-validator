public class Program {
    public static void main(String[] args) {

        /** Testing when password has only letters and is less than 10 characters. */
        var strPass = "abv";
        System.out.println(validatePassword(strPass));

        /** Testing when password has only digits (works with other numeric values). */
        var intPass = 12345;
        System.out.println(validatePassword(intPass));

        /** Testing when password is null. */
        System.out.println(validatePassword(null));

        /** Testing when password is valid! */
        var validPasswordAsObj = "sad21cX12aaaDDc";
        System.out.println(validatePassword(validPasswordAsObj));

    }

    private static String validatePassword(final Object password) {
        return switch (password) {
            case null -> "Password cannot be empty!";
            case Number i -> "Password cannot consist only of numbers!";
            case String s when s.length() > 10 && s.matches(".*[a-z]|.*[A-Z]|.*[0-9]") -> "Password is valid!";
            default -> "Invalid password! \n" + "Password must include an uppercase, lowercase, and a number.";
        };
    }
}