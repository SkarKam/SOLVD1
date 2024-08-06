import java.util.Arrays;
/*
To run in terminal:
javac Main.java
java Main.java 9 3 0 2 1 45 44
 */
public class Main {
    public static void main(String[] args) {
        int[] tab = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            tab[i] = Integer.parseInt(args[i]);
        }
        System.out.println("Table before sorting algorithm: " + Arrays.toString(tab));

        System.out.println("Table after sorting algorithm: " + Arrays.toString(sorting(tab)));
    }

    /**
     * Sorting method
     * @param tab - table to be sorted
     * @return sorted table
     */
    public static int[] sorting(int[] tab){
        for(int i = 0; i<tab.length; i++)
            for(int j = 0; j<tab.length; j++)
            {
                if(tab[j] > tab[i]){
                    int temp = tab[j];
                    tab[j] = tab[i];
                    tab[i] = temp;
                }
            }
       return tab;
    }

}