public class Triangle {
    public static void main(String args[]) {
        // enter 3 arguments each one as an option for for a triangle side value
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = Integer.parseInt(args[2]);
            // checks if the sides can build a possible triangle
            if (a+b<=c || b+c<=a || a+c<=b)
            {
             System.out.println(a+", "+b+", "+c+":"+" false");
            }
            else System.out.println(a+", "+b+", "+c+":"+" true");
         
          }
        }

    
    
