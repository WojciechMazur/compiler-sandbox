val msg = s"""{"event": "foo",
             |, "ts": 123456
             |}""".stripMargin.replaceAll("\n", System.lineSeparator())
@main def Test = msg match {
  case s"""{"event": "$event",
, "ts": $ts
}""" =>
    assert(event == "foo")
    assert(ts.toInt == 123456)
}
