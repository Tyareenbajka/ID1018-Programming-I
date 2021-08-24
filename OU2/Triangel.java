/**
 * Klass som innehåller olika formler för olika beräkningar på trianglar
 */
public class Triangel {

    /**
     * Beräknar semiperimeter
     *
     * @param a sidan A längd
     * @param b sidan B längd
     * @param c sidan C längd
     * @return semiperimeter
     */
    public static double semiperimeter(double a, double b, double c){
        return (a+b+c) / 2;
    }

    /**
     * Beräknar längden av bisektrisen från hörnet A
     *
     * @param b sidan B längd
     * @param c sidan C länd
     * @param alfa vinkeln alfa
     * @return bisektrisen
     */
    public static double bisektris(double b, double c, double alfa){
        double p = 2 * b * c * Math.cos(alfa/2);
        double bis = p / (b+c);
        return bis;
    }

    /**
     * Beräknar höjden
     *
     * @param a sidan A längd
     * @param b Sidan B längd
     * @param c sidan C längd
     * @return höjden
     */
    public static double hojd(double a, double b, double c){
        double s = semiperimeter(a,b,c);
        double h = 2*(Math.sqrt(s*((s-a)*(s-b)*(s-c)))) / a;
        return h;
    }

    /**
     * Beräknar arean
     *
     * @param a sidan A längd
     * @param b sidan B längd
     * @param c sidan C längd
     * @return arean
     */
    public static double area(double a, double b, double c){
        double s = semiperimeter(a,b,c);
        double i = s*((s-a)*(s-b)*(s-c));
        return Math.sqrt(i);
    }

    /**
     * Beräknar omkretsen
     *
     * @param a sidan A längd
     * @param b sidan B längd
     * @param c sidan C längd
     * @return omkretsen
     */
    public static double omkrets(double a, double b, double c){
        return a + b + c;
    }

    /**
     * Beräknar den omskrivna cirkelns radie
     *
     * @param a sidan A längd
     * @param b sidan B längd
     * @param c sidan C längd
     * @return omskrivna cirkelns radie
     */
    public static double omskrivnaCirkeln(double a, double b, double c){
        double s = semiperimeter(a,b,c);
        double r1 = a*b*c;
        double r2 = 4 * Math.sqrt(s*((s-a)*(s-b)*(s-c)));
        return r1 / r2;
    }

    /**
     * Beräknar den inskrivna cirkelns radie
     *
     * @param a sidan A längd
     * @param b sidan B längd
     * @param c sidan C längd
     * @return inskrivna cirkelns radie
     */
    public static double inskrivnaCirkeln(double a, double b, double c){
        double s = semiperimeter(a,b,c);
        double r1 = (s-a)*(s-b)*(s-c);
        double r2 = r1/s;
        return Math.sqrt(r2);
    }
}
