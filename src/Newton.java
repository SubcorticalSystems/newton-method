public class Newton {
    //f(x)
    static double f(double x) {
        //return (x*x) - 7.2;
        //return (x*x*x) + (3*x) -1;
        //return (Math.cos(x) - x);
        //return (x*x*x) + 6;
        //return (x*x*x) + x - 3;
        //return (x*x*x*x*x) + x - 6;
        //return 3 - x + Math.sin(x);
        //return (x*x*x) - 2 * (x) -2;
        return Math.cos(x);
    }

    //f'(x)
    static double fprime(double x) {
        //return 2*x;
        //return 3*(x*x) + 3;
        //return (-1)*Math.sin(x)-1;
        //return 3*(x*x);
        //return 3* (x*x) + 1;
        //return 5*(x*x*x*x) + 1;
        //return -1 + Math.cos(x);
        //return 3 * (x*x) - 2;
        return (-1)* Math.sin(x);
    }

    public static void main(String argv[]) {

        double tolerance = .000000001; // Stop if you're close enough
        int max_count = 200; // Maximum number of Newton's method iterations

        //c is x-naught
        double c = 1;
        if(argv.length==1) {
            c = Double.valueOf(argv[0]).doubleValue();
        }

        //loop until close to zero or quit after 200 times
        for( int count=1; (Math.abs(f(c)) > tolerance) && ( count < max_count); count ++)  {
            c = c - f(c)/fprime(c);  //Newtons method
            System.out.println("Step: "+count+" c:"+ c +" Value:"+f(c));
        }
        //Outcomes
        if( Math.abs(f(c)) <= tolerance) {
            System.out.println("Zero found at c="+ c);
        } else {
            System.out.println("Failed to find a zero");
        }
    }
}
