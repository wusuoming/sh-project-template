DROP TABLE IF EXISTS user;
CREATE TABLE user(
  id int(12) NOT NULL auto_increment DEFAULT 0,
  version int(12) NOT NULL DEFAULT 0,
  active tinyint(1) default 0 COMMENT '1 for YES or 0 for NO',
  guid varchar(255) DEFAULT NULL ,
  username varchar(255) DEFAULT NULL ,
  password varchar(255) DEFAULT NULL ,
  PRIMARY KEY (id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS role;
CREATE TABLE role(
  id int(12) NOT NULL auto_increment DEFAULT 0,
  version int(12) NOT NULL DEFAULT 0,
  active tinyint(1) default 0 COMMENT '1 for YES or 0 for NO',
  guid varchar(255) DEFAULT NULL ,
  name varchar(255) DEFAULT NULL ,
  PRIMARY KEY (id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS user_role;
CREATE TABLE user_role(
  user_id int(12),
  role_id int(12)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS privileges;
CREATE TABLE privileges(
  role_id int(12),
  privilege varchar(255) DEFAULT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

