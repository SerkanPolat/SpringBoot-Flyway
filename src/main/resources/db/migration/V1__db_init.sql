CREATE SEQUENCE seq_users start 1 increment 1;

CREATE TABLE kullanici (
   id bigint NOT NULL default nextval('seq_users'),
   kulad varchar(100) NOT NULL,
   kulsoyad varchar(50) NOT NULL,
   PRIMARY KEY (id)
);