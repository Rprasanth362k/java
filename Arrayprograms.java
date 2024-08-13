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

public class SumAndAverage {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {6, 7, 8, 9, 10};

        // Ensure both arrays are of the same length
        if (numbers1.length != numbers2.length) {
            System.out.println("Arrays are of different lengths.");
            return;
        }

        // Iterate through arrays and print the sum of each pair
        for (int i = 0; i < numbers1.length; i++) {
            int sum = numbers1[i] + numbers2[i];
            System.out.println(numbers1[i] + " + " + numbers2[i] + " = " + sum);
        }
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

public class LinearSearchExample {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int target = 30;
        
        // Call linearSearch method and store the result
        int index = linearSearch(array, target);
        
        if (index == -1) {
            System.out.println("Element " + target + " not found in the array.");
        } else {
            System.out.println("Element " + target + " found at index " + index + ".");
        }
    }
    
    // Method to perform linear search
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the index where the target is found
            }
        }
        return -1; // Return -1 if the target is not found
    }
}
import java.util.HashMap;
import java.util.Map;

public class FrequencyCounterString {
    public static void main(String[] args) {
        String str = "programming"; // Input string
        
        // Create a HashMap to store frequency of each character
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        
        // Convert the string to a char array and populate the HashMap
        for (char ch : str.toCharArray()) {
            if (frequencyMap.containsKey(ch)) {
                // Increment the frequency count if the character is already in the map
                frequencyMap.put(ch, frequencyMap.get(ch) + 1);
            } else {
                // Add the character to the map with a count of 1
                frequencyMap.put(ch, 1);
            }
        }
        
        // Print the frequency of each character
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Character '" + entry.getKey() + "' occurs " + entry.getValue() + " times.");
        }
    }
}
public class ArrayConcatenation {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        
        // Call the method to concatenate arrays
        int[] concatenatedArray = concatenateArrays(array1, array2);
        
        // Print the concatenated array
        for (int num : concatenatedArray) {
            System.out.print(num + " ");
        }
    }
    
    // Method to concatenate two arrays
    public static int[] concatenateArrays(int[] array1, int[] array2) {
        // Create a new array with length equal to the sum of both arrays' lengths
        int[] result = new int[array1.length + array2.length];
        
        // Copy elements from the first array
        System.arraycopy(array1, 0, result, 0, array1.length);
        // Copy elements from the second array
        System.arraycopy(array2, 0, result, array1.length, array2.length);
        
        return result;
    }
}

public class SecondLargestSmallest {
    public static void main(String[] args) {
        int[] array = {10, 20, 4, 45, 99, 99, 99, 45};

        int[] result = findSecondLargestAndSmallest(array);
        
        System.out.println("Second Smallest: " + result[0]);
        System.out.println("Second Largest: " + result[1]);
    }

    // Method to find the second smallest and second largest numbers
    public static int[] findSecondLargestAndSmallest(int[] array) {
        if (array.length < 2) {
            return new int[]{-1, -1}; // Not enough elements
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            // Update smallest and second smallest
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num > smallest && num < secondSmallest) {
                secondSmallest = num;
            }

            // Update largest and second largest
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num < largest && num > secondLargest) {
                secondLargest = num;
            }
        }

        // Check if second smallest or second largest does not exist
        if (secondSmallest == Integer.MAX_VALUE) {
            secondSmallest = -1;
        }
        if (secondLargest == Integer.MIN_VALUE) {
            secondLargest = -1;
        }

        return new int[]{secondSmallest, secondLargest};
    }
}


/Write a program to delete element from array at specified position.
int[] a = {10,20,30,40,50};
    //  0 1   2  3 4

int key = 30;
int index = 0;
for(int i=0;i<a.length; i++)
{
  if(a[i] == key) {
    {
      index = i;
      break;
    }
  }
}
for(int i=index;i<a.length;i++)
  {
  a[i] = a[i+1];
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

public class AnagramExample {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        
        // Check if the two strings are anagrams
        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
    
    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // If lengths are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Convert strings to char arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        // Sort the arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        // Check if sorted arrays are equal
        return Arrays.equals(arr1, arr2);
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

public class CharacterPresenceCheck { //subarray
    public static void main(String[] args) {
        String s1 = "India";
        String s2 = "In";

        // Convert strings to character arrays
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        
        int count = 0;

        // Check if each character in s2 is present in s1
        for (char letter : c2) {
            boolean found = false;
            for (char c : c1) {
                if (c == letter) {
                    found = true;
                    break;
                }
            }
            if (found) {
                count++;
            }
        }

        // Check if all characters in s2 are present in s1
        if (c2.length == count) {
            System.out.println("All letters are present");
        } else {
            System.out.println("Not all letters are present");
        }
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

