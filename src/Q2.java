public class Q2 {
public static void main(String [] ags){ //instant method

    int[] numArray= new int[]{48,98,32,65,5,25}; // created method single integer array  & given Value
    int temp; // created method temp
    for (int i = 0; i <numArray.length ; i++) { // Created loop
        for (int j = i; j < numArray.length; j++) {
          if (numArray[i]>numArray[j]){
              temp = numArray[i];
              numArray [i] = numArray[j];
              numArray [j] = temp;
          }
        }
    }
    for(int a:numArray){
        System.out.print(a + " ");
    }
}
}
