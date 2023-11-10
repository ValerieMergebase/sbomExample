# Build docker image
- cd to root folder where Dockerfile is & run `docker build -t jsch-example .`
- scan a docker image using syft

  `docker sbom --format cyclonedx gradle-version:latest > syft/docker_syft_sbom.xml`

  `docker sbom --format spdx-json gradle-version:latest > syft/docker_syft_sbom.json`

# Cyclone DX Maven & Gradle plugins
- points
  - super easy to use & produces nice clean sbom
  - need a different plugin for each language and/or build system
  - doesn't handle Docker images

# Syft
- points 
  - scans many languages
  - I like how it is now part of the docker ecosystem making scanning an image easy
  - lengthy & verbose sbom

# Fossa
- points
  - scans many languages
  - need to be logged into dashboard in order to fetch sbom
  - can't figure out how to generate sbom from docker image

# Mergebase
- points
  - scans all languages
  - scans docker images
  - SBOM also contains VEX report