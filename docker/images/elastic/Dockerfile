FROM docker.elastic.co/elasticsearch/elasticsearch:7.13.2

COPY elasticsearch.yml /usr/share/elasticsearch/config/elasticsearch.yml
COPY ru_RU.aff /usr/share/elasticsearch/config/hunspell/ru_RU/ru_RU.aff
COPY ru_RU.dic /usr/share/elasticsearch/config/hunspell/ru_RU/ru_RU.dic
COPY en_US.aff /usr/share/elasticsearch/config/hunspell/en_US/en_US.aff
COPY en_US.dic /usr/share/elasticsearch/config/hunspell/en_US/en_US.dic
