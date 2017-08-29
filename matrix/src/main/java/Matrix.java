import java.util.Arrays;
import java.util.List;
                                        
public class Matrix {

    private int matrix[][];

    Matrix(String matrixAsString) {
        List<String> matrixAsList = Arrays.asList(matrixAsString.split("\\n"));
        int columnCount = 0;
        int rowCount = 0;

        matrix = new int[matrixAsList.size()][matrixAsList.get(0).replaceAll("\\s","").length()];

        for(String row : matrixAsList) {
            String[] rows = row.split(" ");
            for(String rowElement : rows) {
                matrix[rowCount][columnCount] = Integer.parseInt(rowElement);
                columnCount++;
            }
            columnCount = 0;
            rowCount++;
        }
    }
    
    public int getRowsCount() {
        return matrix.length;
    }

    public int getColumnsCount() {
        return matrix[0].length;
    }

    public int[] getRow(int rowId) {
        return matrix[rowId];
    }

    public int[] getColumn(int columnId) {
        int[] columns = new int[matrix.length];
        for(int z = 0; z < matrix.length; z++) {
            columns[z] = matrix[z][columnId];
        }
        return columns;
    }
}
