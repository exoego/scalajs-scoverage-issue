package net.example

import scala.scalajs.js

object JSONHelper {
  implicit final class JSONConversionsToJson(val value: js.Any) extends AnyVal {
    @inline
    def toJson: String = js.JSON.stringify(value)
  }
}
