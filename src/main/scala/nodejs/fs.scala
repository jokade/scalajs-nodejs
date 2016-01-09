//     Project: surf (https://github.com/jokade/surf)
// Description: Façade traits for the Node.js FileSystem API.

// Copyright (c) 2016. Distributed under the MIT License (see included LICENSE file).
package nodejs

import nodejs.FS.BufferCallback

import scala.scalajs.js

object FS {
  private lazy val _fs: FS = require("fs")

  @inline
  def apply() : FS = _fs

  @js.native
  trait Stats extends js.Object {
    def isFile() : Boolean = js.native
    def isDirectory() : Boolean = js.native
    def isBlockDevice() : Boolean = js.native
    def isCharacterDevice() : Boolean = js.native
    def isSymbolicLink() : Boolean = js.native
    def isFIFO() : Boolean = js.native
    def isSocket() : Boolean = js.native
  }

  type BufferCallback = js.Function2[NodeError,js.UndefOr[NodeBuffer],Unit]
}

@js.native
trait FS extends js.Object {
  def readFile(file: String, callback: BufferCallback) : Unit = js.native
  def stat(path: String, callback: (NodeError,FS.Stats)=>Unit) : Unit = js.native
}

@js.native
trait NodeBuffer extends js.Object
