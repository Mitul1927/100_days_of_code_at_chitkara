import java.util.ArrayList;
import java.util.List;

public class kids_with_the_greatest_candy {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandy=0;
        for(int candy:candies){
            if(candy>maxCandy){
                maxCandy=candy;
            }
        }
        List<Boolean> result= new ArrayList<>();
        for(int currentcandy:candies){
            if(currentcandy + extraCandies>=maxCandy){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}
