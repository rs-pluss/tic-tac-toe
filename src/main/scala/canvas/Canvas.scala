package canvas

import canvas.TicTacEnum.TicTacEnum

/**
  * canvas of game
  */
class Canvas {
  /**
    * canvas size
    */
  private val size = 3

  /**
    * implementation of canvas - two dimensional array of [[TicTacEnum]]
    */

  private val table = Array.ofDim[TicTacEnum](size, size)

  /**
    * return status of cell [[TicTacEnum]]
    *
    * @param x column number
    * @param y raw number
    * @return status of cell
    */
  def getCellStatus(x: Int, y: Int): TicTacEnum = table(x)(y)

  /**
    * set cell status
    *
    * @param x      column number
    * @param y      raw number
    * @param status new status of cell
    */
  def setCellStatus(x: Int, y: Int, status: TicTacEnum): Unit = table(x)(y) = status

  def checkLinesNearCell(x: Int, y: Int): Boolean = {
    false
  }
}
