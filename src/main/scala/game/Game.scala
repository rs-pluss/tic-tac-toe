package game

import canvas.TicTacEnum.TicTacEnum
import canvas.{Canvas, TicTacEnum}
import game.player.Player
import game.player.control.HumanPlayer
import game.turn.Turn
import io.controller.PlayerController
import io.controller.cli.PlayerCliController

import scala.collection.mutable

class Game(players: Int) {
  private val canvas = new Canvas()
  private val turns: mutable.Set[Turn] = new mutable.LinkedHashSet[Turn]()
  private val (ticPlayer, tacPlayer) = initPlayers(players)
  val inputController: PlayerController = new PlayerCliController


  def initPlayers(players: Int): (Player, Player) = {
    players match {
      case 1 =>
        //todo test
        (new HumanPlayer("TicPlayer", TicTacEnum.TIC), new HumanPlayer("TacPlayer", TicTacEnum.TAC))
      case 2 =>
        //todo players names
        (new HumanPlayer("TicPlayer", TicTacEnum.TIC), new HumanPlayer("TacPlayer", TicTacEnum.TAC))
      case _ =>
        //todo exception
        throw new ExceptionInInitializerError("")

    }
  }

  def play(): TicTacEnum = {
    var isWin = false
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
