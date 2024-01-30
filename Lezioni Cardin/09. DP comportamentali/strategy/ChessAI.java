package strategy;

public interface ChessAI<T extends Context> {
    Move getNexMove(T context);
}
