package strategy;

public class DeepLearningChessAI implements ChessAI<DeepLearningContext>{

    //Context
    private final int layers;
    private final int neuronsPerLayer;

    public DeepLearningChessAI(int layers, int neuronsPerLayer) {
        this.layers = layers;
        this.neuronsPerLayer = neuronsPerLayer;
    }

    @Override
    public Move getNexMove(DeepLearningContext context) {
        final ChessBoard board = context.getBoard();
        return new Move(0, 0);
    }
}
