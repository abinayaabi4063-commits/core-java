 class Array{
    public static void main(String args[]) {

        // 1. Array Basics
        int[] marks = {50, 60, 70, 80, 90};
        System.out.println("Length: " + marks.length);
        System.out.println("First: " + marks[0]);
        System.out.println("Last: " + marks[4]);
        marks[0] = 55; // change value
        System.out.println("After Change: " + marks[0]);

        // 2. Display Using For Loop
        System.out.println("\n2. For Loop:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // 3. Enhanced For Loop
        System.out.println("\n3. Enhanced For Loop:");
        for (int m : marks) {
            System.out.println(m);
        }

        // 4. Sum of Array
        int[] numbers = {5, 10, 15, 20, 25};
        int sum = 0;
        for (int n : numbers) {
            sum = sum + n;
        }
        System.out.println("\n4. Sum = " + sum);

        // 5. Average of Array
        int total = 0;
        for (int n : numbers) {
            total = total + n;
        }
        double average = (double) total / numbers.length;
        System.out.println("5. Total = " + total + ", Average = " + average);

        // 6. Find Largest Number
        int[] nums = {12, 45, 22, 98, 31};
        int largest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        System.out.println("\n6. Largest = " + largest);

        // 7. Find Smallest Number
        int smallest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < smallest) {
                smallest = nums[i];
            }
        }
        System.out.println("7. Smallest = " + smallest);

        // 8. Even and Odd Numbers
        System.out.println("\n8. Even / Odd Check:");
        int[] eo = {2, 7, 10, 13};
        for (int n : eo) {
            if (n % 2 == 0) {
                System.out.println(n + " - Even");
            } else {
                System.out.println(n + " - Odd");
            }
        }

        // 9. Reverse Array
        System.out.println("\n9. Reverse Array:");
        int[] rev = {1, 2, 3, 4, 5};
        for (int i = rev.length - 1; i >= 0; i--) {
            System.out.print(rev[i] + " ");
        }
        System.out.println();

        // 10. Search an Element
        int[] searchArr = {10, 20, 30, 40, 50};
        int search = 40;
        boolean found = false;
        for (int n : searchArr) {
            if (n == search) {
                found = true;
                break;
            }
        }
        System.out.println("\n10. " + search + (found? " Found" : " Not Found"));

        // 11. Count Even and Odd Numbers
        int[] values = {1, 2, 3, 4, 5, 6};
        int evenCount = 0, oddCount = 0;
        for (int n : values) {
            if (n % 2 == 0) evenCount++;
            else oddCount++;
        }
        System.out.println("\n11. Even Count = " + evenCount + ", Odd Count = " + oddCount);

        // 12. Count Positive, Negative and Zero
        int[] pnz = {5, -3, 0, 8, -1, 0};
        int pos = 0, neg = 0, zero = 0;
        for (int n : pnz) {
            if (n > 0) pos++;
            else if (n < 0) neg++;
            else zero++;
        }
        System.out.println("12. Positive = " + pos + ", Negative = " + neg + ", Zero = " + zero);

        // 13. Find Second Largest Number
        int[] sLargeArr = {10, 20, 90, 80, 70};
        int lar = sLargeArr[0];
        int secLar = Integer.MIN_VALUE;
        for (int n : sLargeArr) {
            if (n > lar) {
                secLar = lar;
                lar = n;
            } else if (n > secLar && n!= lar) {
                secLar = n;
            }
        }
        System.out.println("\n13. Second Largest = " + secLar);

        // 14. Find Second Smallest Number
        int[] sSmallArr = {10, 20, 90, 80, 70};
        int sml = sSmallArr[0];
        int secSml = Integer.MAX_VALUE;
        for (int n : sSmallArr) {
            if (n < sml) {
                secSml = sml;
                sml = n;
            } else if (n < secSml && n!= sml) {
                secSml = n;
            }
        }
        System.out.println("14. Second Smallest = " + secSml);

        // 15. Frequency of an Element
        int[] freqArr = {5, 5, 10, 5, 20};
        int searchEle = 5;
        int count = 0;
        for (int n : freqArr) {
            if (n == searchEle) count++;
        }
        System.out.println("\n15. " + searchEle + " Occurs " + count + " Times");

        // 16. Print Duplicate Elements
        System.out.println("\n16. Duplicates:");
        int[] dupArr = {5, 10, 20, 5, 10, 30};
        for (int i = 0; i < dupArr.length; i++) {
            for (int j = i + 1; j < dupArr.length; j++) {
                if (dupArr[i] == dupArr[j]) {
                    System.out.println("Duplicate = " + dupArr[i]);
                }
            }
        }

        // 17. String Array
        System.out.println("\n17. String Array:");
        String[] names = {"Abinaya", "Keni", "Basil", "Credo"};
        for (String name : names) {
            System.out.println(name);
        }

        // 18. 2D Array
        System.out.println("\n18. 2D Array:");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // 19. Access 2D Array Element
        System.out.println("\n19. Access 2D [1][1] = " + matrix[1][1]);

        // 20. Change 2D Array Element
        matrix[1][1] = 100;
        System.out.println("20. After Change [1][1] = " + matrix[1][1]);
    }
}