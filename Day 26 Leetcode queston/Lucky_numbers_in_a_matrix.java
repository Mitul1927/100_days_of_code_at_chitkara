import java.util.ArrayList;
import java.util.List;

public class Lucky_numbers_in_a_matrix {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int lucky =0;
        int n=matrix.length;
        int m=matrix[0].length;
        ArrayList<Integer> ls=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int num=Integer.MAX_VALUE;
            int index=-1;
            for(int j=0;j<m;j++){
                if(matrix[i][j]<num){
                    num=matrix[i][j];
                    index=j;
                }
            }
            boolean flag=true;
            for(int row=0;row<n;row++){
                if(matrix[row][index]>num){
                    flag=false;
                }
            }
            if(flag){
                ls.add(num);
            }
        }
        return ls;
    }
}
