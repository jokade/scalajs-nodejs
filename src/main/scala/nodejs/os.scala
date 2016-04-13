//     Project: scalajs-nodejs
// Description: Façade traits for the Node.js Process API

// Copyright (c) 2016. Distributed under the MIT License (see included LICENSE file).
package nodejs

import nodejs.stream.Writable

import scala.scalajs.js

object NodeOS {
  private lazy val _p: NodeOS = require("os")

  @inline
  def apply() : NodeOS = _p
}

@js.native
trait NodeOS extends js.Object {
  def hostname():String = js.native
  def loadavg():js.Array[Double] = js.native
  def uptime():Long = js.native
  def freemem():Long = js.native
  def totalmem():Long = js.native
  // TODO : cpus: [Function: getCPUs],
  def `type`(): String = js.native
  def release():String = js.native
  // TODO : networkInterfaces: [Function: getInterfaceAddresses],
  def homedir(): String = js.native
  def arch: String = js.native
  def platform: String = js.native
  def tmpDir(): String = js.native
  def tmpDirCode_=(dir: String) : Unit = js.native
  def EOL:String = js.native
  def endianness:String = js.native
}
