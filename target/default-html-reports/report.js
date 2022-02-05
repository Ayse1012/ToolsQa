$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/forms.feature");
formatter.feature({
  "name": "Forms",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Enter Forms",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@forms"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user tools page and click to demo site",
  "keyword": "Given "
});
formatter.match({
  "location": "com.elements.step_definitions.BaseStepDefs.the_user_tools_page_and_click_to_demo_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user navigate to \"Forms\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.elements.step_definitions.BaseStepDefs.the_user_navigate_to(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click to \"Practice Form\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.elements.step_definitions.ElementsStepDefs.the_user_click_to(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enter \"Ayşe\" and \"Akkoca\" and \"ayse@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.elements.step_definitions.FormsStepDefs.the_user_enter_and_and(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user radio button famela click",
  "keyword": "And "
});
formatter.match({
  "location": "com.elements.step_definitions.FormsStepDefs.the_user_radio_button_famela_click()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enter \"1234567890\" and enter dateBird",
  "keyword": "And "
});
formatter.match({
  "location": "com.elements.step_definitions.FormsStepDefs.the_user_enter_and_enter_dateBird(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enter subject\"e\" and check box click",
  "keyword": "And "
});
formatter.match({
  "location": "com.elements.step_definitions.FormsStepDefs.theUserEnterSubjectAndCheckBoxClick(java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d97.0.4692.71)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-A37C2DF\u0027, ip: \u0027192.168.1.6\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.8\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 97.0.4692.71, chrome: {chromedriverVersion: 97.0.4692.71 (adefa7837d02a..., userDataDir: C:\\Users\\ayse1\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:58300}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: df9a0638963cd7e9aedb09fa6037c0bb\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:106)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy20.sendKeys(Unknown Source)\r\n\tat com.elements.step_definitions.FormsStepDefs.theUserEnterSubjectAndCheckBoxClick(FormsStepDefs.java:49)\r\n\tat ✽.the user enter subject\"e\" and check box click(file:///C:/Users/ayse1/IdeaProjects/ToolsQa/src/test/resources/features/forms.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "the user enter \"path\" and current address \"Kayseri\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.elements.step_definitions.FormsStepDefs.theUserEnterAndCurrentAddress(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user select sity and click submit",
  "keyword": "Then "
});
formatter.match({
  "location": "com.elements.step_definitions.FormsStepDefs.the_user_select_sity_and_click_submit()"
});
formatter.result({
  "status": "skipped"
});
});