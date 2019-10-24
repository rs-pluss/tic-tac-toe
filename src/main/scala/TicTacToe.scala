import canvas.TicTacEnum.TicTacEnum
import game.Game

import scala.io.StdIn

object TicTacToe extends App {
  println("Hello, start the game")
  val command = StdIn.readLine()
  var result:TicTacEnum = null
  if (command == "start") {
    val game = new Game(2)
    result = game.play()
  }
  print(result)
}