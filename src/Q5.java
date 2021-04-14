public class Q5 {

        public static void main(String a[]){ //instant method

            int[] arr1 = {4,7,3,9,2}; // created single integer array 1 & given Value

            int[] arr2 = {3,2,12,9,40,32,4}; // created single integer array 2 & given Value

            for(int i=0;i<arr1.length;i++){ // Created loop


                for(int j=0;j<arr2.length;j++){

                    if(arr1[i]==arr2[j]){

                        System.out.print(arr1[i] + " ");
                    }
                } } } }
