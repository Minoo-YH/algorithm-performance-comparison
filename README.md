# Algorithm Performance Comparison

This project is about comparing three different sorting algorithms in Java. I used the Strategy pattern so that the sorting algorithm can be changed without changing the main sorting process.

The three algorithms I used are:

- Bubble Sort
- Insertion Sort
- Quick Sort

## Strategy Pattern

I created a `SortingStrategy` interface with a `sort()` method.

Each sorting algorithm implements this interface in its own class.

The `SortingContext` class has a `SortingStrategy` and uses it to sort an array. By using `setSortingStrategy()`, I can change the sorting algorithm while the program is running.

## Testing

I created two arrays with random integer values:

- Small array: 30 elements
- Large array: 10,000 elements

I tested all three algorithms with both arrays.

Before testing an algorithm, I make a copy of the original array. This is important because otherwise the first algorithm would sort the original array and the next algorithm would get an already sorted array.

I used `System.nanoTime()` to measure how long each algorithm takes.

The program also checks if the array was sorted correctly.

One test run gave these results:

```text
Small array (30 elements):
Bubble Sort: 23000 nanoseconds | Sorted: true
Insertion Sort: 9200 nanoseconds | Sorted: true
Quick Sort: 11900 nanoseconds | Sorted: true

Large array (10000 elements):
Bubble Sort: 63209500 nanoseconds | Sorted: true
Insertion Sort: 23525300 nanoseconds | Sorted: true
Quick Sort: 2212700 nanoseconds | Sorted: true
```

The execution times can be different each time the program is run.

With the larger array, the difference between the algorithms was much easier to see. In my test, Quick Sort took much less time than Bubble Sort and Insertion Sort.

## Sources

I used GeeksforGeeks as a reference for the sorting algorithms:

- Bubble Sort: https://www.geeksforgeeks.org/bubble-sort-algorithm/
- Insertion Sort: https://www.geeksforgeeks.org/insertion-sort-algorithm/
- Quick Sort: https://www.geeksforgeeks.org/quick-sort-algorithm/

I did not use `Arrays.sort()` or another built-in sorting algorithm.