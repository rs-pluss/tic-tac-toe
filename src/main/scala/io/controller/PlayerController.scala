package io.controller

/**
  * Trait of user Input controller
  */
trait PlayerController {
  /**
    * get address of cell from user
    *
    * @return address of cell in format (x, y)
    */
  def getCellAddress: (Int, Int)
}
