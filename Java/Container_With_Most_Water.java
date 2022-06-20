package Java;

public class Container_With_Most_Water {
    public int maxArea(int[] height) {
        int max_area = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            if (height[left] < height[right]) {
                max_area = Math.max(max_area, height[left] * (right - left));
                left++;
            } else {
                max_area = Math.max(max_area, height[right] * (right - left));
                right--;
            }
        }
        return max_area;
    }
}
