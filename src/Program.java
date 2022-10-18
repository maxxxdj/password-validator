public class Program {
    public static void main(String[] args) {


        /** Testing when password is only letters and less than 10 characters. */
        String strPass = "abv";
        System.out.println(validatePassword(strPass));

        /** Testing when password is only digits. */
        int intPass = 12345;
        System.out.println(validatePassword(intPass));

        /** Testing when password is null. */
        System.out.println(validatePassword(null));

        /** Testing when password is valid! */
        Object validPasswordAsObj = "sad21cX12aaaDDc";
        System.out.println(validatePassword(validPasswordAsObj));

    }

    private static String validatePassword(final Object password) {
        return switch (password) {
            case null -> "Password cannot be empty!";
            case Integer i -> "Password cannot consist only of numbers!";
            case String s when s.length() > 10 && s.matches(".*[a-z]|.*[A-Z]|.*[0-9]")
                    -> "Password is valid!";
            default -> "Invalid password!";
        };
    }
}