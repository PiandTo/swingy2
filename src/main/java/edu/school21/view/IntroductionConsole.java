package edu.school21.view;

//import edu.school21.model.artifacts.ArtifactsBuilder;
//import edu.school21.model.artifacts.DirectorArtifacts;
//import edu.school21.model.heroes.DirectorHero;
//import edu.school21.model.heroes.Hero;
//import edu.school21.model.heroes.HeroBuilder;
import edu.school21.repository.HeroRepositoryImpl;
import edu.school21.service.HeroService;
import lombok.AllArgsConstructor;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class IntroductionConsole extends Thread{
    private HeroService heroService;

    public IntroductionConsole() throws IOException, SQLException, InterruptedException {
        this.heroService = new HeroService();
        System.out.println("------------------------------");
        System.out.println("------------WELCOME-----------");
        System.out.println("--------------TO--------------");
        System.out.println("------------SWINGY------------");
        System.out.println("-------------GAME!------------");
        System.out.println("------------------------------");
        System.out.println();
        System.out.println();
        Scanner sc = new Scanner(System.in);
        while (true) {
            Thread.sleep(1000);
            System.out.println("If you want to Continue press Y if you want to Exit press N?");
            System.out.print("Answer: ");
            String str = sc.next();
            if (str.equals("Y")) {
               break ;
            } else if (str.equals("N")) {
                this.interrupt();
                return ;
            } else {
                System.out.println("Try again!");
            }
        }
        setup();
    }

    private void setup() throws IOException, SQLException {
        boolean isChoosen = false;
        System.out.println();
        System.out.println();
        System.out.flush();
        System.out.println("------------------------------");
        System.out.println("SETUP PAGE");
        System.out.println();
        System.out.println();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("If you want to Create NEW HERO press Y if you want to Choose existing HERO press N?");
            System.out.print("Answer: ");
            String str = sc.nextLine();
            if (str.equals("Y")) {
                break ;
            } else if (str.equals("N")) {
                isChoosen = true;
                break;
            } else {
                System.out.println("Try again!");
            }
        }
//        if (isChoosen) {
//            chooseHero();
//        }
//        else {
//            createHero();
//        }
    }

//    private void createHero() throws IOException, SQLException {
//        Hero hero;
//        String name, classes;
//        DirectorHero directorHero = new DirectorHero();
//        DirectorArtifacts directorArtifacts = new DirectorArtifacts();
//        HeroBuilder heroBuilder = HeroBuilder.getInstance();
//        ArtifactsBuilder artifactsBuilder = ArtifactsBuilder.getInstance();
//        System.out.println();
//        System.out.println();
//        System.out.flush();
//        System.out.println("------------------------------");
//        System.out.println("CREATE YOU HERO");
//        System.out.println();
//        System.out.println();
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.println("  What is name of your hero?");
//            System.out.print("  Answer: ");
//            String str = sc.nextLine();
//            if (str.isEmpty())
//                System.out.println("Try again!");
//            else {
//                name = str;
//                heroBuilder.setName(name);
//                break;
//            }
//        }
//        while (true) {
//            System.out.println("  What is your hero? Choose one of [Samurai / Rembo / Superman]");
//            System.out.print("  Answer: ");
//            String str = sc.nextLine();
//            if (str.equals("Samurai") || str.equals("Rembo") || str.equals("Superman")) {
//                classes = str;
//                break;
//            }
//            System.out.println("Try again!");
//        }
//        if (classes.equals("Samurai")) {
//            directorHero.constractSamurai(heroBuilder);
//            hero = heroBuilder.build();
//        } else if (classes.equals("Rembo")) {
//            directorHero.constractRembo(heroBuilder);
//            hero = heroBuilder.build();
//        } else {
//            directorHero.constractSuperman(heroBuilder);
//            hero = heroBuilder.build();
//        }
//        heroRepository.save(hero);
//        System.out.println();
//        System.out.println();
//        System.out.println("YOUR HERO IS CREATED");
//        chooseHero();
//    }
//
//    private void chooseHero() throws IOException, SQLException {
//        ArrayList hero = heroRepository.findAll();
//        int length = hero.size();
//        int selectedHero = 0;
//        System.out.println();
//        System.out.println();
//        System.out.flush();
//        System.out.println("------------------------------");
//        System.out.println("EXISTING HEROES");
//        for (int i = 0; i < length; i++)
//        {
//            Hero hero1 = (Hero) hero.get(i);
//            System.out.print("  " + hero1.getId() + ": ");
//            System.out.println(hero1.getName());
//        }
//        Scanner sc = new Scanner(System.in);
//        while (true){
//            System.out.print("WRITE NUMBER OF YOUR HERO: ");
//            Integer num = sc.nextInt();
//            System.out.println(num);
//            if (num > length || num <= 0)
//                System.out.println("No such Hero!");
//            else
//                selectedHero = num;
//                break ;
//        }
//        startGame(selectedHero);
//    }
//
//    public void startGame(Integer num) throws SQLException {
//        Hero hero = heroRepository.findById(num);
//        System.out.println();
//        System.out.println();
//        System.out.flush();
//        System.out.println("------------------------------");
//
//        System.out.println("YOUR CHOICE: " + hero.getName());
//
//        System.out.println("  Your class: " + hero.getClasses());
//        System.out.println("  Your Level: " + hero.getLevel());
//        System.out.println("  Your XP: " + hero.getEx());
//        System.out.println("  Your HP: " + hero.getHit_points());
//        System.out.println("  Your Defence: " + hero.getDefence());
//        System.out.println("  Your Attack: " + hero.getAttack());
//        System.out.println("  Your HitPoints: " + hero.getHit_points());
//
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.println();
//            System.out.print("Do you want to START BATTLE? Y/N : ");
//            String str = sc.nextLine();
//            if (str.equals("Y")) {
//                System.out.println("You win!!!");
//                break;
//            }
//            else if (str.equals("N")) {
//                System.out.println("See you again");
//                System.exit(0);
//            } else {
//                System.out.println("Try again!");
//            }
//        }
//    }
}
