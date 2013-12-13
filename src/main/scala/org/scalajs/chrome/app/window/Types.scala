package org.scalajs.chrome.app.window

import scala.scalajs.js

import org.scalajs.chrome.Event



trait CreateParams extends js.Object {
  var id : js.String = ???
  var minWidth : js.Number = ???  // Minimum width of the window.
  var minHeight : js.Number = ???  // Minimum height of the window.
  var maxWidth : js.Number = ???   // Maximum width of the window.
  var maxHeight : js.Number = ???  // Maximum height of the window.
  var frame : js.String = ??? // Frame type: none or chrome (defaults to chrome). For none, the -webkit-app-region CSS property can be used to apply draggability to the app's window. -webkit-app-region: drag can be used to mark regions draggable. no-drag can be used to disable this style on nested elements.
  // to-do
  var bounds : Bounds = ??? // Size and position of the content in the window (excluding the titlebar). If an id is also specified and a window with a matching id has been shown before, the remembered bounds of the window will be used instead.
  var transparentBackground : js.Boolean = ??? // Enable window background transparency. Only supported in ash. Requires experimental API permission.
  var state : js.String = ??? // enum of "normal", "fullscreen", "maximized", or "minimized" : The initial state of the window, allowing it to be created already fullscreen, maximized, or minimized. Defaults to 'normal'.
  var hidden : js.Boolean = ??? // If true, the window will be created in a hidden state. Call show() on the window to show it once it has been created. Defaults to false.
  var resizable: js.Boolean = ???  // If true, the window will be resizable by the user. Defaults to true.
  var alwaysOnTop : js.Boolean  = ???// If true, the window will stay above most other windows. If there are multiple windows of this kind, the currently focused window will be in the foreground. Defaults to false. Call setAlwaysOnTop() on the window to change this property after creation. Currently only available on Dev channel.)
}


// to-do: ver si se debe usar tipo Int en lugar de js.Number
trait Bounds extends js.Object {
  var left : js.Number = _
  var top : js.Number = _
  var width : js.Number = _
  var height : js.Number = _
}

//
trait AppWindow extends js.Object {
  // events
  def onBoundsChanged : Event = ???
  def onClosed : Event = ??? 
  def onFullscreened : Event = ???
  def onMaximized : Event = ???
  def onMinimized : Event = ???
  def onRestored : Event = ???
    
  // methods
  
  // Focus the window
  def focus () : js.Undefined = ???

  // Fullscreens the window.  
  def fullscreen () : js.Undefined = ???

  // Is the window fullscreen?
  def isFullscreen () : js.Boolean = ???

  // Minimize the window.  
  def minimize () : js.Undefined = ???

  // Is the window minimized?
  // Returns boolean
  def isMinimized () : js.Boolean = ???

  // Maximize the window.
  def maximize () : js.Undefined = ???

  // Is the window maximized?
  // Returns boolean
  def isMaximized () : js.Boolean = ???

  // Restore the window, exiting a maximized, minimized, or fullscreen state.
  def restore () : js.Undefined = ???

  // Move the window to the position (|left|, |top|).
  // Parameters
  // left ( integer )
  // top ( integer )
  def moveTo (left : js.Number, top : js.Number) : js.Undefined = ???


  // Resize the window to |width|x|height| pixels in size.
  // Parameters
  // width ( integer )
  // height ( integer )

  def resizeTo (width : js.Number, height : js.Number) : js.Undefined = ???

  // Draw attention to the window.
  def drawAttention () : js.Undefined = ???

  // Clear attention to the window.
  def clearAttention () : js.Undefined = ???

  // Close the window.
  def close () : js.Undefined = ???

  // Show the window. Does nothing if the window is already visible.
  def show () : js.Undefined = ???

  // Hide the window. Does nothing if the window is already hidden.
  def hide () : js.Undefined = ???

  // Get the window's bounds as a Bounds object.
  // Returns Bounds
  def getBounds () : Bounds = ???

  // Set the window's bounds.
  // Parameters
  // bounds ( Bounds )
  def setBounds (bound : Bounds) : js.Undefined = ???

  // Get the current minimum width of the window. Returns |undefined| if there is no minimum.
  // Returns integer
  def getMinWidth () : js.Number = ???

  // Get the current minimum height of the window. Returns |undefined| if there is no minimum.
  // Returns integer
  def getMinHeight () : js.Number = ???
  
  // Get the current maximum width of the window. Returns |undefined| if there is no maximum.
  // Returns integer
  def getMaxWidth () : js.Number = ???
  
  // Get the current maximum height of the window. Returns |undefined| if there is no maximum.
  // Returns integer
  def getMaxHeight () : js.Number = ???
  
  // Set the current minimum width of the window. Set to |null| to remove the constraint.
  // Parameters
  // minWidth ( optional integer )
  def setMinWidth (minWidth : js.Number) : js.Undefined = ???
  
  // Set the current minimum height of the window. Set to |null| to remove the constraint.
  // Parameters
  // minHeight ( optional integer )
  def setMinHeight (minHeight : js.Number) : js.Undefined = ???
  
  // Set the current maximum width of the window. Set to |null| to remove the constraint.
  // Parameters
  // maxWidth ( optional integer )
  def setMaxWidth (maxWidth : js.Number) : js.Undefined = ???
  
  // Set the current maximum height of the window. Set to |null| to remove the constraint.
  // Parameters
  // maxHeight ( optional integer )
  def setMaxHeight (maxHeight : js.Number) : js.Undefined = ???
  
  // Is the window always on top?
  // Returns boolean
  def isAlwaysOnTop () : js.Boolean = ???
  
  // Set whether the window should stay above most other windows. Currently only available on Dev channel.
  // Parameters
  // alwaysOnTop ( boolean )
  def setAlwaysOnTop (alwaysOnTop : js.Boolean) : js.Undefined = ???
    
  // The JavaScript 'window' object for the created child.
  // id ( string )
  // The id the window was created with.  
  def contentWindow (id : js.String) : js.Any = ???
  
  // The id the window was created with.
  var id : js.String = ???
}


