
class SumOfOptionOfList {

  //additionList method contains all functionality to perform operation
  def additionOfList(orgList: List[Option[Int]], operation: String): Int = {

    //checking if list is empty then throw exception
    if (orgList.isEmpty) throw new IllegalArgumentException("Empty list : ")
    else {

      // Using for comprehension to make it a single list
      val result = for {
        Some(n) <- orgList
      } yield n

      //matching operation and then perform operation according to case
      operation match {
        case "Add" => result.sum
        case "Mul" => result.product
        case "Sub" => result.reduce(_ - _)
        case _ => throw new NoSuchMethodException("Exception Caught : ")
      }
    }
  }
}
