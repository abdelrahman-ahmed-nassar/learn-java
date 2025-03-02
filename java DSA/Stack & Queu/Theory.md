Summary
• Stacks, queues, and priority queues are data structures usually used to simplify
certain programming operations.
• In these data structures, only one data item can be accessed.
• Astack allows access to the last item inserted.
• The important stack operations are pushing (inserting) an item onto the top of
the stack and popping (removing) the item that’s on the top.
• Aqueue allows access to the first item that was inserted.
• The important queue operations are inserting an item at the rear of the queue
and removing the item from the front of the queue.
• Aqueue can be implemented as a circular queue, which is based on an array in
which the indices wrap around from the end of the array to the beginning.
• Apriority queue allows access to the smallest (or sometimes the largest) item.
• The important priority queue operations are inserting an item in sorted order
and removing the item with the smallest key.
• These data structures can be implemented with arrays or with other
mechanisms such as linked lists.
• Ordinary arithmetic expressions are written in infix notation, so-called because
the operator is written between the two operands.
• In postfix notation, the operator follows the two operands.
• Arithmetic expressions are typically evaluated by translating them to postfix
notation and then evaluating the postfix expression.
• Astack is a useful tool both for translating an infix to a postfix expression and
for evaluating a postfix expression.
174
CHAPTER 4 Stacks and Queues
Questions
These questions are intended as a self-test for readers. Answers may be found in
Appendix C.

1.  Suppose you push 10, 20, 30, and 40 onto the stack. Then you pop three items.
    Which one is left on the stack?
2.  Which of the following is true?
    a. The pop operation on a stack is considerably simpler than the remove
    operation on a queue.
    b. The contents of a queue can wrap around, while those of a stack cannot.
    c. The top of a stack corresponds to the front of a queue.
    d. In both the stack and the queue, items removed in sequence are taken
    from increasingly high index cells in the array.
3.  What do LIFO and FIFO mean?
4.  True or False: A stack or a queue often serves as the underlying mechanism on
    which an ADT array is based.
5.  Assume an array is numbered with index 0 on the left. A queue representing a
    line of movie-goers, with the first to arrive numbered 1, has the ticket window
    on the right. Then
    a. there is no numerical correspondence between the index numbers and
    the movie-goer numbers.
    b. the array index numbers and the movie-goer numbers increase in
    opposite left-right directions.
    c. the array index numbers correspond numerically to the locations in the
    line of movie-goers.
    d. the movie-goers and the items in the array move in the same direction.
6.  As other items are inserted and removed, does a particular item in a queue
    move along the array from lower to higher indices, or higher to lower?
7.  Suppose you insert 15, 25, 35, and 45 into a queue. Then you remove three
    items. Which one is left?
8.  True or False: Pushing and popping items on a stack and inserting and
    removing items in a queue all take O(N) time.
    Questions
    175
    175
9.  A queue might be used to hold
    a. the items to be sorted in an insertion sort.
    b. reports of a variety of imminent attacks on the star ship Enterprise.
    c. keystrokes made by a computer user writing a letter.
    d. symbols in an algebraic expression being evaluated.
10. Inserting an item into a typical priority queue takes what big O time?
11. The term priority in a priority queue means that
    a. the highest priority items are inserted first.
    b. the programmer must prioritize access to the underlying array.
    c. the underlying array is sorted by the priority of the items.
    d. the lowest priority items are deleted first.
12. True or False: At least one of the methods in the priorityQ.java program
    (Listing 4.6) uses a linear search.
13. One difference between a priority queue and an ordered array is that
    a. the lowest-priority item cannot be extracted easily from the array as it
    can from the priority queue.
    b. the array must be ordered while the priority queue need not be.
    c. the highest priority item can be extracted easily from the priority queue
    but not from the array.
    d. All of the above.
14. Suppose you based a priority queue class on the OrdArray class in the
    orderedArray.java program (Listing 2.4) in Chapter 2, “Arrays.” This will buy
    you binary search capability. If you wanted the best performance for your
    priority queue, would you need to modify the OrdArray class?
15. A priority queue might be used to hold
    a. passengers to be picked up by a taxi from different parts of the city.
    b. keystrokes made at a computer keyboard.
    c. squares on a chessboard in a game program.
    d. planets in a solar system simulation.
    176
    CHAPTER 4 Stacks and Queues
    Experiments
    Carrying out these experiments will help to provide insights into the topics covered
    in the chapter. No programming is involved.
16. Start with the initial configuration of the Queue Workshop applet. Alternately
    remove and insert items. (This way, you can reuse the deleted key value for the
    new item without typing it.) Notice how the group of four items crawls up to
    the top of the queue and then reappears at the bottom and keeps climbing.
17. Using the PriorityQ Workshop applet, figure out the positions of the Front and
    Rear arrows when the priority queue is full and when it is empty. Why can’t a
    priority queue wrap around like an ordinary queue?
18. Think about how you remember the events in your life. Are there times when
    they seem to be stored in your brain in a stack? In a queue? In a priority
    queue?
    Programming Projects
    Writing programs that solve the Programming Projects helps to solidify your under
    standing of the material and demonstrates how the chapter’s concepts are applied.
    (As noted in the Introduction, qualified instructors may obtain completed solutions
    to the Programming Projects on the publisher’s Web site.)
    4.1 Write a method for the Queue class in the queue.java program (Listing 4.4) that
    displays the contents of the queue. Note that this does not mean simply
    displaying the contents of the underlying array. You should show the queue
    contents from the first item inserted to the last, without indicating to the
    viewer whether the sequence is broken by wrapping around the end of the
    array. Be careful that one item and no items display properly, no matter where
    front and rear are.
    4.2 Create a Deque class based on the discussion of deques (double-ended queues) in
    this chapter. It should include insertLeft(), insertRight(), removeLeft(),
    removeRight(), isEmpty(), and isFull() methods. It will need to support wrap
    around at the end of the array, as queues do.
    4.3 Write a program that implements a stack class that is based on the Deque class
    in Programming Project 4.2. This stack class should have the same methods
    and capabilities as the StackX class in the stack.java program (Listing 4.1).
    4.4 The priority queue shown in Listing 4.6 features fast removal of the high-prior
    ity item but slow insertion of new items. Write a program with a revised
    PriorityQ class that has fast O(1) insertion time but slower removal of the high
    priority item. Include a method that displays the contents of the priority
    queue, as suggested in Programming Project 4.1.
    Programming Projects
    177
    177
    4.5 Queues are often used to simulate the flow of people, cars, airplanes, transac
    tions, and so on. Write a program that models checkout lines at a supermarket,
    using the Queue class from the queue.java program (Listing 4.4). Several lines of
    customers should be displayed; you can use the display() method of
    Programming Project 4.1. You can add a new customer by pressing a key. You’ll
    need to determine how the customer will decide which line to join. The check
    ers will take random amounts of time to process each customer (presumably
    depending on how many groceries the customer has). Once checked out, the
    customer is removed from the line. For simplicity, you can simulate the passing
    of time by pressing a key. Perhaps every keypress indicates the passage of one
    minute. (Java, of course, has more sophisticated ways to handle time.
