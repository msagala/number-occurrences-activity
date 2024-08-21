package org.ripeconcepts.activity;

public class Solution {

    public static void main(String[] args) {
        int[] oddNumberArrayTest1 = {9,3,9,3,9,7,9};
        int[] oddNumberArrayTest2 = {1,2,9,2,1};
        System.out.println("Test Case 1 {9,3,9,3,9,7,9} :  " + solution(oddNumberArrayTest1));
        System.out.println("Test Case 2 {1,2,9,2,1} :  " + solution(oddNumberArrayTest2));
    }

    public static int solution(int[] A) {
        // Sample -  9 3 9 3 9 7 9
        int result = 0;
        for(int i = 0; i < A.length; i++) {
            for(int j = i; j < A.length - 1; j++) {
                if(A[i] == A[j+1] && A[j+1] != 0 && A[i] != 0) {
                    A[j+1] = 0;
                    break;
                }
            }
            if(A[i] != 0) {
                result = A[i];
            }
        }
        return result;
    }

}