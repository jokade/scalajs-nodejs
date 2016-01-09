//     Project: scalajs-nodejs
// Description: Façade traits for the Node.js Stream API.

// Copyright (c) 2016. Distributed under the MIT License (see included LICENSE file).
package nodejs

import scalajs.js

package stream {
  @js.native
  trait Readable extends js.Object {

  }

  @js.native
  trait Writable extends js.Object {
    def write(chunk: String) : Unit = js.native
  }
}
