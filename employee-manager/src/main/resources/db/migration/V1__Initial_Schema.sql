CREATE TABLE employee
(
  id bigint auto_increment,
  name varchar(50) not null,
  job_title varchar(255),
  birth_day timestamp,
  email varchar(255) not null,
  phone_number varchar(255),
  primary key (id)
);

INSERT INTO employee (name, job_title, birth_day, email, phone_number) VALUES
('Straton Alexandru','Database Administrator','2000-01-20','houka@gmail.com','799322157'),
('Cepraga Maxim','Python Developer','2003-12-01','maxim@gmail.com','79777157'),
('Schirca Vadim','Java Developer','1999-05-27','vadim@gmail.com','79775767'),
('Gurschi Sergiu','COBOL Developer','2002-05-15','sergiu@gmail.com','79788867'),
('Culinca Denis','COBOL Developer','2001-12-05','denis@gmail.com','79787536'),
('Gherta Vlad','Database Administrator','2000-05-05','vlad@gmail.com','79857436'),
('Toma Alexei','Data Analyst','2001-08-06','alexei@gmail.com','79851236'),
('Ciumac Victor','.Net Developer','2001-12-17','victor@gmail.com','79812336'),
('Golban Marin','.Net Developer','1998-07-06','marin@gmail.com','77964536'),
('Iscra Nicolae','Maturator','2000-12-12','iscra@gmail.com','77123321');
