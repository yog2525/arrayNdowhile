public class Q1 {
  public static void main(String[] args) { //instant method

      int [] arr1={6,7,8,9}; // created single integer array 1 & given Value
      int [] arr2={6,7,7,9}; // created single integer array 2 & given Value
      boolean isEquals = true; // created boolean
      if(arr1.length == arr2.length){ // created if else method
          for (int i = 0; i <arr1.length ; i++) {
              if(arr1[i] != arr2[i])
              isEquals = false;
                       }
      }
      else {
          isEquals = false;
      }
      if (isEquals){
          System.out.println("Both array is Equal");
      } else
          System.out.println("Both array not Equal");
    }
}
