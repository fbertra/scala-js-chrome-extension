package org.scalajs.chrome.app.runtime

import scala.scalajs.js

trait LaunchData extends js.Object {
  var id : String = _
  // to-do: items 
  var url : String = _
  var referrerUrl : String = _
  var isKioskSession : Boolean = _
}


