package org.scalawebtest.integration.response

import org.scalatest.exceptions.TestFailedException
import org.scalawebtest.core.ResponseAccessors
import org.scalawebtest.integration.ScalaWebTestBaseSpec

class ResponseCodeSpec extends ScalaWebTestBaseSpec with ResponseAccessors {
  path = "/doesNotExist"
  "When accessing a resource which does not exist the response code" should "be 404" in {
    responseCode shouldBe 404
  }
  it should "be 404 as well, when accessed via webDriver" in {
    webDriver.getResponseCode shouldBe 404
  }
  "When accessing an existing page without errors, it" should "be 200" in {
    navigateTo("/")
    responseCode shouldBe 200
  }
   it should "be 404 as well, when accessed via webDriver" in {
    webDriver.getResponseCode shouldBe 200
  }

}
