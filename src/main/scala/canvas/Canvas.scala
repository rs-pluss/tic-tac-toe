package canvas

import canvas.CellStatus.CellStatus

/**
  * canvas of game
  */
class Canvas {
  /**
    * canvas size
    */
  private val size = 3

  /**
    * implementation of canvas - two dimensional array of [[canvas.CellStatus]]
    */
  private val table: Array[Array[CellStatus]] = Array.fill(size, size)(CellStatus.EMPTY)

  /**
    * return status of cell [[canvas.CellStatus]]
    *
    * @param x column number
    * @param y raw number
    * @return status of cell
    */
  def getCellStatus(x: Int, y: Int): CellStatus = table(x)(y)

  /**
    * set cell status
    *
    * @param x      column number
    * @param y      raw number
    * @param status new status of cell
    */
  def setCellStatus(x: Int, y: Int, status: CellStatus): Unit = table(x)(y) = status

}
