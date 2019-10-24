package game.player.control

import canvas.TicTacEnum.TicTacEnum
import game.player.Player
import io.controller.PlayerController
import io.controller.cli.PlayerCliController

/**
  * Player with human control
  *
  * @param name player name
  * @param role player role [[TicTacEnum]]
  */
class HumanPlayer(name: String, role: TicTacEnum) extends Player(name: String, role: TicTacEnum) {
  val inputController :PlayerController = new PlayerCliController

  override def chooseCell(): (Int, Int) = {
    inputController.getCellAddress
  }

}
