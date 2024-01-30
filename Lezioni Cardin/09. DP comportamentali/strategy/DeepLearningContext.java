package strategy;

public class DeepLearningContext implements Context{
    public final ChessBoard board;

    public DeepLearningContext(ChessBoard board) {
        this.board = board;
    }
}
