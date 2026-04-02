class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s; // when nly one letter is present or the numrow is 1

        StringBuilder[] rows = new StringBuilder[numRows]; //new str array to store the char in zigzig
        for (int i = 0; i < numRows; i++) //initialise the string builder
            rows[i] = new StringBuilder();//storing char in zigzig

        int i = 0; // current row index
        boolean down = true; // indicate the dir of traversal

        for (char c : s.toCharArray()) { // traverse the string
            rows[i].append(c); // append the char to the current row

            if (i == 0) down = true;    //top row change dir to down
            else if (i == numRows - 1) down = false; // bottom row change dir to up

            i += down ? 1 : -1; // move to the next row based on the current direction
        }

        StringBuilder res = new StringBuilder(); // final result string builder
        for (StringBuilder row : rows) // concatenate all rows to get the final zigzag string
            res.append(row);// concatenate all rows to get the final zigzag string

        return res.toString(); // convert the string builder to string and return
    }
}