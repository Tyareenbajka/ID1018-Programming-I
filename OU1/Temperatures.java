import java.util.Scanner;

public class Temperatures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many weeks? ");
        int numberOfWeeks = scan.nextInt();
        System.out.print("How many measurements? ");
        int numberOfMeasurements = scan.nextInt();
        System.out.println("");

        int[][] temperatures = new int[numberOfWeeks][numberOfMeasurements];
        fillArrayWithData(temperatures);
        printOutMeasurements(temperatures);
        System.out.println("");

        int[] minT = new int[numberOfWeeks];
        int[] maxT = new int[numberOfWeeks];
        int[] sumT = new int[numberOfWeeks];
        double[] averageT = new double[numberOfWeeks];

        //Calculate min-, max-, sum- and averagetemperature for every week
        for(int i=0; i<numberOfWeeks; i++){
            minT[i] = temperatures[i][0];
            maxT[i] = temperatures[i][0];
            sumT[i] = temperatures[i][0];
            averageT[i] = temperatures[i][0];

            for(int j=1; j<numberOfMeasurements; j++){
                if(temperatures[i][j] < minT[i])
                    minT[i] = temperatures[i][j];
                else if(temperatures[i][j] > maxT[i])
                    maxT[i] = temperatures[i][j];
                sumT[i] += temperatures[i][j];
            }
            averageT[i] = ((double) sumT[i] / numberOfMeasurements);
        }
        System.out.println("Presentation of the measurements:\n");
        printOutTemperatureValues(minT, maxT, averageT);

        int minTemp = minT[0];
        int maxTemp = maxT[0];
        int sumTemp = sumT[0];
        double medelTemp = 0;

        //Calculate min-, max-, sum- and averagetemperature for the for the entire period
        for(int i=1; i<numberOfWeeks; i++){
            if(minT[i] < minTemp)
                minTemp = minT[i];
            else if(maxT[i] > maxTemp)
                maxTemp = maxT[i];
            sumTemp += sumT[i];
        }
        medelTemp = ((double) sumTemp / (numberOfWeeks*numberOfWeeks));

        System.out.println("Temperatures over all weeks\n");
        System.out.println("Lowest temperature: " + minTemp);
        System.out.println("Largest temperature: " + maxTemp);
        System.out.println("Average temperature: " + Math.round(medelTemp*100.0)/100.0);

    }
    private static void printOutMeasurements(int[][] array) {
        System.out.println("Temperatures:");
        for(int i=0; i < array.length; i++){
            for(int j=0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printOutTemperatureValues(int[] minT, int[] maxT, double[] averageT) {
        for(int i=0;i<minT.length; i++) {
            System.out.println("Week " + (i + 1));
            System.out.println("Lowest temperature: " + minT[i]);
            System.out.println("Largest temperature: " + maxT[i]);
            System.out.println("Average temperature: " + Math.round(averageT[i]*100.0)/100.0);
            System.out.println("");
        }
    }

    private static void fillArrayWithData(int[][] temperatures) {
        Scanner s = new Scanner(System.in);
        for(int i=0; i<temperatures.length; i++){
            System.out.println("Week " + (i+1));
            for(int j=0; j<temperatures[i].length; j++){
                System.out.print("Measurement nr " + (j+1) + ": ");
                temperatures[i][j] = s.nextInt();
            }
            System.out.println("");
        }
    }
}
