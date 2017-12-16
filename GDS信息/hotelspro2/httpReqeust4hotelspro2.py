#!/usr/bin/env python3
# -*- coding: utf-8 -*-
import requests
import time
start = time.clock()
url = "http://api-proxy-seoul.hotelspro.com/api/v2/search/"

querystring = {"pax":"2","checkin":"2018-01-12","checkout":"2018-01-13","destination_code":"161cf","client_nationality":"CN","currency":"EUR","format":"json"}

headers = {
    'authorization': "Basic QmVpamluZ01vZ3V0cmlwSW50ZXJuYXRpb25hbFRyOnBSVGpQWThxdVpjaDBzUUg=",
    'cache-control': "no-cache",
    'postman-token': "ac7ee01e-fe61-184d-53d9-b1fc908c5e05"
    }

response = requests.request("GET", url, headers=headers, params=querystring)
elapsed = (time.clock() - start)
print(response.text)
print("Time used:",elapsed)