#!/usr/bin/env bash

set -e

sbt "project http4s021" clean compile test

sbt "project http4s021" publish
