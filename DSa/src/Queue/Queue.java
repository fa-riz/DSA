package Queue;

import java.util.Arrays;

public class Queue {
				
			int[] ar = new int[10];
			int front=0;
			int rear=-1;
			
			public void addQueue(int data) {
				rear++;
				if(rear <10) {
					ar[rear] = data;
				}
				else {
					System.out.println("cant insert");
				}
			}
			
			public int deleteQueue() {
				
				int pop = ar[front];
				front++;
				return pop;
			}
			
			public void printQueue() {
//				Arrays.toString(ar);
				for(int i=front;i<=rear;i++) {
					System.out.println(ar[i]);
				}
			}
}
