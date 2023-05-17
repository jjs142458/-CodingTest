public class Board {

    private Player player;
    private Player computer;

    public Board(Player player) {
        this.player =  player;
        computer = new Player("컴퓨터");
    }
    public void moveBoard() {
        player.move();
        computer.move();
    }
    public void prtBoard() {
        int pPos = player.getPos();
        int cPos = computer.getPos();

        System.out.printf("%-10s",player.getName());
        for (int i = 0; i <= 30; i++) {
            if (i == pPos) System.out.print("P");
            else System.out.print("●");
        }

        if (pPos >= 30) System.out.print("P");
        else System.out.print("Goal!");

        System.out.println();

        System.out.printf("%-10s",computer.getName());
        for (int i = 0; i <= 30; i++) {
            if (i == cPos) System.out.print("C");
            else System.out.print("●");
        }

        if (cPos >= 30) System.out.print("C");
        else System.out.print("Goal!");

        System.out.println();

    }

    public boolean evaluate() {
        if (player.getPos() >= 30) {
            prtBoard();
            System.err.println(player.getName() + "의 승리");
            return false;
        }
        else if (computer.getPos() >= 30) {
            prtBoard();
            System.err.println(computer.getName() + "의 승리");
            return false;
        }

        return true;
    }

}
