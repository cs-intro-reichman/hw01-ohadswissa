public class LinerEq {
    public static void main(String args[]) {
        // enter linear equations of the form a * x + b = c as an a b c arguments
            double a = Integer.parseInt(args[0]);
            double b = Integer.parseInt(args[1]);
            double c = Integer.parseInt(args[2]);
            double x = (c-b)/a;
            // prints the equation and the x answer
            System.out.println(a+" * x"+" + "+b+" = "+c);
            System.out.println("x = "+x);
          }
        }
    
    
