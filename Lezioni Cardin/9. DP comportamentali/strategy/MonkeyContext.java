package strategy;

public class MonkeyContext implements Context{
    public final ChessBoard board;
    public final String weather;

    public MonkeyContext(ChessBoard board, String weather) {
        this.board = board;
        this.weather = weather;
    }
}