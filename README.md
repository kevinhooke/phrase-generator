# phrase-generator
Generates phrases from random words read from files of nouns and verbs

As source files this uses dictionary files from Princeton Univercity's WordNet project, which can be downloaded fom here:
https://wordnet.princeton.edu/download although other files of source words will work too.

If using a download of WordNet, unzip it to this same folder. A script parse-source-files.sh uses sed to extract just the words from the dictionary files.