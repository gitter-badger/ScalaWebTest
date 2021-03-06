package org.scalawebtest.integration.navigation

import org.scalawebtest.core.IntegrationFlatSpec

class DisableNavigateTo extends IntegrationFlatSpec{
  path = "/a.jsp"
  config.disableNavigateToBeforeEach()

  "When navigateTo is disabled" should "remain on about:blank" in {
    webDriver.getCurrentUrl shouldEqual "about:blank"
  }
}
