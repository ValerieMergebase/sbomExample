# Maven plugin
Notice the cycloneDX plugin in the pom.xml
- every time you run: `mvn clean install`
  - it generates a bom.xml and a bom.json in your target folder


# Using Syft
- with file system (run in same folder as code)
  `syft build -o cyclonedx-json > syft/sbom.json`


# Fossa
`curl -H 'Cache-Control: no-cache' https://raw.githubusercontent.com/fossas/fossa-cli/master/install-latest.sh | bash`
`export FOSSA_API_KEY='KEY'`
- note that key changes
- import project in fossa dashboard by running `fossa analyze`
- don't think it can scan docker images


# Mergebase
- get your MergeBase jar by signing up for a free trial
  `java -jar mb.jar  --group=twilio --name=twilio/log4j --sbom . --outputFile=mergebom/sbom.json`