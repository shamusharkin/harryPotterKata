public class BubbleSort {

    public static int[] sort(int[] input) {
        return sortAscending(input);
    }

    public static int[] sort(int[] input, char sortOrder) {
        if(Character.toLowerCase(sortOrder) == 'a') {
            return sortAscending(input);
        } else if (Character.toLowerCase(sortOrder) == 'd'){
            return sortDescending(input);
        } else {
            return input;
        }
    }

    private static int[] sortAscending(int[] input) {
        int count = 0;
        while(count < input.length) {
            int temp = 0;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i + 1]) {
                    temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                }
            }
            count++;
        }
        return input;
    }

    private static int[] sortDescending(int[] input) {
        int count = 0;
        while(count < input.length) {
            int temp = 0;
            for (int i = input.length-1; i > 0 + 1; i--) {
                if (input[i] > input[i - 1]) {
                    temp = input[i];
                    input[i] = input[i - 1];
                    input[i - 1] = temp;
                }
            }
            count++;
        }
        return input;
    }
}
