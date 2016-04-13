//     Project: scalajs-nodejs
// Description: Façade traits for the Node.js Process API

// Copyright (c) 2016. Distributed under the MIT License (see included LICENSE file).
package nodejs

import nodejs.stream.Writable

import scala.scalajs.js

object NodeProcess {
  private lazy val _p: NodeProcess = require("process")

  @inline
  def apply() : NodeProcess = _p
}

@js.native
trait NodeProcess extends js.Object {
  def abort() : Unit = js.native
  def arch: String = js.native
  def argv: js.Array[String] = js.native
  def chdir(directory: String) : Unit = js.native
  def config: js.Dynamic = js.native
  def connected: Boolean = js.native
  def cwd() : String = js.native
  def disconnect(): Unit = js.native
  def env: js.Dictionary[String] = js.native
  def execArgv: js.Array[String] = js.native
  def execPath: String = js.native
  def exit(code: Int = 0): Unit = js.native
  def exitCode_=(code: Int) : Unit = js.native
  def features: js.Dictionary[Boolean] = js.native
  def getegid(): Int = js.native
  def geteuid(): Int = js.native
  def getgid(): Int = js.native
  def getgroups(): js.Array[Int] = js.native
  def getuid() : Int = js.native
  def hrtime(): js.Array[Double]
  def kill(pid: Int, signal: String = null): Unit = js.native
  def mainModule: js.Dynamic = js.native
  def memoryUsage(): js.Dynamic = js.native
  def pid: Int = js.native
  def platform: String = js.native
  def release: js.Dictionary[String] = js.native
  def stderr: stream.Writable = js.native
  def stdin: stream.Readable = js.native
  def stdout: stream.Writable = js.native
  def uptime(): Double = js.native
  def version: String = js.native
  def versions: js.Dictionary[String] = js.native
}
