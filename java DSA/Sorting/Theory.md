## Summary

• The sorting algorithms in this chapter all assume an array as a data storage
structure.
• Sorting involves comparing the keys of data items in the array and moving the
items (actually, references to the items) around until they’re in sorted order • All the algorithms in this chapter execute in O(N2) time. Nevertheless, some
can be substantially faster than others.
• An invariant is a condition that remains unchanged while an algorithm runs.
• The bubble sort is the least efficient, but the simplest, sort.
• The insertion sort is the most commonly used of the O(N2) sorts described in
this chapter.
• Asort is stable if the order of elements with the same key is retained.
• None of the sorts in this chapter require more than a single temporary variable,
in addition to the original array

## Questions

These questions are intended as a self-test for readers. Answers may be found in
Appendix C.

1.  Computer sorting algorithms are more limited than humans in that
    a. humans are better at inventing new algorithms.
    b. computers can handle only a fixed amount of data.
    c. humans know what to sort, whereas computers need to be told.
    d. computers can compare only two things at a time.
2.  The two basic operations in simple sorting are \***\*\_\*\*** items and \***\*\_\*\***
    them (or sometimes \***\*\_\*\*** them).
3.  True or False: The bubble sort always ends up comparing every item with every
    other item.
4.  The bubble sort algorithm alternates between
    a. comparing and swapping.
    b. moving and copying.
    c. moving and comparing.
    d. copying and comparing.
5.  True or False: If there are N items, the bubble sort makes exactly N\*N
    comparisons
6.  In the selection sort,
    a. the largest keys accumulate on the left (low indices).
    b. a minimum key is repeatedly discovered.
    c. a number of items must be shifted to insert each item in its correctly
    sorted position.
    d. the sorted items accumulate on the right.
7.  True or False: If, in a particular sorting situation, swaps take much longer than
    comparisons, the selection sort is about twice as fast as the bubble sort.
8.  A copy is **\_\_\_\_** times as fast as a swap.
9.  What is the invariant in the selection sort?
10. In the insertion sort, the “marked player” described in the text corresponds to
    which variable in the insertSort.java program?
    a. in
    b. out
    c. temp
    d. a[out]
11. In the insertion sort, “partially sorted” means that
    a. some items are already sorted, but they may need to be moved.
    b. most items are in their final sorted positions, but a few still need to be
    sorted.
    c. only some of the items are sorted.
    d. group items are sorted among themselves, but items outside the group
    may need to be inserted in it.
12. Shifting a group of items left or right requires repeated \***\*\_\_\*\***.
13. In the insertion sort, after an item is inserted in the partially sorted group, it
    will
    a. never be moved again.
    b. never be shifted to the left.
    c. often be moved out of this group.
    d. find that its group is steadily shrinking 14. The invariant in the insertion sort is that **\_\_\_\_**.
14. Stability might refer to
    a. items with secondary keys being excluded from a sort.
    b. keeping cities sorted by increasing population within each state, in a sort
    by state.
    c. keeping the same first names matched with the same last names.
    d. items keeping the same order of primary keys without regard to
    secondary keys

## Experiments

Carrying out these experiments will help to provide insights into the topics covered
in the chapter. No programming is involved.

1.  In bubbleSort.java (Listing 3.1) rewrite main() so it creates a large array and fills
    that array with data. You can use the following code to generate random
    numbers:
    for(int j=0; j<maxSize; j++) // fill array with
    { // random numbers
    long n = (long)( java.lang.Math.random()\*(maxSize-1) );
    arr.insert(n);
    }
    Try inserting 10,000 items. Display the data before and after the sort. You’ll see
    that scrolling the display takes a long time. Comment out the calls to display()
    so you can see how long the sort itself takes. The time will vary on different
    machines. Sorting 100,000 numbers will probably take less than 30 seconds.
    Pick an array size that takes about this long and time it. Then use the same
    array size to time selectSort.java (Listing 3.2) and insertSort.java (Listing 3.3).
    See how the speeds of these three sorts compare.
