//     Project: scalajs-nodejs
// Description: Façade traits for the Node.js HTTP API.

// Copyright (c) 2016. Distributed under the MIT License (see included LICENSE file).
package nodejs

import nodejs.http.HttpServer

import scalajs.js

/**
 * @see [[https://nodejs.org/api/http.html]]
 */
object Http {
  private lazy val _http: Http = require("http")


  @inline
  def apply() : Http = _http

  @inline
  def createServer(requestListener: http.RequestCallback = null) : HttpServer = _http.createServer(requestListener)
}

@js.native
trait Http extends js.Object {
  /**
   */
  def createServer(requestListener: http.RequestCallback) : HttpServer = js.native
}


package object http {
  type RequestCallback = js.Function2[IncomingMessage,ServerResponse,Any]
}


package http {

@js.native
trait IncomingMessage extends stream.Readable {
  def headers: js.Dictionary[String] = js.native
  def method: String = js.native
  def url: String = js.native
}

@js.native
trait ServerResponse extends stream.Writable {
  var statusCode: Int = js.native
  def end() : Unit = js.native
  def end(data: String) : Unit = js.native
  def writeHead(statusCode: Int) : Unit = js.native
  def writeHead(statusCode: Int, statusMessage: String) : Unit = js.native
  def writeHead(statusCode: Int, headers: js.Dictionary[String]) : Unit = js.native
  def writeHead(statusCode: Int, statusMessage: String, headers: js.Dictionary[String]) : Unit = js.native
}


@js.native
trait HttpServer extends js.Object {
  def close(callback: ()=>Any = null) : Unit = js.native
  def listen(port: Int) : Unit = js.native
  def listen(port: Int, callback: RequestCallback) : Unit = js.native
}

}

