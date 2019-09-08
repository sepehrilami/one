import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TextFinder textFinder = new TextFinder();
        Importer importer = null;
        Tokenizer tokenizer = null;
        textFinder.preprocess(importer, tokenizer);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("enter your word:");
            String input = scanner.next();
            System.out.println("Files containing this word:\n");
            if (textFinder.getData().get(input.toLowerCase()) != null) {
                System.out.println(textFinder.getData().get(input.toLowerCase()) + "\n");
            } else {
                System.out.println("Oops! We didn't find any file.\nTry something else!");
            }
        }
    }
}