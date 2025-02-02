import java.util.Scanner; 

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name; 
        int age; 
        double weight; 
        boolean smoker; 

        System.out.println("Welcome to Texas General! Please answer the following questions.");
        System.out.print("What is your name? ");
        name = input.next(); 
        
        System.out.print("How old are you, " + name + "? ");
        age = input.nextInt(); 
        
        System.out.print("How much do you weigh in pounds? ");
        weight = input.nextDouble(); 
        
        System.out.print("Is the following statement true or false?: I am a smoker. ");
        smoker = input.nextBoolean(); 

        System.out.print("\nHello, " + name + ". You are " + age + " years old. "); 
        System.out.println("You weigh " + weight + " pounds. It is " + smoker + " that you are a smoker.");

        input.close(); 
    }
}
