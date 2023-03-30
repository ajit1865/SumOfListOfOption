
object Driver extends App{

  //Passing parameter to method additionOfList
  val list = List(Some(1), Some(2), Some(3), Some(4))
  val obj = new SumOfOptionOfList
  println(obj.additionOfList(list, "Add"))
}
