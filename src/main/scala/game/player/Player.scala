package game.player

import canvas.Canvas
import canvas.TicTacEnum.TicTacEnum

abstract class Player(name: String, role: TicTacEnum) {
  abstract def chooseCell(canvas: Canvas): (Int, Int)
}