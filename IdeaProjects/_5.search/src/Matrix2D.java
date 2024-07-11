public class Matrix2D {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        if (rows == 0) return false;
        int cols = matrix[0].length;
        if (cols == 0) return false;

        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        if (cols == 1) {
            int rowStart = 0, rowEnd = rows - 1;
            while (rowStart <= rowEnd) {
                int mid = rowStart + (rowEnd - rowStart) / 2;
                if (matrix[mid][0] == target) {
                    return true;
                }
                if (matrix[mid][0] < target) {
                    rowStart = mid + 1;
                } else {
                    rowEnd = mid - 1;
                }
            }
            return false;
        }

        int rowStart = 0;
        int rowEnd = rows - 1;
        int colMid = cols / 2;

        while (rowStart < rowEnd - 1) {
            int mid = rowStart + (rowEnd - rowStart) / 2;
            if (matrix[mid][colMid] == target) {
                return true;
            }
            if (matrix[mid][colMid] < target) {
                rowStart = mid;
            } else {
                rowEnd = mid;
            }
        }

        if (matrix[rowStart][colMid] == target || matrix[rowStart + 1][colMid] == target) {
            return true;
        }

        if (colMid > 0 && matrix[rowStart][colMid - 1] >= target) {
            if (binarySearch(matrix, rowStart, 0, colMid - 1, target)) {
                return true;
            }
        }

        if (colMid < cols - 1 && matrix[rowStart][colMid + 1] <= target && matrix[rowStart][cols - 1] >= target) {
            if (binarySearch(matrix, rowStart, colMid + 1, cols - 1, target)) {
                return true;
            }
        }

        if (colMid > 0 && matrix[rowStart + 1][colMid - 1] >= target) {
            if (binarySearch(matrix, rowStart + 1, 0, colMid - 1, target)) {
                return true;
            }
        }

        if (colMid < cols - 1 && matrix[rowStart + 1][colMid + 1] <= target && matrix[rowStart + 1][cols - 1] >= target) {
            return binarySearch(matrix, rowStart + 1, colMid + 1, cols - 1, target);
        }

        return false;
    }

    private boolean binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target) {
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;
            if (matrix[row][mid] == target) {
                return true;
            }
            if (matrix[row][mid] < target) {
                colStart = mid + 1;
            } else {
                colEnd = mid - 1;
            }
        }
        return false;
    }

}
