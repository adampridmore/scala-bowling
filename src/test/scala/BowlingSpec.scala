import org.scalatest.{Matchers, WordSpec}


class BowlingSpec extends WordSpec with Matchers {
  "A game of bowling" should {
    "score 0 if all gutter balls (0)" in {
        Bowling.score(Seq.fill(0)(10)) shouldBe 0
    }

    "score 1 if a single 1 pin is knocked down" in {
      Bowling.score(Seq(1) ++ Seq.fill(0)(19)) shouldBe 1
    }

    "score 20 if a single 1 pin is knocked down for all throws" in {
      Bowling.score(Seq.fill(1)(20)) shouldBe 20
    }

    "A single spare" in {
      Bowling.score(Seq(5,5,2,2) ++ Seq.fill(0)(16)) shouldBe 10 + 2 + 2 + 2
    }

    "A single strike" in {
      Bowling.score(Seq(10,8,4,2) ++ Seq.fill(0)(16)) shouldBe 10 + 12 + 8 + 4 + 2
    }

//    "A perfect game of 12 strikes" in {
//      Bowling.score(Seq.fill(10)(12)) shouldBe 300
//    }
  }
}
