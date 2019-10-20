import canvas.{Canvas, CellStatus}
object TicTacToe extends App {
  val canvas = new Canvas()
  canvas.setCellStatus(1,1,CellStatus.TAC)
  val cell = canvas.getCellStatus(1,1)
  println(cell)
}