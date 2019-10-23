package game.player.control

import canvas.Canvas
import canvas.TicTacEnum.TicTacEnum
import game.player.Player

class AiPlayer(name:String, role:TicTacEnum)  extends Player(name:String, role:TicTacEnum){
  def chooseCell(canvas: Canvas): (Int, Int) = {
    (1,1)
  }
}
