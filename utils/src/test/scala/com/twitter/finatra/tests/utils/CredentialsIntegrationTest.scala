package com.twitter.finatra.tests.utils

import com.twitter.finatra.modules.CredentialsModule
import com.twitter.finatra.utils.Credentials
import com.twitter.inject.WordSpecIntegrationTest
import com.twitter.inject.app.TestInjector

class CredentialsIntegrationTest extends WordSpecIntegrationTest {

  override def injector =
    TestInjector(CredentialsModule)

  "Credentials Module" should {

    "load empty credentials" in {
      val credentials = injector.instance[Credentials]
      credentials.isEmpty should be(true)
      credentials.get("foo") should be(None)
    }
  }
}
