package chapter05

/**
 * @author wentao
 * @date 2022-07-13 14:01
 */
object Test07_Practice_CollectionOperation {

  def main(args: Array[String]): Unit = {

    def arrayOperation(array: Array[Int],op: Int=>Int):Array[Int] = {
      for (elem<-array) yield op(elem)
    }
  }


}
