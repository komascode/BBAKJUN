class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        boolean[][] danger = new boolean[board.length][board[0].length];
        int[] dr = {-1,-1,-1,0,0,0,1,1,1};
        int[] dy = {-1,0,1,-1,0,1,-1,0,1};
        
        for(int i = 0 ; i < board.length ; i ++){
            for(int j = 0 ; j < board[0].length ; j ++){
                if(board[i][j] == 1){
                    for(int k = 0 ; k < 9 ; k ++){
                        int nr = i + dr[k];
                        int ny = j + dy[k];
                        if(nr >= 0 && nr < board.length && ny >= 0 && ny < board[0].length){
                            danger[nr][ny] = true;
                        }
                    }
                }
            }
        }
        
        for(int i = 0 ; i < board.length ; i ++){
            for(int j = 0 ; j < board[0].length ; j ++){
                if(danger[i][j] == true){
                    answer ++;
                }
            }
        }
        answer = board.length * board.length - answer;
        return answer;
    }
}