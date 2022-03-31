// Philip Tonaczew 2019-12-01

public class DenKortasteVagen {

    // mellanstationer returnerar en vektor med de mellanstationer som finns på den kortaste
    // vägen. Ordningsnummer av den första mellanstationen finns på index 1, och ordningsnummer
    // av den andra mellanstationen på index 2 i vektorn.
    public static int[] mellanstationer(double[] a, double[][] b, double[] c){
        int[] mellanstationer = new int[3];
        int firstElement = 0;
        int lastElement = a.length-1;
        double shortestWay = a[0] + b[0][0] + c[0];
        int current = firstElement;
        double sumOfWays = 0;

        while(current <= lastElement){
            for(int i = 0; i < b[firstElement].length; i++){
                sumOfWays = (a[current] + b[current][i] + c[i]);
                if(sumOfWays < shortestWay) {
                    shortestWay = a[current] + b[current][i] + c[i];
                    mellanstationer[0] = current;
                    mellanstationer[1] = i;
                    mellanstationer[2] = i;
                }
            }
            current++;
        }
        return mellanstationer;
    }

    // langd returnerar längden av den kortaste vägen.
    public static double langd (double[] a, double[][] b, double[] c){
        int[] index = mellanstationer(a, b, c);
        double shortestWay = a[index[0]] + b[index[0]][index[1]] + c[index[2]];
        return shortestWay;
    }
}
