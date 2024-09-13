//> using dep "org.typelevel::spire:0.18.0"
//> using options -language:strictEquality -Yexplicit-nulls -Yno-flexible-types 
//> using options -Wsafe-init -explain -indent  -new-syntax -Xfatal-warnings -Wunused:all -Wvalue-discard -Wnonunit-statement
//> using options -Xcheck-macros -source:future -Ydebug-unpickling 

import spire.math.UInt
import spire.implicits.*

class TestingCode:
  def testFunction(value: UInt): Unit = ???
  val tc = TestingCode().testFunction(1)