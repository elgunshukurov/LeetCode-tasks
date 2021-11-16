package interview.assesment;

import java.util.Arrays;

public class FlipAndInvertImage {
    private static final FlipAndInvertImage obj = new FlipAndInvertImage();
    public static void main(String[] args) {
        int[][] image = new int[2][3];
        image[0][0] = 1;
        image[0][1] = 1;
        image[0][2] = 0;

        image[1][0] = 0;
        image[1][1] = 1;
        image[1][2] = 0;

        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));

    }

    static int[][] flipAndInvertImage(int[][] image){
        int[][] arr = obj.flipImage(image);
        return invertImage(arr);
    }

     int[][] flipImage(int[][] image){
        int[][] arr = Arrays.stream(image).map(int[]::clone).toArray(int[][]::new);
        for (int i = 0; i < image.length; i++) {
            for (int k = 0; k < image[i].length; k++) {
                arr[i][k] = image[i][image[i].length-1-k];
            }
        }
        return arr;
    }

    static int[][] invertImage(int[][] image){
        for (int i = 0; i < image.length; i++) {
            for (int k = 0; k < image[i].length; k++) {
                if (image[i][k]==0) {
                    image[i][k] = 1;
                } else {
                    image[i][k] = 0;
                }
            }
        }
        return image;
    }
}
