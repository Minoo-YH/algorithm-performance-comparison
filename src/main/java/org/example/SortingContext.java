package org.example;

// In class Context dar Strategy Pattern hast.
// Context khodesh nemidoone kodom algorithm estefade mishe.
// Faghat yek SortingStrategy migire va azash estefade mikone.
public class SortingContext {

    // Strategy feli ro inja negah midarim.
    // In mitone BubbleSort, InsertionSort ya QuickSort bashe.
    private SortingStrategy sortingStrategy;


    // Ba in method mitonim strategy ro dar runtime avaz konim.
    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }


    // Context az strategy feli mikhad array ro sort kone.
    // Khode Context nemidoone algorithm dakhelesh chejori kar mikone.
    public void sort(int[] array) {
        sortingStrategy.sort(array);
    }
}