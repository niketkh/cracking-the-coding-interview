## Arrays and Strings

* **1.1 Is Unique:** Implement and algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
    - [Solution using Brute Force: O(n<sup>2</sup>)](1.1/1-brute-force.java)
    - [Solution using Sorting: O(nlogn)](1.1/2-using-sort.java)
    - [Solution using HashSet: O(n)](1.1/3-using-hashset.java)
    - [Solution using 256 sized array: O(n)](1.1/4-using-256-sized-array.java)
    - [Solution using bit manipulation: O(n)](1.1/5-using-bit-manipulation.java)



* **1.2 Check Permutation:** Given two strings, write a method to decide if one is permutation of other.

* **1.3 URLify:** Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end to hold additional characters, and that you are given the "true" length of string. (Note: If implementing in Java, please use character array so that you can perform this operation in place.)
```
Input: "Mr John Smith      ", 13
Output: "Mr%20%John%20%Smith"
```

* **1.4 Palindrome Permutation:** Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation is rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
```
Input: Tact Coa
Output: True (permutations: "taco cat", "atco cta", etc.)
```

* **1.5 One Away:** There are three type of edits that can be performed on strings: Insert a character, remove a character, or replace a character. Give two strings, write a function to check if they are one edut (or zero edits) away.
```
Example:
pale, ple   -> true
pales, pale -> true
pale, bale  -> true
pale, bake  -> false
```

* **1.6 String Compression:** Implement a method to perform basic string using counts of repeated characters. If the compressed string would not become smaller than original string your method should return the original string. You can assume teh string has only uppercase and lowercase letters (a-z)
```
Input: aabcccccaaa
Output: a2b1c5a3
```

* **1.7 Rotate Matrix:** Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in place?

* **1.8 Zero Matrix:** Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.

* **1.9 String Rotation:** Assume you have a method isSubstring which checks if one word is substring of another. Given two strings, s1 and s2 write code to check if s2 is rotation of s1 using only one call to isSubstring (e.g., "waterbottle" is a rotation of "erbottlewat").
