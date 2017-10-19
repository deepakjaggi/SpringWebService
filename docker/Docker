FROM artifactory.dnb.no:80/alpine-jre-base:latest
ARG APP_VERSION
ARG SUB_ARTIFACTID
ARG SUB_GROUPID
ARG REPO_TYPE
RUN wget -O /data/"$SUB_ARTIFACTID".jar http://10.78.19.20:443/artifactory/Maven-Internal-"$REPO_TYPE"/"$SUB_GROUPID"/"$SUB_ARTIFACTID"/"$APP_VERSION"/"$SUB_ARTIFACTID"-"$APP_VERSION".jar