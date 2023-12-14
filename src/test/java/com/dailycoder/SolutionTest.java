package com.dailycoder;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SolutionTest {

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
}
