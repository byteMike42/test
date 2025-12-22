import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String passkey = "okayboomer";
        int attempts = 0;
        int maxAttempts = 3;

        do {
            System.out.println("What is the password for project Astra?");
            String guess = input.nextLine();
            System.out.println(guess);
            attempts++;
            if (guess.equals(passkey)){
                System.out.println("Access Granted");
                break;
            }else{
                System.out.println("Try again");
            }
        }while(!input.equals(passkey) && attempts < maxAttempts);

        if (!input.equals(passkey)) {
            System.out.println("Have you forgotten your password");
            Scanner changePassword = new Scanner(System.in);
            String response = changePassword.nextLine();
            System.out.printf("%s%n", response);
            if (response.equals("yes") || response.equals("YES")) {
                System.out.println("New passowrd: ");
                Scanner newPassword = new Scanner(System.in);
                String answer = newPassword.nextLine();
                int strongPassword = 8;
                int updatePassword = answer.length();
                if (updatePassword > strongPassword) {
                    System.out.println("Strong password");
                    System.out.println(answer + "\npassword updated\nWelcome to Ad Astra");

                }else{
                    System.out.println("Weak add more characters next time");
                }
            } else {
                System.out.println("okay");
            }
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.printf("Hello, %s%n", name);

        System.out.println("Space Mission Selector\n1: Mars\n2: Jupiter\n3: Mercury\n0: Exit\nSelection: ");
        int selection = scanner.nextInt();

        switch(selection){
            case 1:
                System.out.println("Mars Rover Program ");
                for (int i = 0; i <10; i++){
                    System.out.println("WAll-E booting in " + i + " seconds");
                }
                break;
            case 2:
                System.out.println("Jupiter Europa Program");
                for (int countdown = 10; countdown >= 0; countdown--){
                    System.out.println("T-minus" + countdown);
                    if (countdown == 0){
                        System.out.println("CLEAR FOR LIFTOFF");
                        break;
                    }
                }
                break;
            case 3:
                System.out.println("Mercury Probe");
                Scanner answer = new Scanner(System.in);
                int choice;
                int password = 123;
                do{
                    System.out.println("What is the password to enter the probe? ");
                    choice = answer.nextInt();
                }while(choice != password);
                System.out.println("Welcome to the mission, Sir Bentley!");
                break;
            case 0:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Not a selected Space Program");
                break;

        }

    }

}

