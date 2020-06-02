package huffman_code;

import java.io.IOException;
import java.util.Scanner;

public class Huffle {
    private boolean unlock = false;

    public Huffle() throws IOException {
        openingMessage();

    }

    private String getInput(String prompt) {
        var scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.next();
    }

    public void commandDeck() throws IOException {
        HuffmanCoder huffy = new HuffmanCoder();

        String choice = "";
        String text = "";
        String border = "border";
        do {
            System.out.println(huffy.decodedHuffmanText(border));

            choice = getInput("Enter option: ").trim();


            switch (choice) {
                case "1":
                    text = getInput("Please enter some text: ");
                    huffy.encodedHuffmanText(text);
                    System.out.println("FILE SUCCESSFULLY ENCODED!");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
                case "2":
                    text = getInput("Please enter some text: ");
                    System.out.println(huffy.decodedHuffmanText(text));
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
                case "3":
                    text = getInput("Please enter some text: ");
                    huffy.viewHuffmanCodeMapping(text);
                    break;
                case "4":
                    text = getInput("Please enter some text: ");
                    huffy.viewCharCodeMapping(text);
                    break;
                case "5":
                    text = getInput("Please enter some text: ");
                    System.out.println("HERE IS THE EXACT COUNT OF CHARACTERS IN THE .HUFFLE IMAGE :" + "--->[" + huffy.viewCharCount(text) + "]<---");
                    break;
                case "6":
                    text = getInput("Please enter some text: ");
                    huffy.spaceInfo(choice, huffy.encodedHuffmanText(text));
                    break;
                case "7":
                    HuffleShip ship = new HuffleShip();
                    break;
                case "9":
                    System.out.println("EXITING HUFFLE SYSTEM...GOODBYE :D");
                    break;
                default:
                    System.out.println("Invalid option.  Please try again.");
                    break;
            }
        } while (unlock != true);

    }

    public void openingMessage() throws IOException {
        String enter;
        do {
            System.out.println();
            System.out.print("||-O-|| ||-O-|| WELCOME TO HUFFY INDS. ||-O-|| ||-O-||\n");

            System.out.println("We are a space research organization that specializes in a compressor that has technology for lossless data! \n" +
                    "Here is an example of what our HUFFLE Compressor compresses from HUBBLE...");
            System.out.print("         *                 *                  *              *\n" +
                    "                                                      *             *\n" +
                    "                        *            *                             ___\n" +
                    "  *               *                                          |     | |\n" +
                    "        *              _________##                 *        / \\    | |\n" +
                    "                      @\\\\\\\\\\\\\\\\\\##    *     |              |--o|===|-|\n" +
                    "  *                  @@@\\\\\\\\\\\\\\\\##\\       \\|/|/            |---|   |d|\n" +
                    "                    @@ @@\\\\\\\\\\\\\\\\\\\\\\    \\|\\\\|//|/     *   /     \\  |w|\n" +
                    "             *     @@@@@@@\\\\\\\\\\\\\\\\\\\\\\    \\|\\|/|/         |  U    | |b|\n" +
                    "                  @@@@@@@@@----------|    \\\\|//          |  S    |=| |\n" +
                    "       __         @@ @@@ @@__________|     \\|/           |  A    | | |\n" +
                    "  ____|_@|_       @@@@@@@@@__________|     \\|/           |_______| |_|\n" +
                    "=|__ _____ |=     @@@@ .@@@__________|      |             |@| |@|  | |\n" +
                    "____0_____0__\\|/__@@@@__@@@__________|_\\|/__|___\\|/__\\|/___________|_|_");
            enter = getInput("\nTYPE huffle TO ENTER: ");
            switch (enter) {
                case "huffle":
                    unlock = true;
                    commandDeck();
                    break;

                default:
                    System.out.println("Invalid option.  Please try again.");
                    break;
            }
        }while(unlock != true);



    }

}
