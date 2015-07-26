/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shweta
 */
public class Missing_sum {

    public static void main(String[] args) {
        int[] list_arr = {1, 2, 3, 4, 6, 7, 8, 9, 5, 10,11,13};

        int sum = 0;

        int number_sum = 0;
        int max = 0;

        for (int h = 0; h < list_arr.length; h++) {

            if (max < list_arr[h]) {
                max = list_arr[h];
            }

        }

        for (int k = 0; k < max + 1; k++) {
            number_sum += k;
        }

        for (int i = 0; i < list_arr.length; i++) {

            sum = sum + list_arr[i];
        }

        System.out.println("  totla" + (number_sum - sum));

    }
}
