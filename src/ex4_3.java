/**
 * Created by 노승화 on 2017-06-16.
 */
public class ex4_3 {
    public static void main(String[] args) {
        int[] counts = null;
        float[] heights = {171.3F, 175.0F};
        // NullPointerException
        System.out.println(counts[1]);
        // ArrayIndexOutOfBoundsException
        System.out.println(heights[2]);
    }
}
