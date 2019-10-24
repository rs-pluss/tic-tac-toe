package io.controller.cli

import canvas.{Canvas, TicTacEnum}
import game.player.Player
import io.controller.PlayerController

import scala.io.StdIn

/**
  * Implements user input from player cli
  */
class PlayerCliController extends PlayerController {
  override def getCellAddress: (Int, Int) = {
    val command = StdIn.readLine()
    try {
      parseCellAddress(command)
    } catch {
      case ex: NumberFormatException => {
        //todo text
        println("Cell address must be specified as <x y>")
        getCellAddress
      }
    }
  }

  def showTable(canvas: Canvas): Unit = {
    for (i <- 0 until canvas.columns) {
      for (j <- 0 until canvas.rows) {
        canvas.getCellStatus(i, j) match {
          case TicTacEnum.TIC => print("x\t")
          case TicTacEnum.TAC => print("o\t")
          case null => print("_\t")
        }
      }
      println()
    }
  }

  def askTurn(player: Player): Unit = {
    println(s"${player.name}, please select cell")
  }


  /**
    * Parse String command and get cell address
    *
    * @param command input command
    * @return cell address (x,y)
    */
  def parseCellAddress(command: String): (Int, Int) = {
    val test = command.split(" ")
    if (test.length == 2) {
      (test(0).toInt, test(1).toInt)
    } else {
      throw new NumberFormatException
    }
  }


}
