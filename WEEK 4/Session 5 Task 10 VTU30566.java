import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'matrixRotation' function below.
     *
     * The function accepts following parameters:
     *  1. 2D_INTEGER_ARRAY matrix
     *  2. INTEGER r
     */

    public static void matrixRotation(List<List<Integer>> matrix, int r) {

        int rows = matrix.size();
        int cols = matrix.get(0).size();

        int layers = Math.min(rows, cols) / 2;

        for (int layer = 0; layer < layers; layer++) {

            int top = layer;
            int left = layer;
            int bottom = rows - 1 - layer;
            int right = cols - 1 - layer;

            List<Integer> elements = new ArrayList<>();

            for (int j = left; j <= right; j++) {
                elements.add(matrix.get(top).get(j));
            }

            for (int i = top + 1; i <= bottom; i++) {
                elements.add(matrix.get(i).get(right));
            }

            for (int j = right - 1; j >= left; j--) {
                elements.add(matrix.get(bottom).get(j));
            }

            for (int i = bottom - 1; i > top; i--) {
                elements.add(matrix.get(i).get(left));
            }

            int rotation = r % elements.size();

            int index = rotation;

            for (int j = left; j <= right; j++) {
                matrix.get(top).set(j, elements.get(index));
                index = (index + 1) % elements.size();
            }

            for (int i = top + 1; i <= bottom; i++) {
                matrix.get(i).set(right, elements.get(index));
                index = (index + 1) % elements.size();
            }

            for (int j = right - 1; j >= left; j--) {
                matrix.get(bottom).set(j, elements.get(index));
                index = (index + 1) % elements.size();
            }

            for (int i = bottom - 1; i > top; i--) {
                matrix.get(i).set(left, elements.get(index));
                index = (index + 1) % elements.size();
            }
        }

        for (List<Integer> row : matrix) {
            for (int j = 0; j < row.size(); j++) {
                System.out.print(row.get(j));

                if (j < row.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput =
                bufferedReader.readLine()
                        .replaceAll("\\s+$", "")
                        .split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);
        int n = Integer.parseInt(firstMultipleInput[1]);
        int r = Integer.parseInt(firstMultipleInput[2]);

        List<List<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < m; i++) {

            String[] matrixRowTempItems =
                    bufferedReader.readLine()
                            .replaceAll("\\s+$", "")
                            .split(" ");

            List<Integer> matrixRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int matrixItem =
                        Integer.parseInt(matrixRowTempItems[j]);

                matrixRowItems.add(matrixItem);
            }

            matrix.add(matrixRowItems);
        }

        Result.matrixRotation(matrix, r);

        bufferedReader.close();
    }
}

Output:
4 4 1
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16

2 3 4 8
1 7 11 12
5 6 10 16
9 13 14 15