2.  Devise some code to insert data in inversely sorted order (99,999, 99,998,
    99,997, …) into bubbleSort.java. Use the same amount of data as in
    Experiment 1. See how fast the sort runs compared with the random data in
    Experiment 1. Repeat this experiment with selectSort.java and
    insertSort.java.
3.  Write code to insert data in already-sorted order (0, 1, 2, …) into
    bubbleSort.java. See how fast the sort runs compared with Experiments 1 and
4.  Repeat this experiment with selectSort.java and insertSort.java

## Programming Projects

Writing programs that solve the Programming Projects helps to solidify your under
standing of the material and demonstrates how the chapter’s concepts are applied.
(As noted in the Introduction, qualified instructors may obtain completed solutions
to the Programming Projects on the publisher’s Web site.)

3.1 In the bubbleSort.java program (Listing 3.1) and the BubbleSort Workshop
applet, the in index always goes from left to right, finding the largest item and
carrying it toward out on the right. Modify the bubbleSort() method so that it’s
bidirectional. This means the in index will first carry the largest item from left
to right as before, but when it reaches out, it will reverse and carry the smallest
item from right to left. You’ll need two outer indexes, one on the right (the old
out) and another on the left.

3.2 Add a method called median() to the ArrayIns class in the insertSort.java
program (Listing 3.3). This method should return the median value in the
array. (Recall that in a group of numbers half are larger than the median and
half are smaller.) Do it the easy way.

3.3 To the insertSort.java program (Listing 3.3), add a method called noDups() that
removes duplicates from a previously sorted array without disrupting the order.
(You can use the insertionSort() method to sort the data, or you can simply
use main() to insert the data in sorted order.) One can imagine schemes in
which all the items from the place where a duplicate was discovered to the end
of the array would be shifted down one space every time a duplicate was
discovered, but this would lead to slow O(N2) time, at least when there were a
lot of duplicates. In your algorithm, make sure no item is moved more than
once, no matter how many duplicates there are. This will give you an algo
rithm with O(N) time.

3.4 Another simple sort is the odd-even sort. The idea is to repeatedly make two
passes through the array. On the first pass you look at all the pairs of items,
a[j] and a[j+1], where j is odd (j = 1, 3, 5, …). If their key values are out of
order, you swap them. On the second pass you do the same for all the even
values (j = 2, 4, 6, …). You do these two passes repeatedly until the array is
sorted. Replace the bubbleSort() method in bubbleSort.java (Listing 3.1) with
an oddEvenSort() method. Make sure it works for varying amounts of data.
You’ll need to figure out how many times to do the two passes.
The odd-even sort is actually useful in a multiprocessing environment, where a
separate processor can operate on each odd pair simultaneously and then on
each even pair. Because the odd pairs are independent of each other, each pair
can be checked—and swapped, if necessary—by a different processor. This
makes for a very fast sort.

3.5 Modify the insertionSort() method in insertSort.java (Listing 3.3) so it counts
the number of copies and the number of comparisons it makes during a sort
and displays the totals. To count comparisons, you’ll need to break up the
double condition in the inner while loop. Use this program to measure the
number of copies and comparisons for different amounts of inversely sorted
data. Do the results verify O(N2) efficiency? Do the same for almost-sorted data
(only a few items out of place). What can you deduce about the efficiency of
this algorithm for almost-sorted data?

3.6 Here’s an interesting way to remove duplicates from an array. The insertion sort
uses a loop-within-a-loop algorithm that compares every item in the array with
every other item. If you want to remove duplicates, this is one way to start.
(See also Exercise 2.6 in Chapter 2.) Modify the insertionSort() method in the
insertSort.java program so that it removes duplicates as it sorts. Here’s one
approach: When a duplicate is found, write over one of the duplicated items
with a key value less than any normally used (such as –1, if all the normal keys
are positive). Then the normal insertion sort algorithm, treating this new key
like any other item, will put it at index 0. From now on the algorithm can
ignore this item. The next duplicate will go at index 1, and so on. When the
sort is finished, all the removed dups (now represented by –1 values) will be
found at the beginning of the array. The array can then be resized and shifted
down so it starts at 0.
