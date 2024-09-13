val msg = s"""{"event": "foo",${System.lineSeparator()}"ts": 123456${System.lineSeparator()}}""".stripMargin
@main def Test = msg match {
  case s"""{"event": "$event",
"ts": $ts
}""" =>
    assert(event == "foo")
    assert(ts.toInt == 123456)
}
