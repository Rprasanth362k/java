public class SumAndAverage {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        double average = (double) sum / numbers.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}

public class MinMaxInArray {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12};
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};

        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        System.out.println("Reversed array: " + Arrays.toString(numbers));
    }
}

public class FindDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 2, 5, 3, 6, 7};

        System.out.println("Duplicate elements:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                }
            }
        }
    }
}

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 7, 1};

        Arrays.sort(numbers);

        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 2, 5, 3, 6, 7};
        int[] tempArray = new int[numbers.length];
        int j = 0;

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] != numbers[i + 1]) {
                tempArray[j++] = numbers[i];
            }
        }

        tempArray[j++] = numbers[numbers.length - 1];

        int[] resultArray = Arrays.copyOf(tempArray, j);

        System.out.println("Array without duplicates: " + Arrays.toString(resultArray));
    }
}

public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, 5, 7, 4, 10, 12};
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }

        System.out.println("Second largest element: " + secondLargest);
    }
}

import java.util.Arrays;

public class LeftRotateArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int first = numbers[0];

        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
        numbers[numbers.length - 1] = first;

        System.out.println("Array after left rotation: " + Arrays.toString(numbers));
    }
}

public class MissingNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5, 6};
        int n = numbers.length + 1;
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;

        for (int num : numbers) {
            arraySum += num;
        }

        int missingNumber = totalSum - arraySum;
        System.out.println("Missing number: " + missingNumber);
    }
}

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 2, 1, 4, 1, 5, 3, 2, 1};
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int mostFrequentElement = -1;
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentElement = entry.getKey();
            }
        }

        System.out.println("Most frequent element: " + mostFrequentElement);
    }
}

