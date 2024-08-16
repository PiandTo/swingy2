package edu.school21;

import edu.school21.controller.IntroductionController;
import edu.school21.view.IntroductionConsole;
import edu.school21.view.IntroductionGui;

import java.awt.event.WindowEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws InterruptedException, SQLException, IOException {
        IntroductionGui introductionGui = new IntroductionGui();
        if (args.length != 1) {
            System.out.println("You should add 'gui' or 'console'");
            System.out.println("Try this: java -jar target/Swingy-1.0-SNAPSHOT.jar gui");
            System.exit(0);
        }
        if (args[0].equals("gui")) {
            new IntroductionController(introductionGui);
        } else if (args[0].equals("console")){

        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Switch: ");
        while (true) {
            if (sc.hasNextLine()) {
                String str = sc.nextLine();
                if (str.equals("gui")) {
                    System.out.println("Switch to GUI");
                    new IntroductionController(introductionGui);
                    //TO DO - GUI запуск
                    System.out.print("Switch: ");
                } else if (str.equals("console")) {
                    introductionGui.dispose();
//                    introductionGui.dispatchEvent(new WindowEvent(introductionGui, WindowEvent.WINDOW_CLOSING));
                    System.out.println("Switch to console");
                    Thread thread = new IntroductionConsole();
                    thread.start();
                    thread.join();
                    //TO DO - Console запуск
                    System.out.print("Switch: ");
                } else if (str.equals("exit")) {
                    System.exit(0);
                } else {
                    System.out.println("Not correct input");
                    System.out.print("Switch: ");
                }
            }
        }
    }
}
