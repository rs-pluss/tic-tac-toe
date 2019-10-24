package game.player.control

import canvas.TicTacEnum.TicTacEnum
import game.player.Player

import scala.io.StdIn

/**
  * Player with human control
  *
  * @param name player name
  * @param role player role [[TicTacEnum]]
  */
class HumanPlayer(name: String, role: TicTacEnum) extends Player(name: String, role: TicTacEnum) {
  def chooseCell(): (Int, Int) = {
    val command = StdIn.readLine()
    parseCommand(command)
  }

  /**
    * Parse String command and get cell address
    *
    * @param command input command
    * @return cell address (x,y)
    */
  def parseCommand(command: String): (Int, Int) = {

  }
}
