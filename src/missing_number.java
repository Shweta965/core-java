
import java.io.IOException;

public class missing_number {

    public static void main(String[] args) throws IOException {

        int[] list_arr = {1, 2, 3, 4, 6};
        boolean flag = false;

        int find_numer = 6;
        // we want to find missing number in array
        for (int i = 0; i < list_arr.length; i++) {
            System.out.println(":::" + list_arr[i]);
            int j = list_arr[i];
            if (j == find_numer) {
                flag = true;
            }

        }

        if (!flag) {
            System.out.println("number not found");
        } else {
            System.out.println("number found");
        }

    }

}
