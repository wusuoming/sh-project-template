DROP TABLE IF EXISTS user;
CREATE TABLE user(
  id int(12) NOT NULL auto_increment,
  version int(12) NOT NULL DEFAULT 0,
  active tinyint(1) default 0 COMMENT '1 for YES or 0 for NO',
  guid varchar(255) DEFAULT NULL ,
  username varchar(255) DEFAULT NULL ,
  password varchar(255) DEFAULT NULL ,
  PRIMARY KEY (id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;