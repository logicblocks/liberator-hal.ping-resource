#!/usr/bin/env bash

[ -n "$DEBUG" ] && set -x
set -e
set -o pipefail

apt-get update
apt-cache search jdk
apt-get install -y --no-install-recommends open-jdk
