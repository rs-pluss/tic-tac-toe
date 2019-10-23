package game

import canvas.TicTacEnum.TicTacEnum
import canvas.{Canvas, TicTacEnum}
import game.player.control.HumanPlayer
import game.player.{ControlTypeEnum, Player}

import scala.collection.immutable.HashSet

class Game(players: Int) {
  private val canvas = new Canvas()
  private val turns:Set[Turn] = new HashSet[Turn]()

  private val (ticPlayer, tacPlayer) = initPlayers(players)

def initPlayers(players:Int): (Player, Player)= {
  players match {
    case 1 =>
    case 2 =>
      //todo player names
      (new HumanPlayer("", TicTacEnum.TIC), new HumanPlayer("", TicTacEnum.TIC))
    case _ =>
      //todo exception
      throw new ExceptionInInitializerError("")

  }
}

  def play(): TicTacEnum = {
    val isInterrupt = false
    while (!isInterrupt) {

    }

  }

}
