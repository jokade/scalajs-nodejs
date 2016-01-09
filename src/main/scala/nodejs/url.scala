//     Project: scalajs-nodejs
// Description: Façade traits for the Node.js URL API.

// Copyright (c) 2016. Distributed under the MIT License (see included LICENSE file).
package nodejs

import scalajs.js

object URL {
  type ParsedURL = js.Dictionary[String]

  private lazy val _url = require[URL]("url")

  @inline
  def apply() : URL = _url

  implicit class RichURL(val url: URL) extends AnyVal {
    /**
     * Returns only the path part of the provided URL string.
     */
    @inline
    def parsePath(urlStr: String) : String = url.parse(urlStr)("path")

    /**
     * Parses the query string of the provided URL into a dictionary.
     *
     * @param urlStr URL to be parsed
     */
    @inline
    def parseQuery(urlStr: String): js.Dictionary[String] =
      url.parse(urlStr,true)("query").asInstanceOf[js.Dictionary[String]]

//    def parseQuery(parsedURL: ParsedURL): js.Dictionary[String] = parsedURL("query").asInstanceOf[js.Dictionary[String]]
  }
}

@js.native
trait URL extends js.Object {
  def parse(urlStr: String, parseQueryString: Boolean = false, slashesDenoteHost: Boolean = false) : URL.ParsedURL = js.native
}


