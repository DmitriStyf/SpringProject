FROM mysql
COPY init.sql /docker-entrypoint-initdb.d/


EXPOSE 3306

ENV MYSQL_ROOT_PASSWORD=pass
ENV MYSQL_DATABASE=db_test