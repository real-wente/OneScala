package chapter04

import scala.language.postfixOps
import scala.math.BigDecimal.double2bigDecimal

/**
 * @author wentao
 * @date 2022-07-14 11:19
 */
object Test02_ForLoop {
  def main(args: Array[String]): Unit = {

    /**
     * to 是方法的调用
     * for ( i <- 1.to(10) )
     * for (i: Int <- 1.to(10)) 隐式定义
     * for (i <- Range(1, 10))
     * 三者等价 连续按两次shift进行搜索
     */
    for (i <- 0 to 2) {
      println(i + ".黄四郎死啦死啦！！！")
    }

    /**
     * until前闭合后开的结构
     * 1 until 3 实际范围是1 2
     */
    for (i <- 1 until 3){
      println(i + ".鹅城太平啦")
    }
    println("=========麻子的分割线=========")

    //集合遍历
//    for (i <- Array(12,34,53)){
//      println(i)
//    }
//    for (i <- List(12,34,53)){
//      println(i)
//    }
//    for (i <- Set(12,34,53)){
//      println(i)
//    }
    println("=========麻子的分割线=========")

    /**
     * 循环守卫，即循环保护式（也称条件判断式，守卫）。保护式为 true 则进入循环
体内部，为 false 则跳过，类似于 continue。
       for (i <- 1 to 10){
    if (i != 5){
      println(i)
      }
    }
     */
//    for (i <- 1 to 10 if i != 5 ){
//      println(i)
//    }

    /**
     * 循环步长
     * 所谓步长就是间隔输出
     * 从i开始到j，步长是k
     * 输出 i i+k i+k+k ...
     * k可以是正负数，但不能是0
     * by是range的方法
     */

    /**
     * 真正的完整写法
     * for (i <- (1 to 3).by(2)){
      println("i=" +i)
    }
     */
    for (i <- 1 to 3 by 2){
      println("i=" +i)
    }

    for (i <- 30 to 13 by -3) {
      println(i)
    }
    /**
     * 如果k是负数，起点一定要大于终点
     *  for (i <- 13 to 30 by -3){
      println(i)
    }
     reverse 其功能是逆序
     */

    for (i <- 1 to 3  reverse) {
      println(i)
    }

    /**
     * k也可以是小数，但是起点和终点必须也是小数
     */
    for (data <- 1.0 to 10.0 by 0.3){
      println(data)
    }
    println("=========wente的结束符=========")



























  }

}
