sed -E -n "s/{[[:space:]]([[:alpha:]]+\_*[[:alpha:]]*).*/\1/p" ./dict/dbfiles/noun.person >> noun.person.parsed.txt

sed -E -n "s/{[[:space:]]([[:alpha:]]+\_*[[:alpha:]]*).*/\1/p" ./dict/dbfiles/adj.all >> adj.all.parsed.txt

sed -E -n "s/{[[:space:]]([[:alpha:]]+\_*[[:alpha:]]*).*/\1/p" ./dict/dbfiles/verb.change >> verb.change.parsed.txt