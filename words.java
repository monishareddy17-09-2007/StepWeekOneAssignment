import java.util.*;

class words {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter paragraph: ");
        String text = sc.nextLine();

        text = text.toLowerCase();
        text = text.replace(".", "");
        text = text.replace(",", "");

        String[] words = text.split("\\s+");

        String[] stopWords = {
            "the", "was", "and", "a", "is", "of", "in"
        };

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {

            boolean stop = false;

            for (String s : stopWords) {
                if (word.equals(s)) {
                    stop = true;
                    break;
                }
            }

            if (!stop) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        ArrayList<String> list = new ArrayList<>(map.keySet());

        list.sort((a, b) -> map.get(b) - map.get(a));

        for (String word : list) {
            System.out.println(word + ": " + map.get(word));
        }
    }
}