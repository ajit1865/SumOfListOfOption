
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers.{an, be, thrownBy}

class SumOfOptionOfListTest extends AnyFlatSpec {
  val objOfSumOfOptionOfList = new SumOfOptionOfList

  //this test case check if operation is "Sub" then it provide subtraction of all list
  it should "provide Subtraction of list " in {
    assert(objOfSumOfOptionOfList.additionOfList(List(Some(1), Some(2), Some(3), Some(4)), "Sub") == -8)
  }

  //this test case check if operation is "Add" then it provide addition of all list
  it should "provide Addition of list " in {
    assert(objOfSumOfOptionOfList.additionOfList(List(Some(1), Some(2), Some(3), Some(4)), "Add") == 10)
  }

  //this test case check if operation is "Mul" then it provide Multiplication of all list
  it should "provide product of all elements in list" in {
    assert(objOfSumOfOptionOfList.additionOfList(List(Some(1), Some(2), Some(3), Some(4)), "Mul") == 24)
  }

  //this test case check if list is empty then it throw an Exception
  it should "throw an Exception if list is empty" in {
    an[IllegalArgumentException] should be thrownBy {
      objOfSumOfOptionOfList.additionOfList(List(), "Add")
    }
  }

  //this test case check if operation is not matched then throw Exception
  it should "throw an Exception if operation is not matched with option" in {
    an[NoSuchMethodException] should be thrownBy {
      objOfSumOfOptionOfList.additionOfList(List(Some(1), Some(2), Some(3), Some(4)), "Adda")
    }
  }
}
