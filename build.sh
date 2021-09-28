#!/bin/sh
cur=$(dirname $0)

if [ ! -z $1 ] && [ $1 = "clean" ] ; then
    sbt clean package
else
    sbt package
fi
