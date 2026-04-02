class Solution {
    public int romanToInt(String s) {
        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            int curr = value(s.charAt(i)); // current value of the roman numeral

            if (i + 1 < s.length() && curr < value(s.charAt(i + 1)))
                num -= curr; // less than the next value, subtract it from the total
            else
                num += curr; // otherwise, add it to the total
        }

        return num;
    }

    public int value(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        return 1000;
    }
}