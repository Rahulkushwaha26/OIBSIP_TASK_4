import java.util.Scanner;
public class OnlineExamSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username, password;
        boolean isAuthenticated = false;

        System.out.println("\n"+".....ONLINE EXAMINATION SYSTEM....."+"\n");
        
        // Login code of Online Examination System
        while (!isAuthenticated) {
            System.out.print("Enter the username: ");
            username = scanner.nextLine();
            System.out.print("Enter the password: ");
            password = scanner.nextLine();

        // Verification of the username and password.
            if (username.equals("admin") && password.equals("admin@123")) {
                isAuthenticated = true;
            } else {
                System.out.println("\n"+"Sorry!! INVALID username or password."+"\n"+"You can please try again..."+"\n");
            }
        }
        
        // Update Profile and Password
        System.out.print("\n"+".....User can UPDATE his/her profile....."+"\n\n");
        System.out.print("Enter the new username (leave blank to skip): ");
        String newUsername = scanner.nextLine();
        if (!newUsername.isEmpty()) {
            username = newUsername;
        }
        System.out.print("Enter the new password (leave blank to skip): ");
        String newPassword = scanner.nextLine();
        if (!newPassword.isEmpty()) {
            password = newPassword;
        }
        System.out.println("\n"+".....Profile Updated Successfully !!.....");
        
        // Selecting Answer for MCQs
        int score = 0;
        System.out.println("\n"+"INSTRUCTION : Total 5 questions are there, you have to answer in 5 minutes");
        System.out.println("\n"+"...QUESTION PAPER..."+"\n");
        System.out.println("Question 1. Which of the following is not a Java features?"+"\n");
        System.out.println("a) Dynamic.");
        System.out.println("b) Architecture Neutral.");
        System.out.println("c) Use of pointers.");
        System.out.println("d) Object-oriented.");
        
        System.out.print("\n"+"Your answer: ");
        String answer1 = scanner.nextLine();
        if (answer1.equals("c")) {
            score++;
        }
        System.out.println("\n"+"Question 2. Which of the following option leads to the portability and security of Java?"+"\n");
        System.out.println("a) The applet makes the Java code secure and portable.");
        System.out.println("b) Bytecode is executed by JVM.");
        System.out.println("c) Use of exception handling.");
        System.out.println("d) Dynamic binding between objects.");
        System.out.print("\n"+"Your answer: ");
        String answer2 = scanner.nextLine();
        if (answer2.equals("b")) {
            score++;
        }
        System.out.println("\n"+"Question 3. Which of these cannot be used for a variable name in Java?"+"\n");
        System.out.println("a) identifier & keyword");
        System.out.println("b) identifier");
        System.out.println("c) keyword");
        System.out.println("d) none of the mentioned");
        System.out.print("\n"+"Your answer: ");
        String answer3 = scanner.nextLine();
        if (answer3.equals("c")) {
            score++;
        }
        System.out.println("\n"+"Question 4. What is the extension of java code files?"+"\n");
        System.out.println("a) .js");
        System.out.println("b) .cpp");
        System.out.println("c) .txt");
        System.out.println("d) .java");
        System.out.print("\n"+"Your answer: ");
        String answer4 = scanner.nextLine();
        if (answer4.equals("d")) {
            score++;
        }
        System.out.println("\n"+"Question 5. Which of the following is not an OOPS concept in Java?"+"\n");
        System.out.println("a) Polymorphism");
        System.out.println("b) Inheritance");
        System.out.println("c) Compilation");
        System.out.println("d) Encapsulation");
        System.out.print("\n"+"Your answer: ");
        String answer5 = scanner.nextLine();
        if (answer5.equals("c")) {
            score++;
        }
        System.out.println("\n"+"Your final SCORE is = " + score + "/5.");
        
        // Timer and auto-submission of examination
        System.out.println("\n"+"You have total 5 minutes to complete the exam.");
        System.out.println("Your exam will be automatically submitted after 5 minutes.");
        long startTime = System.currentTimeMillis();
        long endTime = startTime + 1 * 60 * 1000; // conversion of five minutes in milliseconds

        while (System.currentTimeMillis() < endTime) {
        // Waiting for time to over the exam.
        }
        System.out.println("\n"+".....TIME OVER !!! Successfuly Submitted.....");
        
        // Closing session and logout
        isAuthenticated = false;
        System.out.println("\n"+"SESSION EXPIRED!!...You have been logged out from examination.");
    }

}
