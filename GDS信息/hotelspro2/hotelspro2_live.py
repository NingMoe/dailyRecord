#!/usr/bin/env python3
# -*- coding: utf-8 -*-
import requests

# 这是hotelspro2的正式接口,跳过了https的认证

url = "https://api-proxy-singapore.hotelspro.com/api/v2/search/"

querystring = {"pax": "2", "checkin": "2017-12-27", "checkout": "2017-12-28", "destination_code": "161cf",
               "client_nationality": "CN", "currency": "EUR", "format": "json"}

headers = {
    'authorization': "Basic QmVpamluZ01vZ3V0cmlwSW50ZXJuYXRpb25hbFRyOnBSVGpQWThxdVpjaDBzUUg=",
    'cache-control': "no-cache",
    'postman-token': "df09cbe8-716f-891a-89bd-0b0522620199"
}

response = requests.request("GET", url, headers=headers, params=querystring, verify=False, timeout=(10, 200))

print(response.text)
