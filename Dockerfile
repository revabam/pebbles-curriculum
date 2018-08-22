FROM java:8
ADD ./pebbles-curriculum .
EXPOSE 9996
CMD java -jar -Xmx512M pebbles-curriculum.jar
