package com.dailycoder;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SolutionTest {


    public static int[] findLeaderinArray(int[] arr){
        Stack<Integer> stack = new Stack<>();

        /**
         * push the last element always into the stack
         * since there are no elements to the
         * right it will be greater always
         */
        int N = arr.length;
        int max = arr[N-1];
        stack.push(max);

        for(int i=N-2;i>=0;--i){

            if(arr[i]>max){
                max = arr[i];
                stack.push(max);
            }
        }

        int[] result = new int[stack.size()];
        int index = 0;

        while (!stack.isEmpty()){
            result[index++] = stack.pop();
        }

        return result;
    }

    public static boolean isPrimeImpl(Integer num){

        if(num<2)
            return false;
        else if(num==2)
            return true;
        else if(num%2==0)
            return false;

        for(int i=3;i<=Math.sqrt(num);i+=2){
            if(num%i==0)
                return false;
        }

        return true;
    }

    public static void reveseArray(int[] arr,int start,int end){
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateArray(int[] arr,int K){
        int N = arr.length;

        reveseArray(arr,0,N-1);
        reveseArray(arr,0,K-1);
        reveseArray(arr,K,N-1);
    }




    Predicate<Integer> isPrime = SolutionTest::isPrimeImpl;

    @Test
    public void testPrimeNumbers(){

        List<Integer> list = Arrays.asList(-11, 7, 8, 9, 10, 11);
        List<Integer> result = list.stream().filter(isPrime).collect(Collectors.toList());
        System.out.println(result);
        Assert.assertEquals(2,result.size());

    }

    @Test
    public void arrayReversal(){
        int[] arr = {1,2,3,4,5};
        reveseArray(arr,0,4);
        Assert.assertArrayEquals(arr,new int[]{5,4,3,2,1});
    }

    @Test
    public void testArrayRotation(){
        int[] arr = {1,2,3,4};
        rotateArray(arr,2);
        Assert.assertArrayEquals(arr,new int[]{3,4,1,2});
    }

    @Test
    public void testLeadersInArray(){
       Assert.assertArrayEquals(findLeaderinArray(new int[]{16, 17, 4, 3, 5, 2}),new int[]{17,5,2});
       Assert.assertArrayEquals(findLeaderinArray(new int[]{5, 4}),new int[]{5, 4});

    }
}
