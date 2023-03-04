import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        ticTacToe(userInput);

    }


    public static void ticTacToe(String userInput) {

        String firstLine = "";
        String secondLine = "";
        String thirdLine = "";
        //System.out.print("---------");

        for (int i = 0; i <= userInput.length(); i++) {
            firstLine = userInput.substring(0, 3).replace(""," ").trim();
            secondLine = userInput.substring(3, 6).replace(""," ").trim();
            thirdLine = userInput.substring(6, 9).replace(""," ").trim();
        }
        System.out.println("---------" + custom(firstLine) + custom(secondLine) + custom(thirdLine) + "\n" + "---------");
        //System.out.println("---------");
    }

    public static String custom (String line){
        return "\n" + "| " + line + " |";
    }


}