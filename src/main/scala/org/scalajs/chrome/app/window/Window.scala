package org.scalajs.chrome.app.window

import scala.scalajs.js

class WindowStatic extends js.Object {
  def create (url : String, params : CreateParams /* js.Any */) : js.Any = ???
  
  def current () : AppWindow = ???
  
  def get (id : String) : AppWindow = ???
}


