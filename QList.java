/*
 * Given an array of integers, write a function that will produce a random 
 * permutation of the input array.  

Write a function to find the power of a^b
Find the minimum distance between 2 words in a dictionary
Evaluate a post-fix expression
Given an array of numbers , replace each number with the product of all the numbers divided by the number at that index without using the division operator  

Given an unordered binary tree and any two distinct nodes in the tree, 
find their common ancestor.  

Given two linked lists that could potentially have a merge—i.e., at some point 
during one of the linked lists, the next node is a node in the other list—write 
an algorithm that determines if two lists merge or not. The lists could also potentially 
contain a cycle—i.e., an element can loop back around to the head.  

sorted character array return next largest character for given input character
{c,f,g,h,k} i/p c o/p f  

The system contains N points. Given a point and a value k, find the k closest points in the system.  

Edit distance using recursion and dp  

Binary search on a sorted array that has been shifted left  

Given a tree where every right node is a leaf, meaning that it can only extend on the left side, invert it such that the leftmost node is now the root, and all of the previous left nodes are now on the right side. The former right nodes will be on the left side.  

Interview Questions
1. What is a mutex, semaphore
2. What is virtual memory, paging. Why is it required to swap pages, etc..
3. What is virtual destructor (explain with some code).
4. The code was pasted in collabedit. Its an easy problem to solve, but only if you understand the problem in 5 minutes. I had about 20 minutes in total. (You might see the interviewer has mixed Java and C++. There is no public/private access specifier. Integer class is only in Java, coding standards are according to Java specifications, but I guess you get the point of the question, so that's not a problem).

//**
 * Given a nested list of integers, returns the sum of all integers in the list weighted by their depth
 * For example, given the list {{1,1},2,{1,1}} the function should return 10 (four 1's at depth 2, one 2 at depth 1)
 * Given the list {1,{4,{6}}} the function should return 27 (one 1 at depth 1, one 4 at depth 2, and one 6 at depth 3)
// *
int depthSum (NestedInteger *input, int count)
{}


// * This is the interface that represents nested lists.
// * You should not implement it, or speculate about its implementation.
 
class NestedInteger
{
    // @return true if this NestedInteger holds a single integer, rather than a nested list 
    boolean isInteger();

    // @return the single integer that this NestedInteger holds, if it holds a single integer
     * Return null if this NestedInteger holds a nested list 
    Integer getInteger();

    // @return the nested list that this NestedInteger holds, if it holds a nested list
     * Return null if this NestedInteger holds a single integer 
    NestedInteger *getList();
    int getCount();
}  
*/
public class QList {

}
