public class SetMatrixZeros {

  // Brute Force

  public void setZeroes(int[][] matrix) {
    int l = matrix.length;
    int r = matrix[0].length;
    int[][] temp = new int[l][r];
    for (int i = 0; i < l; i++) {
      for (int j = 0; j < r; j++) {
        temp[i][j] = matrix[i][j];
      }
    }
    for (int i = 0; i < l; i++) {
      for (int j = 0; j < r; j++) {
        if (matrix[i][j] == 0) {
          for (int x = 0; x < r; x++) {
            temp[i][x] = 0;
          }
          for (int x = 0; x < l; x++) {
            temp[x][j] = 0;
          }
        }
      }
    }
    for (int i = 0; i < l; i++) {
      for (int j = 0; j < r; j++) {
        matrix[i][j] = temp[i][j];
      }
    }
  }

  // Better

  public void setZeroes2(int[][] matrix) {
    int l = matrix.length;
    int r = matrix[0].length;
    int rowMatrix[] = new int[r];
    int colMatrix[] = new int[l];
    for (int i = 0; i < l; i++) {
      for (int j = 0; j < r; j++) {
        if (matrix[i][j] == 0) {
          colMatrix[i] = 1;
          rowMatrix[j] = 1;
        }
      }
    }
    for (int i = 0; i < l; i++) {
      for (int j = 0; j < r; j++) {
        if (colMatrix[i] == 1 || rowMatrix[j] == 1) {
          matrix[i][j] = 0;
        }
      }
    }
  }
}
