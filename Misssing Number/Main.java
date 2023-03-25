import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};

        int ans =  sort(arr);
        System.out.println(ans);
    }

    static int  sort(int[] arr){
        int i=0;

        while(i<arr.length){
            int correct = arr[i] -1;
            if(arr[i]<arr.length && arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else {
                i++;
            }
        }

        for(int index=0;index< arr.length;index++){
            if(arr[index] != index+1){
                return index +1;

            }
        }

        return arr.length;
    }

}

