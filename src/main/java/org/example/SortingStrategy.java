package org.example;
// each want sorting startegy must follow rols
// this is rols for all startegy void sort(int[] array);
// sort اسم متده؛ یعنی مرتب کن.
//int[] یعنی چیزی که متد دریافت می‌کنه باید آرایه‌ای از integerها باشه
//array فقط اسم پارامتره
public interface SortingStrategy {
    void sort(int[] array);
}
