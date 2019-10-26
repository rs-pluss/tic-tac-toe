package canvas

import canvas.TicTacEnum.TicTacEnum

/**
  * canvas of game
  */
class Canvas {
  /**
    * number of columns in canvas
    */
  val columns = 3

  /**
    * Number of rows in canvas
    */
  val rows = 3
  /**
    * Maximum size of desc
    */
  val maxTurns: Int = columns * rows
  /**
    * implementation of canvas - two dimensional array of [[TicTacEnum]]
    */

  private val table = Array.ofDim[TicTacEnum](columns, columns)

  /**
    * return status of cell [[TicTacEnum]]
    *
    * @param x column number
    * @param y raw number
    * @return status of cell
    */
  def getCellStatus(x: Int, y: Int): TicTacEnum = table(x)(y)

  /**
    * set cell status, and check lines near cell to
    *
    * @param x      column number
    * @param y      raw number
    * @param status new status of cell
    * @return true, if new cell make line of symbols, else false
    */
  def setCellAndCheckLines(x: Int, y: Int, status: TicTacEnum): Boolean = {
    table(x)(y) = status
    checkLinesNearCell(x, y)
  }

  /**
    * Check vertical, horizontal and diagonale witch cell, which refers x and y
    *
    * @param x column number
    * @param y raw number
    * @return true, if this cell in line of cells, else false
    */
  def checkLinesNearCell(x: Int, y: Int): Boolean = {
//    val status = getCellStatus(x, y)
//    var isLineFull = true
//    for(i <- 0 until columns) {
//        if (getCellStatus(i, y)!=status) {
//          isLineFull=false
//
//        }
//    }
    false
  }

  /**
    * Validate, that cell on current address is exist and empty
    *
    * @param x column number
    * @param y raw number
    * @return true if cell is accessible, else false
    */
  def validateAddress(x: Int, y: Int): Boolean = {
    if (x >= columns) {
      false
    }
    if (y >= rows) {
      false
    }
    if (getCellStatus(x, y) == null) {
      true
    } else {
      false
    }
  }

}
