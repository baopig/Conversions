import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Jessie Yan
 * @version 8/23/2024
 */
// generates a webpage of documentation for your code

// text -> compiler -> byte code -> java virtual machine
// GitHub stores code in repositories, versions it, shares, collaborate, comparisons (old/new ver)
// GitHub Classroom
// Codespaces - online integrated development environment (IDE)

 public class Conversions //name of class must match name of file, should start w capital letter
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in); // .in = standard input

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. Inches to Centimeters");
        System.out.println("8. Centimeters to Inches");
        System.out.println("9. Kilograms to Pounds");
        System.out.println("10. Pounds to Kilograms");
        //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
        //You can add even more if you would like.

        int selection = keyboard.nextInt(); //.nextInt waits until the user presses enter, then stores variable in selection
        keyboard.nextLine();  //go past the end-line and be ready for more input

        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        if (selection == 2)
        {
            System.out.println("Enter Fahrenheit: ");
            double fahrenheit = keyboard.nextDouble();
            keyboard.nextLine();
            double celsius = (fahrenheit - 32) * (5.0 / 9.0);
            System.out.println(fahrenheit + " degrees fahrenheit is " + celsius + " degrees celsius");        
            
            //add the code to ask the user to enter Fahrenheit and then convert to Celsius
        }
        if (selection == 3) {
            System.out.println("Enter Feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = feet * 0.3048;
            System.out.println(feet + " feet is " + meters + " meters");            
        }
        if (selection == 4) {
            System.out.println("Enter Meters: ");
            double meters = keyboard.nextDouble();
            keyboard.nextLine();
            double feet = meters / 0.3048;
            System.out.println(meters + " meters is " + feet + " feet");            
        }
        if (selection == 5) {
            System.out.println("Enter Ounces: ");
            double ounces = keyboard.nextDouble();
            keyboard.nextLine();
            double milliliters = ounces * 29.574;
            System.out.println(ounces + " ounces is " + milliliters + " milliliters");            
        }
        if (selection == 6) {
            System.out.println("Enter Milliliters: ");
            double milliliters = keyboard.nextDouble();
            keyboard.nextLine();
            double ounces = milliliters / 29.574;
            System.out.println(milliliters + " milliliters is " + ounces + " ounces");  
        }
        if (selection == 7) {
            System.out.println("Enter Inches: ");
            double inches = keyboard.nextDouble();
            keyboard.nextLine();
            double centimeters = inches * 2.54;
            System.out.println(inches + " inches is " + centimeters + " centimeters");  
        }    
        if (selection == 8) {
            System.out.println("Enter Centimeters: ");
            double centimeters = keyboard.nextDouble();
            keyboard.nextLine();
            double inches = centimeters / 2.54;
            System.out.println(centimeters + " centimeters is " + inches + " inches");  
        }
        if (selection == 9) {
            System.out.println("Enter Kilograms: ");
            double kilograms = keyboard.nextDouble();
            keyboard.nextLine();
            double pounds = kilograms * 2.205;
            System.out.println(kilograms + " kilograms is " + pounds + " pounds");  
        }
        if (selection == 10) {
            System.out.println("Enter Pounds: ");
            double pounds = keyboard.nextDouble();
            keyboard.nextLine();
            double kilograms = pounds / 2.205;
            System.out.println(pounds + " pounds is " + kilograms + " kilograms");  
        }
    }
}