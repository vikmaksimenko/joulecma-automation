Joule Cucumber Selenide UI Automation Test Framework [![Build Status](https://travis-ci.org/vikmaksimenko/joulecma-automation.svg?branch=master)](https://travis-ci.org/vikmaksimenko/joulecma-automation)
=====================================================

This is a project for running Cucumber Selenide automated UI tests on Selenoid containers

### Required tools
 
* JDK 8
* Maven
* Docker 

### How to run


1. Start Selenoid containers 
```
docker run --rm -v /var/run/docker.sock:/var/run/docker.sock  \
    -v ${HOME}:/root                                            \
    -e OVERRIDE_HOME=${HOME}                                    \
    aerokube/cm:latest-release selenoid start --vnc --tmpfs 128
```
2. Run tests:
```
mvn clean test
```
3. Build reports to temp folder and view:    
```
mvn allure:serve
```
4. Build reports and save to target/site
```
mvn allure:report
```

Joule Allure report can be found on http://joule-cucumber-selenide-selenoid-automation.surge.sh

### Travis CI Integration

This project is integrated with Travis CI, see https://travis-ci.org/vikmaksimenko/joulecma-automation. The builds are running daily and on push to master branch.
