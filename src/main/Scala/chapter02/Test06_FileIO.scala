package chapter02

import java.io.{File, PrintWriter}
import scala.io.Source

/**
 * @author wentao
 * @date 2022-07-08 13:56
 */
object Test06_FileIO {
  def main(args: Array[String]): Unit = {
    //1.从文件中读取数据
    Source.fromFile("src/main/resources/text.txt").foreach(print)

    //2.将数据写入文件
    val writer = new PrintWriter(new File("src/main/resources/text1.txt"))
    writer.write("欢迎来到优霓空——云从重大联合实验室")
    writer.close()
  }
}
