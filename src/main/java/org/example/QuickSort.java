package org.example;

// In class yeki az strategy haye sorting ma hast.
// implements yani QuickSort gharardade SortingStrategy ro ghabool mikone.
public class QuickSort implements SortingStrategy {

    // @Override yani in method az SortingStrategy miad.
    // In method noghte voroodi Quick Sort hast.
    @Override
    public void sort(int[] array) {

        // Agar array null bashe ya kamtar az 2 element dashte bashe,
        // niaz be sort kardan nadare.
        if (array == null || array.length < 2) {
            return;
        }

        // Quick Sort ro az avalin ta akharin index shoro mikonim.
        quickSort(array, 0, array.length - 1);
    }


    // In method Quick Sort ro rooye yek ghesmat az array anjam mide.
    private void quickSort(int[] array, int low, int high) {

        // Faghat zamani edame midim ke hade payin az hade bala koochiktar bashe.
        if (low < high) {

            // Array ro partition mikonim va index nahayi pivot ro migirim.
            int pivotIndex = partition(array, low, high);

            // Ghesmat samte chap pivot ro sort mikonim.
            quickSort(array, low, pivotIndex - 1);

            // Ghesmat samte rast pivot ro sort mikonim.
            quickSort(array, pivotIndex + 1, high);
        }
    }


    // In method pivot ro entekhab mikone va array ro partition mikone.
    private int partition(int[] array, int low, int high) {

        // Akharin element ro be onvane pivot entekhab mikonim.
        int pivot = array[high];

        // i marze adad haye koochiktar az pivot ro negah midare.
        int i = low - 1;

        // Az low ta ghable pivot ro check mikonim.
        for (int j = low; j < high; j++) {

            // Agar adade feli az pivot koochiktar ya mosavi bashe,
            // bayad be ghesmat chap pivot bere.
            if (array[j] <= pivot) {

                i++;

                // array[i] va array[j] ro swap mikonim.
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Dar akhar pivot ro dar jaye dorostesh gharar midim.
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // Index nahayi pivot ro return mikonim.
        return i + 1;
    }
}