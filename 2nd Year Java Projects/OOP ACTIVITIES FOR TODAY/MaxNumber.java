public class MaxNumber {

    
    public static int findMax(int a, int b) {
        return (a > b) ? a : b;
    }

    
    public static int findMax(int a, int b, int c) {
        return findMax(findMax(a, b), c);
    }

    
    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        
        System.out.println("Max of 10 and 20: " + findMax(10, 20));

        
        System.out.println("Max of 5, 15, and 25: " + findMax(5, 15, 25));

        
        int[] array = {1, 5, 3, 19, 2, 8};
        System.out.println("Max in the array: " + findMax(array));
    }
}
