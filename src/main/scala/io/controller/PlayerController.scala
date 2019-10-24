package io.controller

import canvas.Canvas
import game.player.Player

/**
  * Trait of user Input controller
  */
trait PlayerController {
  /**
    * get address of cell from user
    *
    * @return address of cell in format (x, y)
    */
  def getCellAddress: (Int, Int)

  def showTable(canvas:Canvas)

  def askTurn(player:Player)
}
