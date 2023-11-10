# Using gradle plugin
- build using ./gradlew build
- generate sbom using `./gradlew cyclonedxBom`
- configuration can be done in build.gradle
- find sbom in build/plugin/reports in both json and xml


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