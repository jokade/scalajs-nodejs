//     Project: surf (https://github.com/jokade/surf)
// Description: Façade traits for the Node.js FileSystem API.

// Copyright (c) 2016. Distributed under the MIT License (see included LICENSE file).
package nodejs

import scala.scalajs.js

object FS {
  private lazy val _fs: FS = require("fs")

  @inline
  def apply() : FS = _fs
}

@js.native
trait FS extends js.Object {
  def readFileSync(file: String) : String = js.native
}
