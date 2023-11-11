class Solution {
    public String intToRoman(int num) {
        StringBuilder ans=new StringBuilder();
        String ones[] ={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String tens[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String huns[] ={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String thows[]={"","M","MM","MMM"};
        ans.append(thows[num/1000]);
        ans.append(huns[(num%1000)/100]);
        ans.append(tens[(num%100)/10]);
        ans.append(ones[num%10]);
        String arr=ans.toString();
        return arr;
    }
}
