package Bubblesort;

public class bubbleSort {

    public static void main(String[] args) {
        
        int nums[] ={2,8,4,5,2,6,3};
        int size=nums.length;
        
        System.out.println("before sorting");
        for(int num : nums){
            System.out.print(num + " ");

        }

        for(int i=0;i<size;i++){
            for(int j=0;j<size-1;j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j]= nums[j+1];
                    nums[j+1]=temp;

                }
            }
        }

        System.out.println();
        System.out.println(" after sorting");
        for(int num : nums){
            System.out.print(num + " ");
            
        }

    }
}