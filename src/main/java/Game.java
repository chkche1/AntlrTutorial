import java.util.Map;

public class Game {

    private final String name;
    private final Map<String, Integer> points;
    private final String[][] grid;
    private int score = 0;

    public Game(String name, Map<String, Integer> points, String[][] grid) {
        this.name = name;
        this.points = points;
        this.grid = grid;
    }

}
