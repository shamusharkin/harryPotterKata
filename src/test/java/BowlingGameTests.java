import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BowlingGameTests {

    @Test
    public void total_returnsTotalScoreOfZeroForGutterGame(){
        int[] scores = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        BowlingGame game = new BowlingGame(scores);
        assertEquals(0, game.total());

    }

    @Test
    public void total_returnsTotalScoreOf300ForPerfectGame() {
        int[] scores = {10,10,10,10,10,10,10,10,10,10,10,10};
        BowlingGame game = new BowlingGame(scores);
        assertEquals(300, game.total());
    }

    @Test
    public void total_returnsTotalScoreForGameWithNoSparesOrStrikes() {
        int[] scores = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        BowlingGame game = new BowlingGame(scores);
        assertEquals(20, game.total());
    }

    @Test
    public void total_returnsTotalScoreForGameWithSpares() {
        int[] scores = {9,1,9,1,9,1,9,1,9,1,9,1,9,1,9,1,9,1,9,1,1};
        BowlingGame game = new BowlingGame(scores);
        assertEquals(182, game.total());
    }

    @Test
    public void total_returnsTotalScoreOf280ForPerfectGame() {
        int[] scores = {10,10,10,10,10,10,10,10,10,10,0,0};
        BowlingGame game = new BowlingGame(scores);
        assertEquals(270, game.total());
    }

    @Test
    public void total_returnsTotalScoreOf150ForCrazyGame() {
        int[] scores = {5,4,10,9,0,3,7,10,9,1,4,0,7,3,5,5,10,9,1};
        BowlingGame game = new BowlingGame(scores);
        assertEquals(150, game.total());
    }
}
