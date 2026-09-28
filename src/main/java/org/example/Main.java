package org.example;
// Source reference:
// GeeksforGeeks - Bubble Sort Algorithm
// https://www.geeksforgeeks.org/bubble-sort-algorithm/

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // Context ro misazim ta betoonim strategy haye mokhtalef ro estefade konim.
        SortingContext context = new SortingContext();


        // Do dataset ba size haye mokhtalef misazim.
        // Small array 30 element dare.
        // Large array 10000 element dare.
        int[] smallArray = generateRandomArray(30);
        int[] largeArray = generateRandomArray(10000);


        // Performance algorithm ha ro rooye dataset koochik test mikonim.
        System.out.println("Small array (30 elements):");

        testStrategy(context, new BubbleSort(), smallArray, "Bubble Sort");
        testStrategy(context, new InsertionSort(), smallArray, "Insertion Sort");
        testStrategy(context, new QuickSort(), smallArray, "Quick Sort");


        // Yek khate khali chap mikonim ta output khanatar bashe.
        System.out.println();


        // Performance algorithm ha ro rooye dataset bozorg test mikonim.
        System.out.println("Large array (10000 elements):");

        testStrategy(context, new BubbleSort(), largeArray, "Bubble Sort");
        testStrategy(context, new InsertionSort(), largeArray, "Insertion Sort");
        testStrategy(context, new QuickSort(), largeArray, "Quick Sort");
    }


    // In method yek array ba size morede nazar misaze.
    // Dakhele array ro ba adad haye random por mikone.
    private static int[] generateRandomArray(int size) {

        // Yek array ba size dade shode misazim.
        int[] array = new int[size];

        // Random baraye tolid adad haye random estefade mishe.
        Random random = new Random();


        // Rooye tamame khane haye array harekat mikonim.
        for (int i = 0; i < size; i++) {

            // Yek adade random beyn 0 ta 99999 misazim
            // va dakhele array gharar midim.
            array[i] = random.nextInt(100000);
        }


        // Array sakhte shode ro return mikonim.
        return array;
    }


    // In method yek sorting strategy ro test mikone.
    // Strategy mitone BubbleSort, InsertionSort ya QuickSort bashe.
    private static void testStrategy(
            SortingContext context,
            SortingStrategy strategy,
            int[] originalArray,
            String algorithmName) {


        // Az array asli yek copy migirim.
        // In kar moheme chon hame algorithm ha bayad
        // daghighan rooye data haye yeksan test beshan.
        //
        // Agar copy nagirim, algorithm aval array asli ro sort mikone
        // va algorithm dovom yek array az ghabl sort shode migire.
        int[] arrayCopy = originalArray.clone();


        // Strategy morede nazar ro dakhele Context gharar midim.
        // Inja Strategy Pattern be ma ejaze mide algorithm ro
        // dar runtime avaz konim.
        context.setSortingStrategy(strategy);


        // Zaman shoroo ro ghabl az sorting zakhire mikonim.
        long startTime = System.nanoTime();


        // Context az strategy feli estefade mikone
        // ta array ro sort kone.
        context.sort(arrayCopy);


        // Zaman payan ro baade sorting zakhire mikonim.
        long endTime = System.nanoTime();


        // Tafavote zaman payan va shoroo,
        // moddat zaman ejraye algorithm hast.
        long duration = endTime - startTime;


        // Check mikonim ke algorithm vaghean
        // array ro dorost sort karde bashe.
        boolean sorted = isSorted(arrayCopy);


        // Name algorithm, zaman ejra va natije check ro chap mikonim.
        System.out.println(
                algorithmName
                        + ": "
                        + duration
                        + " nanoseconds"
                        + " | Sorted: "
                        + sorted
        );
    }


    // In method check mikone ke array dorost sort shode ya na.
    private static boolean isSorted(int[] array) {


        // Az element dovom shoro mikonim,
        // chon bayad har element ro ba element ghablish moghayese konim.
        for (int i = 1; i < array.length; i++) {


            // Agar element feli az element ghabli koochiktar bashe,
            // yani tartib dorost nist va array sort nashode.
            if (array[i] < array[i - 1]) {

                return false;
            }
        }


        // Agar loop tamam beshe va hich moshkeli peyda nashe,
        // yani array be dorosti sort shode.
        return true;
    }
}