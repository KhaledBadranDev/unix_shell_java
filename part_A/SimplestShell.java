import java.util.Scanner;

class SimplestShell{

    public static void main(String[] args) { // the main method
        Scanner scan = new Scanner(System.in);
        while(true){ // infinite loop
            System.out.print("> ");
            String line = scan.nextLine();
            String[] commondsArr = line.split(" ");

            // terminate the shell, if the user enters exit.
            if (line.equals("exit")) {
                System.out.println("Bye :)");
                break;
            }

            // check whether commands are valid or not
            if (commondsArr[0].equals("pwd") || commondsArr[0].equals("cd") ||
                commondsArr[0].equals("ls") || commondsArr[0].equals("grep") ){
                    System.out.println("command '" + commondsArr[0] + "' with " + String.valueOf(commondsArr.length-1) + " argument(s).");
            } else{
                System.out.println(String.valueOf(commondsArr[0]) + ": command not found!");
            }
        }

    }

}