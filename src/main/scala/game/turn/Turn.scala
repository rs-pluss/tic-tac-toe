package game.turn

import canvas.Canvas
import game.player.Player
import io.controller.PlayerController
import io.controller.cli.PlayerCliController

//todo lateinit!!!!
class Turn(val player: Player) {
  var x: Int = -1
  var y: Int = -1
  val inputController: PlayerController = new PlayerCliController


  def makeTurn(canvas: Canvas): (Int, Int) = {
    inputController.showTable(canvas)
    inputController.askTurn(player)
    var isCellAllowed: Boolean = false
    do {
      val (rawX, rawY) = player.chooseCell()
      isCellAllowed = canvas.validateAddress(rawX, rawY)
      x = rawX
      y = rawY
    }
    while (!isCellAllowed)
    (x, y)
  }
}
