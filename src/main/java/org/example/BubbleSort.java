package org.example;

// In class yeki az strategy haye sorting ma hast.
// implements yani BubbleSort gharardade SortingStrategy ro ghabool mikone.
public class BubbleSort implements SortingStrategy {

    // @Override yani in method az SortingStrategy miad
    // va ma inja implementation khodemon ro barash minevisim.
    @Override
    public void sort(int[] array) {

        // In loop moshakhas mikone chand bar bayad rooye array harekat konim.
        for (int pass = 0; pass < array.length - 1; pass++) {

            // Baade har pass, yek adade bozorg dar jaye dorostesh gharar migire.
            // Pas ba -pass dige ghesmat haye sort shodeye akhare array ro check nemikonim.
            for (int i = 0; i < array.length - 1 - pass; i++) {

                // Agar adade chap bozorgtar az adade rast bashe,
                // jashoon ro avaz mikonim.
                if (array[i] > array[i + 1]) {

                    // Adade chap ro movaghat negah midarim ta az dast nare.
                    int temp = array[i];

                    // Adade rast mire jay adade chap.
                    array[i] = array[i + 1];

                    // Adade ghadimi chap mire jay adade rast.
                    array[i + 1] = temp;
                }
            }
        }
    }
}