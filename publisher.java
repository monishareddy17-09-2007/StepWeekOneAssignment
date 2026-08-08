import java.util.*;

class publisher {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter code: ");
        String code = sc.nextLine();

        code = code.trim();

        if (code.length() != 13) {
            System.out.println("Invalid: wrong length");
            return;
        }

        String publisher = code.substring(0, 3).toUpperCase();
        String body = code.substring(3);

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(publisher.charAt(i))) {
                System.out.println("Invalid: publisher code must be 3 letters");
                return;
            }
        }

        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                System.out.println("Invalid: body must contain digits");
                return;
            }
        }

        String year = code.substring(3, 7);
        String catalog = code.substring(7);

        StringBuilder result = new StringBuilder();

        result.append("[")
              .append(publisher)
              .append("] YEAR: ")
              .append(year)
              .append(" | CATALOG: ")
              .append(catalog);

        System.out.println(result);
    }
}