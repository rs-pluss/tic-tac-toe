package io.controller.cli

import io.controller.PlayerController

import scala.io.StdIn

/**
  * Class for handle input from player in game
  */
class PlayerCliController extends PlayerController {
  def getCellAddress: (Int, Int) = {
    val command = StdIn.readLine()
    try {
      parseCellAddress(command)
    } catch {
      case ex: NumberFormatException => {
        //todo text
        print("Cell address must be specified as <x y>")
        getCellAddress
      }
    }
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
      throw NumberFormatException
    }
  }


}
