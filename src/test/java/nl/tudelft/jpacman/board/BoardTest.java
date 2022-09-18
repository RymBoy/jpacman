package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BoardTest {

    private Square[][] grid = new Square[1][1];

    @BeforeEach
    void setup(){
        grid[0][0] = new BasicSquare();
    }

    @Test
    void testSquareAt(){
        Board board = new Board(grid);
        //null square
        grid[0][0] = null;
        //Check does your test fail
        assertThatThrownBy(()-> board.squareAt(0,0))
            .isInstanceOf(AssertionError.class);

    }

}
