import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Operandobj = new Scanner(System.in);  // Use only one Scanner object
        while (true) {
            try {
                String operand = Operandobj.nextLine();

                System.out.println("Select operation.");
                System.out.println("1.Add      : +");
                System.out.println("2.Subtract : -");
                System.out.println("3.Multiply : *");
                System.out.println("4.Divide   : /");
                System.out.println("5.Power    : ^");
                System.out.println("6.Remainder: %");
                System.out.println("7.Terminate: #");
                System.out.println("8.Reset    : $");
                System.out.print("Enter choice(+,-,*,/,^,%,#,$): " + operand + "\n");
                if (operand.equals("#")) {
                    System.out.println("Done. Terminating");
                    break;
                }

                if (operand.equals("$")) {
                    continue;
                }

                // Input for operands

                String firstoperand1 = Operandobj.nextLine();
                System.out.print("Enter first number: " + firstoperand1 + "\n");
                if (firstoperand1.equals("#")) {
                    System.out.println("Done. Terminating");
                    break;
                }

                if (firstoperand1.equals("$")) {
                    continue;
                }
                double firstoperand = Double.parseDouble(firstoperand1);
                String secondoperand1 = Operandobj.nextLine();
                System.out.print("Enter second number: " + secondoperand1 + "\n");
                if (secondoperand1.equals("#")) {
                    System.out.println("Done. Terminating");
                    break;
                }

                if (secondoperand1.equals("$")) {
                    continue;
                }

                double secondoperand = Double.parseDouble(secondoperand1);
                select_op(operand, firstoperand, secondoperand);
            }
            catch (Exception e) {
                continue;
            }
              // Consume the leftover newline character

        }
        Operandobj.close();  // Close the Scanner object after use

    }
    private static void select_op(String a, double b, double c) {
        if (a.equals("+")) {
            double d = b + c;
            System.out.println(b + " + " + c + " = " + d);
        } else if (a.equals("-")) {
            double d = b - c;
            System.out.println(b + " - " + c + " = " + d);
        } else if (a.equals("*")) {
            double d = b * c;
            System.out.println(b + " * " + c + " = " + d);

        }else if (a.equals("/")) {
            if (c == 0) {
                System.out.println("Error: Division by zero.");
                System.out.println(b + " / " + c + " = " + "NaN");
            } else {
                double d = b / c;
                System.out.println(b + " / " + c + " = " + d);

            }
        }

        else if (a.equals("^")) {
            double d = Math.pow(b, c);
            System.out.println(b + " ^ " + c + " = " + d);
        } else if (a.equals("%")) {
            double d = b % c;
            System.out.println(b + " % " + c + " = " + d);
        } else {
            System.out.println("Unrecognized operation");
        }
    }
}