package game

import canvas.TicTacEnum.TicTacEnum
import canvas.{Canvas, TicTacEnum}
import game.player.Player
import game.player.control.HumanPlayer
import game.turn.Turn

import scala.collection.mutable

class Game(players: Int) {
  private val canvas = new Canvas()
  private val turns: mutable.HashSet[Turn] = new mutable.HashSet[Turn]()
  private val (ticPlayer, tacPlayer) = initPlayers(players)

  def initPlayers(players: Int): (Player, Player) = {
    players match {
      case 1 =>
      case 2 =>
        //todo players names
        (new HumanPlayer("", TicTacEnum.TIC), new HumanPlayer("", TicTacEnum.TIC))
      case _ =>
        //todo exception
        throw new ExceptionInInitializerError("")

    }
  }

  def play(): TicTacEnum = {
    var isWin = false
    val ticTurn = true
    while (!isWin || turns.size == canvas.maxTurns) {
      val currentPlayer = if (turns.isEmpty || turns.last.player.role == TicTacEnum.TAC) ticPlayer else tacPlayer
      val turn = new Turn(currentPlayer)
      val (x, y) = turn.makeTurn(canvas)
      isWin = canvas.setCellAndCheckLines(x, y, currentPlayer.role)
      turns += turn
    }
    if (isWin) turns.last.player.role else null
  }

}
