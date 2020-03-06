Joule Cucumber Selenide UI Automation Test Framework [![Build Status](https://travis-ci.org/vikmaksimenko/joulecma-automation.svg?branch=master)](https://travis-ci.org/vikmaksimenko/joulecma-automation)
=====================================================

This is a project for running Cucumber Selenide automated UI tests on Selenoid containers

### Required tools
 
* JDK 8
* Maven
* Docker 

### How to run


1. Start Zalenium containers 
```
  # Pull docker-selenium
  docker pull elgalu/selenium

  # Pull Zalenium
  docker pull dosel/zalenium
        
  docker run --rm -ti --name zalenium -p 4444:4444 \
    -v /var/run/docker.sock:/var/run/docker.sock \
    -v /tmp/videos:/home/seluser/videos \
    --privileged dosel/zalenium start
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
