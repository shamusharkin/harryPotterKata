public class BowlingGame {
    int[] scores;
    int total = 0;
    int goes = 1;

    public BowlingGame(int[] scores) {
        this.scores = scores;
    }

    public int total() {

        for (int i = 0; i < scores.length; i++) {
            if (goes <= 10) {
                total += scores[i];
                if (scores[i] == 10) {
                    total += (scores[i + 1] + scores[i + 2]);
                    goes++;
                } else {
                    if (scores[i] + scores[i + 1] == 10) {
                        total += (scores[i + 1] + scores[i + 2]);
                        i++;
                        goes++;
                    } else {
                        total += scores[i + 1];
                        i++;
                        goes++;
                    }
                }
            }

        }
        return total;
    }
}
