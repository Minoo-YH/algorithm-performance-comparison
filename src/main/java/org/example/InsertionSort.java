package org.example;
// In class yeki az strategy haye sorting ma hast.
// implements yani InsertionSort gharardade SortingStrategy ro ghabool mikone.
public class InsertionSort implements SortingStrategy {

    // @Override yani in method az SortingStrategy miad
    // va ma inja implementation Insertion Sort ro minevisim.
    @Override
    public void sort(int[] array) {

        // Az index 1 shoro mikonim, chon avalin element ro
        // be tanhayi sort shode dar nazar migirim.
        for (int i = 1; i < array.length; i++) {

            // Adadi ke mikhaym jaye dorostesh ro peyda konim.
            int key = array[i];

            // Az element ghabli shoro mikonim.
            int j = i - 1;

            // Ta zamani ke adade samte chap az key bozorgtar bashe,
            // ono yek khane be rast mibaram.
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            // Key ro dar jaye dorostesh gharar midim.
            array[j + 1] = key;
        }
    }
}