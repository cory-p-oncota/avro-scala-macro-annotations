package test

import org.specs2.mutable.Specification

class AvroTypeProvider2ArityHeteroTest extends Specification {

  "A case class with an `Int` field coexisting with a non-`Int` field" should {
    "serialize and deserialize correctly" in {
      val record = AvroTypeProviderTest48(1, "bonjour")
      TestUtil.verifyRead(record)
    }
  }

  "A case class with an `String` field coexisting with a non-`Int` field" should {
    "serialize and deserialize correctly" in {
      val record = AvroTypeProviderTest49("bueno", 2)
      TestUtil.verifyRead(record)
    }
  }

  "A case class with an `Option[String]` field coexisting with an `Option[Int]` field" should {
    "serialize and deserialize correctly" in {
      val record = AvroTypeProviderTest50(Some("tropics"), Some(3))
      TestUtil.verifyRead(record)
    }
  }

  "A case class with an `Option[Int]` field coexisting with an `Option[String]` field" should {
    "serialize and deserialize correctly" in {
      val record = AvroTypeProviderTest51(Some(4), Some("level"))
      TestUtil.verifyRead(record)
    }
  }

  "A case class with a `List[String]` field coexisting with a `List[Int]` field" should {
    "serialize and deserialize correctly" in {
      val record = AvroTypeProviderTest52(List("am.pm"), List(5,6))
      TestUtil.verifyRead(record)
    }
  }

  "A case class with an `List[Int]` field coexisting with a `List[String]` field" should {
    "serialize and deserialize correctly" in {
      val record = AvroTypeProviderTest53(List(7, 8), List("bon.sois"))
      TestUtil.verifyRead(record)
    }
  }

  "A case class with an `Option[List[Option[String]]]` field coexisting with a `Option[List[Option[Int]]]` field" should {
    "serialize and deserialize correctly" in {
      val record = AvroTypeProviderTest54(Some(List(Some("bronco"), None)), Some(List(Some(9), None)))
      TestUtil.verifyRead(record)
    }
  }

  "A case class with an `Option[List[Option[Int]]]` field coexisting with a `Option[List[Option[String]]]` field" should {
    "serialize and deserialize correctly" in {
      val record = AvroTypeProviderTest55(Some(List(Some(10), None)), Some(List(Some("bronca"), None)))
      TestUtil.verifyRead(record)
    }
  }

  "A case class with an `List[Option[List[Option[String]]]]` field coexisting with a `List[Option[List[Option[Int]]]]` field" should {
    "serialize and deserialize correctly" in {
      val record = AvroTypeProviderTest56(List(Some(List(Some("tibetan"), None)), None), List(Some(List(Some(11), None)), None))
      TestUtil.verifyRead(record)
    }
  }

  "A case class with an `Int` field coexisting with a non-`Int` field" should {
    "serialize and deserialize correctly" in {
      val record = AvroTypeProviderTest57(List(Some(List(Some(12), None)), None), List(Some(List(Some("fire"), None)), None))
      TestUtil.verifyRead(record)
    }
  }
}
