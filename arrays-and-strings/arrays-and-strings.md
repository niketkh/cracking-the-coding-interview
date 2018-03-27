## Arrays and Strings

### 1.1 Is Unique
Implement and algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?

Solution|Time Complexity|Space Complexity
---|:---:|:---:
[Brute Force](1.1/1-brute-force.java)                       |O(n<sup>2</sup>)|O(1)
[Using Sorting](1.1/2-using-sorting.java)                   |O(nlogn)|O(1)
[Using HashSet](1.1/3-using-hashset.java)                   |O(n)|O(n)
[Using 256 sized array](1.1/4-using-256-sized-array.java)   |O(n)|O(1)
[Using bit manipulation](1.1/5-using-bit-manipulation.java) |O(n)|O(1)

### 1.2 Check Permutation
Given two strings, write a method to decide if one is permutation of other.

Solution|Time Complexity|Space Complexity
---|:---:|:---:
[Using Sorting](1.2/1-using-sorting.java)   |O(nlogn)|O(1)
[Using HashMap](1.2/2-using-hashmap.java)   |O(n)|O(n)

### 1.3 URLify
Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end to hold additional characters, and that you are given the "true" length of string. (Note: If implementing in Java, please use character array so that you can perform this operation in place.)

```
Input: "Mr John Smith      ", 13
Output: "Mr%20John%20Smith"
```

Solution|Time Complexity|Space Complexity
---|:---:|:---:
[Using String Builder](1.3/1-using-stringbuilder.java) | O(n) | O(n)
[Inplace solution with input as char array](1.3/2-input-as-char-array-and-inplace.java)            | O(n) | O(1)


### 1.4 Palindrome Permutation
Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation is rearrangement of letters. The palindrome does not need to be limited to just dictionary words.

```
Input: Tact Coa
Output: True (permutations: "taco cat", "atco cta", etc.)
```

Solution|Time Complexity|Space Complexity
---|:---:|:---:
[Naive Approach by generating all permutations](1.4/1-naive-solution-high-complexity.java)          | O(n!) | O(n!)
[Using Palindrome Property](1.4/2-using-palindrome-property.java)                                                    | O(n) | O(n)

### 1.5 One Away
There are three type of edits that can be performed on strings: Insert a character, remove a character, or replace a character. Give two strings, write a function to check if they are one edut (or zero edits) away.

```
Example:
pale, ple   -> true
pales, pale -> true
pale, bale  -> true
pale, bake  -> false
```

Solution|Time Complexity|Space Complexity
---|:---:|:---:
[Solution ??]

### 1.6 String Compression
Implement a method to perform basic string using counts of repeated characters. If the compressed string would not become smaller than original string your method should return the original string. You can assume the string has only uppercase and lowercase letters (a-z)

```
Input: aabcccccaaa
Output: a2b1c5a3
```

Solution|Time Complexity|Space Complexity
---|:---:|:---:
[Solution 1](1.6/1-string-compression.java) | O(n) | O(n)
[Solution 2](1.6/2-string-compression.java) | O(n) | O(n)

### 1.7 Rotate Matrix
Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in place?

Solution|Time Complexity|Space Complexity
---|:---:|:---:
[Solution](1.7/1-rotate-matrix-90.java) | O(n<sup>2</sup>) | O(n<sup>2</sup>)
[Inplace Solution ??]                   | O(n<sup>2</sup>) | O(1)

### 1.8 Zero Matrix
Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.

Solution|Time Complexity|Space Complexity
---|:---:|:---:
[Solution](1.8/1-zero-matrix.java) | O(n<sup>2</sup>) | O(n<sup>2</sup>)
[Inplace Solution ??]              | O(n<sup>2</sup>) | O(1)

### 1.9 String Rotation
Assume you have a method isSubstring which checks if one word is substring of another. Given two strings, s1 and s2 write code to check if s2 is rotation of s1 using only one call to isSubstring (e.g., "waterbottle" is a rotation of "erbottlewat").
