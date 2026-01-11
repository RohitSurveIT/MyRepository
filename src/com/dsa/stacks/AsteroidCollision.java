package com.dsa.stacks;
import java.util.*;

public class AsteroidCollision {
	public static int[] asteroidCollision(int[] asteroids ) {
		Stack<Integer> stack=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i]>0) stack.push(asteroids[i]);
            else{
                while(!stack.isEmpty() && stack.peek()>0 && stack.peek()<Math.abs(asteroids[i])){
                    stack.pop();

                }
                if(!stack.isEmpty() && stack.peek()==Math.abs(asteroids[i])){
                    stack.pop();
                }
                else if(stack.isEmpty() || stack.peek()<0) {
                    stack.push(asteroids[i]);

                }

            }

        }
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] asteroids = {5,10,-5};
		System.out.println(Arrays.toString(asteroidCollision(asteroids)));

	}

}
