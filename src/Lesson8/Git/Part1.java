package Lesson8.Git;

import java.util.Arrays;

public class Part1 {
    static int[] arrayLeft() {
        int[] arrayLeft = new int[24];
        for (int i = 0; i < arrayLeft.length; i++) {
            if (i <= 9)
                arrayLeft[i] = i;
            else if (i < 20)
                arrayLeft[i] = i - 9;
            else
                arrayLeft[i] = i - 18;
        }
        return arrayLeft;
    }

    static int[] arrayRight() {
        int[] arrayRight = new int[60];
        for (int i = 0; i < arrayRight.length; i++) {
            if (i < 10)
                arrayRight[i] = i;
            else if (i < 20)
                arrayRight[i] = i - 9;
            else if (i < 30)
                arrayRight[i] = i - 18;
            else if (i < 40)
                arrayRight[i] = i - 27;
            else if (i < 50)
                arrayRight[i] = i - 36;
            else
                arrayRight[i] = i - 45;
        }
        return arrayRight;
    }

    static int counter(int[] array1, int[] array2) {
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j])
                    count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayLeft()));
        System.out.println(Arrays.toString(arrayRight()));
        counter(arrayLeft(), arrayRight());
    }
}



