package strategy;

import java.util.Random;

public class MonkeyChessAI implements ChessAI<MonkeyContext>{

    //Context
    private final Random randomGenerator;

    public MonkeyChessAI(Random randomGenerator) {
        this.randomGenerator = randomGenerator;
    }

    @Override
    public Move getNexMove(MonkeyContext context) {
        return new Move(0, 0);
    }
}
