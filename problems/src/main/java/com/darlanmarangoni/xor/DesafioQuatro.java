package com.darlanmarangoni.xor;

public class DesafioQuatro {

    public static int[] twoUnique(int[] arr) {
        int xor = 0;
        for (int num : arr) {
            xor ^= num;
        }

        int bit = xor & (-xor);

        int a = 0, b = 0;
        for (int num : arr) {
            if ((num & bit) != 0)
                a ^= num;
            else
                b ^= num;
        }

        return new int[]{a, b};
    }
}
