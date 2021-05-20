
DROP TABLE IF EXISTS user_table;

CREATE TABLE user_table (
  id_user VARCHAR (255) NOT NULL,
  name_user varchar(255) NULL,
  email_user VARCHAR (255) NOT NULL,
  password_user VARCHAR (255) NOT NULL,
  PRIMARY KEY (id_user)
);