package game.player.control

import canvas.Canvas
import canvas.TicTacEnum.TicTacEnum
import game.player.Player

import scala.io.StdIn

class HumanPlayer(name:String, role:TicTacEnum) extends Player(name:String, role:TicTacEnum){
  def chooseCell(canvas: Canvas): (Int, Int) = {
    val command = StdIn.readLine()

  }
}
