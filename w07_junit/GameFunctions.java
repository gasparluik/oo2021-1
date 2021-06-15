
interface GameFunctions{
    public void createGameboard();
    public void printGameBoard();
}

public class GameFunctions implements Functions{

    char [] [] gameBoard = { // kaks kasti, sest üks on row ja teine on column
        {' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '},
        {'-', '+', '- ', '+', '-'},
        {' ', '|', ' ', '|', ' '}
    };

    public void printGameboard(){
        for(char[] row : gameBoard){
            for(char c : row){
                System.out.print(c);
            }
            System.out.println();
        }

    }
    

}
