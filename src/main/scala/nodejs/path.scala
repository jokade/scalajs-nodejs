//     Project: scalajs-nodejs
// Description: Façade trait for the Node.js Path API

// Copyright (c) 2016. Distributed under the MIT License (see included LICENSE file).
package nodejs

import scala.scalajs.js

object NodePath {
  private lazy val _p: NodePath = require("path")

  @inline
  def apply() : NodePath = _p
}

@js.native
trait NodePath extends js.Object {
  def basename(path: String, ext: String = null): String = js.native
  def delimiter: String = js.native
  def dirname(path: String) : String = js.native
  def extname(path: String) : String = js.native
  def format(pathObject: js.Object) : String = js.native
  def isAbsolute(path: String) : Boolean = js.native
  def join(paths: String*) : String = js.native
  def normalize(path: String) : String = js.native
  def parse(path: String) : js.Dictionary[String] = js.native
  def relative(from: String, to: String) : String = js.native
  def sep: String = js.native
}
