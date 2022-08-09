class Solution {
    public String numberToWords(int num){
        if(num==0){
            return "Zero";
        }
        int x = num%1000;
        num/=1000;
        String res = "";
        if(x>0){
            res= res + toEng(x);
        }
        int y = num%1000;
        num/=1000;
        if(y>0){
            res = toEng(y)+ " Thousand "+res;
        }
        int z=num%1000;
        num/=1000;
        if(z>0){
            res = toEng(z)+ " Million "+res;
        }
        int m = num%1000;
        if(m>0){
            res = toEng(m)+ " Billion "+res;
        }
        return res.trim();

    }
    public String toEng(int num){
        String[] ones = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
        String[] eleven ={"","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String[] tens = {"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        String res="";
        if(num>0 && (num%100<=10 || num%100>=20) ){
            res=res+ones[num%10];
            num/=10;
        }
        else if(num>10 && num%100>=11 && num%100<20) {
            res=res+eleven[num%10];
            num/=100;
            if(num>0 && num%10>0){
            res=ones[num%10]+" Hundred"+" "+res;
                num/=10;
                }
        }

        if(num>0 && num%10>0){
            res=tens[num%10]+" "+res;
        }
            num/=10;

        if(num>0 && num%10>0){
            res=ones[num%10]+" Hundred"+" "+res;
        }

        return res.trim();
    }
}
