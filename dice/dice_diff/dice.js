const readline = require("readline");

class Player {
  constructor(name) {
    this.name = name;
    this.pos = 0;
  }

  getName() {
    return this.name;
  }

  getPos() {
    return this.pos;
  }

  move() {
    this.pos += Math.floor(Math.random() * 6);
  }
}

class Board {
  constructor(player) {
    this.player = player;
    this.computer = new Player("컴퓨터");
  }

  moveBoard() {
    this.player.move();
    this.computer.move();
  }

  prtBoard() {
    const pPos = this.player.getPos();
    const cPos = this.computer.getPos();

    process.stdout.write(`${this.player.getName().padEnd(10)}`);
    for (let i = 0; i <= 30; i++) {
      if (i === pPos) {
        process.stdout.write("P");
      } else {
        process.stdout.write("●");
      }
    }

    if (pPos >= 30) {
      process.stdout.write("P");
    } else {
      process.stdout.write("Goal!");
    }

    console.log();

    process.stdout.write(`${this.computer.getName().padEnd(10)}`);
    for (let i = 0; i <= 30; i++) {
      if (i === cPos) {
        process.stdout.write("C");
      } else {
        process.stdout.write("●");
      }
    }

    if (cPos >= 30) {
      process.stdout.write("C");
    } else {
      process.stdout.write("Goal!");
    }

    console.log();
  }

  evaluate() {
    if (this.player.getPos() >= 30) {
      this.prtBoard();
      console.error(`${this.player.getName()}의 승리`);
      return false;
    } else if (this.computer.getPos() >= 30) {
      this.prtBoard();
      console.error(`${this.computer.getName()}의 승리`);
      return false;
    }

    return true;
  }
}

// Example usage:
const player = new Player("정재성");
const board = new Board(player);

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

function gameLoop() {
  board.prtBoard();
  rl.question("\nEnter!\n", () => {
    board.moveBoard();
    if (board.evaluate()) {
      gameLoop();
    } else {
      rl.close();
    }
  });
}

gameLoop();
