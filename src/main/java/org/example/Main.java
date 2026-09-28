package org.example;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // Context ro misazim ta strategy haye mokhtalef ro estefade konim.
        SortingContext context = new SortingContext();

        // Do dataset ba size haye mokhtalef misazim.
        int[] smallArray = generateRandomArray(30);
        int[] largeArray = generateRandomArray(10000);

        // Performance algorithm ha ro rooye dataset koochik test mikonim.
        System.out.println("Small array (30 elements):");

        testStrategy(context, new BubbleSort(), smallArray, "Bubble Sort");
        testStrategy(context, new InsertionSort(), smallArray, "Insertion Sort");
        testStrategy(context, new QuickSort(), smallArray, "Quick Sort");


        // Performance algorithm ha ro rooye dataset bozorg test mikonim.
        System.out.println("\nLarge array (10000 elements):");

        testStrategy(context, new BubbleSort(), largeArray, "Bubble Sort");
        testStrategy(context, new InsertionSort(), largeArray, "Insertion Sort");
        testStrategy(context, new QuickSort(), largeArray, "Quick Sort");
    }


    // In method yek array ba adad haye random misaze.
    private static int[] generateRandomArray(int size) {

        int[] array = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++) {

            // Yek adade random beyn 0 ta 99999 misazim.
            array[i] = random.nextInt(100000);
        }

        return array;
    }


    // In method performance yek strategy ro test mikone.
    private static void testStrategy(
            SortingContext context,
            SortingStrategy strategy,
            int[] originalArray,
            String algorithmName) {

        // Az array asli copy migirim ta hame algorithm ha
        // daghighan rooye data haye yeksan test beshan.
        int[] arrayCopy = originalArray.clone();


        // Strategy morede nazar ro dar Context gharar midim.
        context.setSortingStrategy(strategy);


        // Zaman shoroo ro zakhire mikonim.
        long startTime = System.nanoTime();


        // Array ro ba strategy feli sort mikonim.
        context.sort(arrayCopy);


        // Zaman payan ro zakhire mikonim.
        long endTime = System.nanoTime();


        // Moddat zaman ejra ro hesab mikonim.
        long duration = endTime - startTime;


        // Natije ro chap mikonim.
        System.out.println(
                algorithmName + ": " + duration + " nanoseconds"
        );
    }
}