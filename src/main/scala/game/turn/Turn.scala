package game.turn

import canvas.Canvas
import game.player.Player

class Turn(val player: Player) {
  val x: Int = null
  val y: Int = null

  def makeTurn(canvas: Canvas): (Int, Int) = {
    var isCellAllowed: Boolean = false
    do {
      (x, y) = player.chooseCell()
      isCellAllowed = canvas.validateAddress(x, y)
    }
    while (!isCellAllowed)
  }
}
