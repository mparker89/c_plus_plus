package huffman_code;

import java.io.IOException;
import java.util.Scanner;

public class HuffleShip {

    HuffmanCoder huffy = new HuffmanCoder();


    public HuffleShip() throws IOException {

        System.out.println(huffy.decodedHuffmanText("briefing"));
        observationMission();
    }

    private String getInput(String prompt) {
        var scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.next();
    }

    public void observationMission(){

          var command = getInput("Enter option: ");

           if(command.equals("1")){
               System.out.println(huffy.decodedHuffmanText("mission"));
               command = getInput("Travel to destination? [y] : ");
               if(command.equals("y")) {
                   System.out.println(huffy.decodedHuffmanText("stars"));
                   System.out.println(huffy.decodedHuffmanText("uss_e"));
                   System.out.println(huffy.decodedHuffmanText("stars"));
                   System.out.println("[[[[[[ENTERING HYPERDRIVE!]]]]]]");
                   command = getInput("EXIT HYPERDRIVE? [y] : ");
                   if(command.equals("y")){
                       System.out.println("SUCCESSFULLY ARRIVED IN THE BEAN SOLAR SYSTEM");
                       System.out.println(huffy.decodedHuffmanText("garbanzo"));
                       System.out.println(huffy.decodedHuffmanText("landing"));
                   }
               }
           }

      }

}
