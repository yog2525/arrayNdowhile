public class Q3 {

    public static void main(String[] args) { //instant method

        String s = "bas das gas at ai"; // Created string methods
        String letter = "a"; // find letter in the string
        int index = -1, count = 0;
        do{      // created do while
            index = s.indexOf(letter);
            if(index != -1){
                count++;
                s = s.substring(index + 1);
            }
        }while(index != -1);

        System.out.println(count);
    }}

