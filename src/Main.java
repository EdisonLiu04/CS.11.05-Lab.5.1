import java.util.ArrayList;
import java.util.Arrays;
import java.util.SimpleTimeZone;

public class Main {

    /**
     * Mean Methods
     */

    public static int meanTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int meanHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int meanHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int meanRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int meanRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int meanFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int meanFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Median Methods
     */

    public static int medianTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int medianRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int medianFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Min Methods
     */

    public static int minTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int minRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int minFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Max Methods
     */
    
    public static int maxTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int maxRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        Arrays.sort(retailEstimatesTonnesPerYear);
        return retailEstimatesTonnesPerYear[retailEstimatesTonnesPerYear.length-1];
    }

    public static int maxFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        int biggest = foodServiceEstimatesTonnesPerYear[0];
        for(int i: foodServiceEstimatesTonnesPerYear){
            if (biggest < i){
                biggest = i;
            }
        }
        return biggest;
    }

    /**
     * Misc Methods
     */

    public static int getCountryTotalWastePerYear(String country, String[] countries, int[] totalWasteKgPerCapitaPerYear)
    {
        int c = 0;
        for(int i = 0; i<countries.length; i++){
            if (countries[i].equals(country)){
                c = i;
            }
        }
        return totalWasteKgPerCapitaPerYear[c];
    }

    public static String getCountryWithMostWastePerCapita(String[] countries, int[] totalWasteKgPerCapitaPerYear)
    {
        int large = 0;
        for(int i = 0; i<totalWasteKgPerCapitaPerYear.length; i++){
            if (totalWasteKgPerCapitaPerYear[large]<totalWasteKgPerCapitaPerYear[i]){
                large = i;
            }

        }
        return countries[large];
    }

    public static String[] getCountriesWithHighestPovertyPercentage(String[] countries, double[] percentagesShareInPoverty)
    {
      double greatestPercent = getMaxPercent(percentagesShareInPoverty);

      int count = 0;
      for (double j: percentagesShareInPoverty){
          if(j == greatestPercent){
              count++;
          }
      }

      String[] countriesWithHighestPovertyPercentage = new String[count];
      int index = 0;
      for(int i=0; i<percentagesShareInPoverty.length; i++){
          if(percentagesShareInPoverty[i] == greatestPercent){
              countriesWithHighestPovertyPercentage[index] = countries[i];
              index++;
          }
      }
      return countriesWithHighestPovertyPercentage;
    }

    public static double getMaxPercent(double[] percentagesShareInPoverty){
        double greatestPercent = percentagesShareInPoverty[0];
        for(double v: percentagesShareInPoverty){
            if(greatestPercent < v){
                greatestPercent = v;
            }
        }
        return greatestPercent;
    }

    public static String[] getCountriesWithHighConfidence(String[] countries, String[] confidences)
    {
        ArrayList<String> highestCountries = new ArrayList<String>();
        for (int i=0; i<confidences.length; i++){
            if(confidences[i].equals("High Confidence")){
                highestCountries.add(countries[i]);
            }
        }
        String[] greatest = highestCountries.toArray(new String[highestCountries.size()]);
        return greatest;
    }
}
