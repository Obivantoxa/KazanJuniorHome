package lesson8;

public class Matrix implements IMatrix {

    private int[][] matrix;

    public Matrix(int row, int columns) {
        this.matrix = new int[row][columns];
    }

    public Matrix() {
        this.matrix = new int[DEFAULT_MATRIX_SIZE][DEFAULT_MATRIX_SIZE];
    }

    @Override
    public int getRows() {
        return this.matrix.length;
    }

    @Override
    public int getColumns() {
        return this.matrix[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex > matrix.length || colIndex > matrix[0].length) {
            return -1;
        }
        return this.matrix[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {

        if (rowIndex > matrix.length || colIndex > matrix[0].length) {

        } else {
            value = this.matrix[rowIndex ][colIndex];
        }
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        IMatrix mm = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {

                mm.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));

            }
        }
        return mm;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(double value) {
        return null;
    }

    @Override
    public IMatrix transpose() {
        return null;
    }

    @Override
    public void fillMatrix(double value) {

    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        return false;
    }

    @Override
    public boolean isIdentityMatrix() {
        return false;
    }

    @Override
    public boolean isSquareMatrix() {
        return false;
    }

    @Override
    public void printToConsole() {

    }
}
