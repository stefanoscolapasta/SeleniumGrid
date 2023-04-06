# Selenium 4 Grid

This is a TestNG suite-case for Selenium 4 Grid. It's a small demo we chose to developed as part of the DD2482 course.

## What is Selenium Grid?

Want to run tests in parallel across multiple machines? Then, Grid is for you.<br/><br/>

Selenium Grid allows the execution of WebDriver scripts on remote machines by routing commands sent by the client to remote browser instances.<br/><br/>

Grid aims to:<br/>

* Provide an easy way to run tests in parallel on multiple machines
* Allow testing on different browser versions
* Enable cross platform testing

## What did we do?

We simply created two simple Selenium tests to be run in parallel through TestNG. This way it is possible to quickly run cross-platform tests.<br/>
We instantiated a hub, to which we can connect an arbitrary number of nodes. Tests are written on the hub and executed on the nodes.
