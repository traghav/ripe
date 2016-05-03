import requests
r = requests.get('http://opentable.herokuapp.com/api/cities')
print r.json()