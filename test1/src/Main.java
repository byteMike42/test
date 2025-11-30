import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Space Mission Selector\n1: Mars\n2: Jupiter\n3: Mercury\n0: Exit\nSelection: ");
        int selection = input.nextInt();

        switch(selection){
            case 1:
                System.out.println("Mars Rover Program ");
                break;
            case 2:
                System.out.println("Jupiter Europa Program");
                break;
            case 3:
                System.out.println("Mercury Probe");
                break;
            case 0:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Not a selected Space Program");
                break;
        }

        System.out.println("This is a test to pull data via github");   

    }

}
