package game.player

import canvas.TicTacEnum.TicTacEnum

/**
  * Abstract class of player
  * @param name player name
  * @param role player role [[TicTacEnum]]
  */
abstract class Player(val name: String, val role: TicTacEnum) {
  /**
    * Choose cell for fill
    *
    * @return cell address for fill (x,y)
    */
  abstract def chooseCell(): (Int, Int)
}