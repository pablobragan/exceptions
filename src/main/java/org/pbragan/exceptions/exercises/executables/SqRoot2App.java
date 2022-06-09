package org.pbragan.exceptions.exercises.executables;

public class SqRoot2App {
    public static void main(String[] args) {
        try {
            double d = getInput(args[0]);
            double root = Math.sqrt(d);
            System.out.println(
                    "The square root of " + d + " is " + root);
        }
        catch (NumberFormatException e) {
            System.out.println("Be sure to enter a number.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter number as first parameter.");
        }
//        catch (ImNumberException e) {
//            System.out.println("Result will be imaginary number.");
//        }
    }
    static double getInput(String s) /*throws ImNumberException */{
        double d = Double.valueOf(s).doubleValue();

        return d;
    }
}
