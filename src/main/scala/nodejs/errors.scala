//     Project: scalajs-nodejs
// Description: Façade traits for Node.js errors

// Copyright (c) 2016. Distributed under the MIT License (see included LICENSE file).
package nodejs

import scala.scalajs.js

@js.native
trait NodeError extends js.Object  {
  def message: String = js.native
  def stack: String = js.native
}
