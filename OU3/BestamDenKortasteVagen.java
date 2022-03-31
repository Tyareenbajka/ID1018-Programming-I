// Philip Tonaczew 2019-12-01

public class BestamDenKortasteVagen {
    public static void main(String[] args) {
        double[] arrayX ={17, 20, 30};
        double[][] arrayUV = { {35, 25, 27, 29}, {22, 23, 21, 25}, {32, 26, 30, 19} };
        double[] arrayY = {18, 15, 12, 25};

        double shortestWay = DenKortasteVagen.langd(arrayX, arrayUV, arrayY);
        int[] index = DenKortasteVagen.mellanstationer(arrayX, arrayUV, arrayY);
        System.out.println("Den kortaste vägen är: " + shortestWay);
        System.out.print("Vägen gå via stationerna: U" + (index[0]+1) + " och " + "V" + (index[2]+1));
    }
}
