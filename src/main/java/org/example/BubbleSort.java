package org.example;
// In class yeki az strategy haye sorting ma hast.
// implements yani BubbleSort gharardade SortingStrategy ro ghabool mikone.
public class BubbleSort implements SortingStrategy {

    // @Override yani in method az SortingStrategy miad
    // va ma inja implementation khodemon ro barash minevisim.
    @Override
    public void sort(int[] array) {

        // In loop rooye array harekat mikone.
        // Har bar do adade kenare ham ro moghayese mikonim.
        for (int i = 0; i < array.length - 1; i++) {

            // Agar adade chap bozorgtar az adade rast bashe,
            // bayad jashoon ro avaz konim.
            if (array[i] > array[i + 1]) {

                // Adade chap ro movaghat negah midarim ta az dast nare.
                int temp = array[i];

                // Adade rast ro mibaram jay adade chap.
                array[i] = array[i + 1];

                // Adade ghadimi chap ro mibaram jay adade rast.
                array[i + 1] = temp;
            }
        }
    }
}