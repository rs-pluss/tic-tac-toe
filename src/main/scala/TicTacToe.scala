import game.Game

import scala.io.StdIn

object TicTacToe extends App {
  val command = StdIn.readLine()
  if (command == "start") {
    val game = new Game(2)
    val result = game.play()
  }
}