class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int cols=mat[0].length;

        if((rows*cols)!=(r*c)) return mat;

        int[][] out=new int[r][c];
        int out_rows=0;
        int out_cols=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                out[out_rows][out_cols]=mat[i][j];
                out_cols++;

                if(out_cols==c){
                    out_cols=0;
                    out_rows++;
                }
            }
        }
        return out;
    }
}
