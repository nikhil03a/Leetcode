class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(ans,0,0,n,new StringBuilder());
        return (ans);
    }
    public void backtrack(List<String> ans, int a, int b, int n, StringBuilder temp){
        if(temp.length()==(2*n)){
            ans.add(temp.toString());
            return;
        }
        if(a<n){
            temp.append('(');
            backtrack(ans,a+1,b,n,temp);
            temp.deleteCharAt(temp.length()-1);
        }
        if(a>b){
            temp.append(')');
            backtrack(ans,a,b+1,n,temp);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}
