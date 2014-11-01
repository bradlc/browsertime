/**
 * Browsertime (http://www.browsertime.com)
 * Copyright (c) 2014, Peter Hedenskog, Tobias Lidskog
 * and other contributors
 * Released under the Apache 2.0 License
 */
var webdriver = require('selenium-webdriver');

exports.getDriver = function(arg) {

  return new webdriver.Builder().usingServer(arg.seleniumServer)
    .withCapabilities(webdriver.Capabilities.ie())
    .build();
};