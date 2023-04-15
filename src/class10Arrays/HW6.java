package class10Arrays;

public class HW6 {
    public static void main(String[] args) {
        /* Create 2D array of countries: North America countries, South America countries,
         Europe countries, Asian countries, African countries. Then print all values from
         that array using 2 different loops and calculate how many total countries been
         stored. */
        String [][] country={
                            {"Mexico", "United States", "Canada"},
                            {"Peru", "Colombia", "Brazil"},
                            {"France", "England", "Italy"},
                            {"Philippines", "Thailand", "Nepal"},
                            {"Nigeria", "Zambia", "The Democratic Republic of Congo"}
        };
        int sum=0;
        for (String[] rowCountry : country){
            for (String i : rowCountry){
                System.out.print(i+" ");
                sum+=1;
            }
        }
        System.out.println("Total countries: "+sum);

        System.out.println("---------------");
        int sum2=0;
        for (int a=0; a< country.length; a++){
            String [] arr1 = country[a];
            for (int b=0; b< arr1.length; b++){
                System.out.print(arr1[b]+" ");
                sum2+=1;
            }
        }
        System.out.println();
        System.out.println("Total countries: "+sum2);
    }
}
