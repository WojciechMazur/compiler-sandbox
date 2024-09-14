//> using jvm 8
val msg = s"""{"event": "foo",${System.lineSeparator()}"ts": 123456${System.lineSeparator()}}""".stripMargin

import java.nio.file.*

@main def Test = 
  val f = Files.createTempFile("temp", ".json")
  Files.write(f, msg.getBytes())
  val usingIO = new String(Files.readAllBytes(f))
  val usingSource = scala.io.Source.fromFile(f.toFile()).mkString
  println(s"same: ${usingIO == usingSource}")
  List(usingIO, usingSource).zipWithIndex.foreach: (msg, idx) =>
    println(idx -> msg.size)
    msg match {
    case s"""{"event": "$event",
"ts": $ts
}""" =>
      assert(event == "foo")
      assert(ts.toInt == 123456)
  }

