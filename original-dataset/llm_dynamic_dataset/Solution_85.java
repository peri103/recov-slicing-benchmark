class PlaceWordInCrossword {
    boolean go(char[][] board, char[] w)
    {
        int n = board.length;
        int m = board[0].length;
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;){
                int k = j;
                while(k < m && board[i][k] != '#')k++;
                
                if(w.length == k-j){
                    {
                        boolean valid = true;
                        for(int t = 0;t < w.length;t++){
                            if(board[i][j+t] != ' ' && board[i][j+t] != w[t]){
                                valid = false;
                            }
                        }
                        if(valid)return true;
                    }
                    {
                        boolean valid = true;
                        for(int t = 0;t < w.length;t++){
                            if(board[i][j+t] != ' ' && board[i][j+t] != w[w.length-1-t]){
                                valid = false;
                            }
                        }
                        if(valid)return true;
                    }
                }
                
                if(k == j)k++;
                j = k;
            }
        }
        return false;
    }
    
    public boolean placeWordInCrossword(char[][] board, String word) {
        char[] w = word.toCharArray();
        if(go(board, w))return true;
        
        int n = board.length;
        int m = board[0].length;
        char[][] nb = new char[m][n];
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                nb[i][j] = board[j][i];
            }
        }
        return go(nb, w);
    }
     public static void main(String[] args) {
        PlaceWordInCrossword placeWordInCrossword = new PlaceWordInCrossword();
        
        char[][] board = {
            {'#', ' ', '#'},
            {' ', ' ', '#'},
            {'#', 'c', ' '}
        };
        String word = "abc";
        
        boolean result = placeWordInCrossword.placeWordInCrossword(board, word);
        
        System.out.println("Can place the word in the crossword: " + result);
    }

}