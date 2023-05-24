public class Player {
    private final String name;
    private int pos = 0;

    Player(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getPos() {
        return pos;
    }

    public void move() {
        pos += (int)((Math.random()*10000)%6);
    }
}
