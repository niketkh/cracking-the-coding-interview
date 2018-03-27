## Stacks and Queues

### 3.1 Three in One
Describe how you could use a single array to implement three stacks.

### 3.2 Stack Min
How would you design a stack which in addition to push and pop, has a function min which returns the minimum element? push, pop and min should all operate in O(1) time.

### 3.3 Stack of Plates
Imagine a (literal) stack of plates. If the stack gets too high, it might topple. Therefore, in real life we would likely start a new stack when previous exceed some threshold. Implement a data structure SetOfStacks that mimics this. SetOfStacks should be composed of several stacks and should create a new stack once the previous one exceeds capacity. SetOfStacks.push() and SetOfStacks.pop() should behave identically to single stack (that is pop() should return the same values as it would if there was a just single stack).

FOLLOW UP
Implement a function popAt(int index) which performs a pop operation on a specific sub-stack.

### 3.4 Queue via Stacks
Implement a MyQueue class which implements a queue using two stacks.

### 3.5 Sort Stack 
Write a program to sort a stack such that smallest items are on the top. You can use an additional temporary stack, but you may not copy the elements into any other data structure (such as array). The stack supports the following operations: push, pop, peek, isEmpty.

### 3.6 Animal Shelter
An animal shelter, which holds only dogs and cats, operates strictly "first in, first out" basis. People must adopt either the "oldest" (based on arrival time) of all animals at the shelter, or they can select whether they would prefer a dog or a cat (and will receive the oldest animal of that type). They cannot select which specific animal they would like. Create the data structures to maintain this system and implement operations such as enqueue, dequeueDog and dequeueCat. You may use build in Linked List data structure.

