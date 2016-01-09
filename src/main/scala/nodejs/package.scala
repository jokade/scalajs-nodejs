//     Project: scalajs-nodejs
// Description: Provides common utility functions.

// Copyright (c) 2016. Distributed under the MIT License (see included LICENSE file).

package object nodejs {
  import scalajs.js
  import js.Dynamic.{global=>g}

  @inline
  def require[T](module: String) : T = g.require(module).asInstanceOf[T]
}
