class Solution {
    boolean result=false;
    public boolean exist(char[][] board, String word) {
        boolean[][] used = new boolean[board.length][board[0].length];
        boolean temp = false;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    backtrack(board,used,0,word,i,j);
                }
            }
        }
        return result;
    }
    public void backtrack(char[][] board, boolean[][] used, int idx, String word,int i, int j){
        if(i<0 || j<0 || i>=board.length || j>=board[0].length )
            return ;
        if(used[i][j]==true || idx>word.length())
            return ;
        if(word.charAt(idx)!=board[i][j])
            return ;
        idx++;
        used[i][j]=true;

        if(idx==word.length()){
            result = true;
            return;
        }

        backtrack(board,used,idx,word,i+1,j);
        backtrack(board,used,idx,word,i-1,j);
        backtrack(board,used,idx,word,i,j+1);
        backtrack(board,used,idx,word,i,j-1);

        used[i][j]=false;
    }

}
