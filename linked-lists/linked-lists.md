## Linked Lists

### 2.1 Remove Duplicates
Write code to remove duplicates from an unsorted linked list.
FOLLOW UP: How would you solve this problem if a temporary buffer is not allowed?

### 2.2 Return Kth from Last
Implement an alogorithm to find the kth to last last element of a singly linked list.

### 2.3 Delete Middle Node
Implement an algorithm to delete a node in the middle (i.e., any node but the first and last node, not necessarily the exact middle) of a singly linked list, given only access to that node.

```
Input: Node c from linked list a -> b -> c -> d -> e -> f
Output: Nothing is returned but linked list looks like a -> b -> d -> e -> f
```

### 2.4 Partition
Write a code to partition a linked list around a value x, such that all nodes less than x come before all nodes greater than or equal to x. If x is contained within the list, the values of x only need to be after the elements less than x. The partition element x can appear anywhere in the "right partition"; it does not need to appear between left and right partitions.

```
Input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition = 5]
Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
```

### 2.5 Sum Lists
You have two numbers represented by a linked list, where each node contains single digit. The digits are stored in reverse order, such that the 1's digit is at the head of the list. Write a function that adds the two numbers and returns the sum as linked list.

```
Input: (7 -> 1 -> 6) + (5 -> 9 -> 2) i.e 617 + 295
Output: 2 -> 1 -> 9 i.e 912

FOLLOW UP

Suppose digits are stored in forward order. Repeat the above problem
Input: (6 -> 1 -> 7) + (2 -> 9 -> 5) i.e 617 + 295
Output: 9 -> 1 -> 2 i.e 912

```


### 2.6 Palindrome
Implement a function to check if a linked list is a palindrome.

### 2.7 Intersection
Given two (singly) linked lists, determine if the two lists intersect. Return the intersecting node. Note that the intersection is defined based on reference, not value. That is if the kth node if the first linked list is the exact same node (by reference) as the jth node of the second linked list, then they are intersecting.

### 2.8 Loop Detection
Given a circular linked list, implement an algorithm that returns the node at the beginning of the loop.

DEFINITION
Circular linked list: A corrupt linked list in which a node's next pointer points to an earlier node, so as to make a loop in the linked list.

```
Input: A -> B -> C -> D -> E -> C [the same C as earlier]
Output: C
```

