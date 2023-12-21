package com.dailycoder;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SolutionTest {


    private int findEquilibiriumIndex(int[] arr){
        return 1;
    }

    private int testMinClocksToCompleteAllCycles(int[] A,int[] B){

        Stack<Integer> st = new Stack<>();
        int result = 0;

        for(int i:B)
            st.push(i);

        Queue<Integer> queue = new LinkedList<>();

        for(int i:A)
            queue.add(i);

        while (!st.isEmpty()){

//            if(queue.offer()==)
        }

        return result;
    }

    private Character findFirstRepeatingCharacter(String s){

        Set<Character> set = new HashSet<>();
        char[] charArr = s.toCharArray();

        for(char c:charArr){
            if(set.contains(c))
                return c;

            set.add(c);
        }


        return null;
    }


    @Test
    public void leastAverageOfSubArraySizeK(int[] A,int K){

        int result = 0;
        int leastAverage = 0;
        int N = A.length;
        int average = 0;

       Queue<Integer> queue1 = new ArrayDeque<>();
       Queue<Integer> queue2 = new ArrayDeque<>();

       queue1.add(1);
       queue1.add(2);

        System.out.println(queue1.peek());

    }

    public int maxSubArray(final int[] A) {

        int max = A[0];
        int sum = A[0];
        int N = A.length;

        for(int i=1;i<N;++i){

            sum += A[i];
            if(sum >max){
                max = sum;
            }
        }

        return max;
    }


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

    @Test
    public void testMaxSubArray(){

        String str = new String("java");
        str.concat("prog");
        System.out.println(str);

        int[] arr = {1,2,3,4,-10};
        Assert.assertEquals(10,maxSubArray(arr));
    }


    @Test
    public void testLeastAverageOfSubArraySizeK(){

//        Assert.assertEquals(3,leastAverageOfSubArraySizeK(new int[]{3, 7, 90, 20, 10, 50, 40},3));
//        Assert.assertEquals(2,leastAverageOfSubArraySizeK(new int[]{3, 7, 5, 20, -10, 0, 12},2));
    }

    @Test
    public void firstRepeatingCharacterTest(){
        Assert.assertEquals(new Character('r'),findFirstRepeatingCharacter("freshworks"));
        Assert.assertEquals(new Character('a'),findFirstRepeatingCharacter("amazon"));
        Assert.assertEquals(new Character('p'),findFirstRepeatingCharacter("paypal"));
        Assert.assertEquals(new Character('a'),findFirstRepeatingCharacter("standardchartered"));
    }

    @Test
    public void MinCycles(){

        Queue<Integer> queue1 = new ArrayDeque<>();
        Queue<Integer> queue2 = new ArrayDeque<>();
        int clock = 0;


        int[] A = {2, 3, 1, 5, 4};
        int[] B = {1, 3, 5, 4, 2};

        for(int a:A)
            queue1.add(a);

        for (int b:B)
            queue2.add(b);


        while (!queue1.isEmpty()){

            if(queue1.peek()==queue2.peek()){
                queue2.remove();
                queue1.remove();
                clock++;
            }
            else {
                int temp = queue1.remove();
                queue1.add(temp);
                clock++;
            }
        }

        System.out.println("Min clock reqd::"+clock);
    }
}
