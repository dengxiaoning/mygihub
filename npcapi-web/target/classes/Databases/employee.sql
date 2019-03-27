CREATE TABLE  `department`(
   `id` int(11) NOT NULL AUTO_INCREMENT,
   `departmentid`  int(11) NOT NULL,
   `departmentname` varchar(100) NOT NULL,
     PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 comment='部门表';
insert  into department values(default ,20,'生成技术部');
insert  into department values(default ,30,'系统维护部');
insert  into department values(default ,40,'人事部');
insert  into department values(default ,50,'营销部');

CREATE TABLE `employee` (
  `employee_id` int(11) NOT NULL AUTO_INCREMENT,
  `employee_account` varchar(255) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `departmentid` int(11) DEFAULT NULL,
  `role` int(3) NOT NULL,
  PRIMARY KEY (`employee_id`),
  KEY `departmentid` (`departmentid`) USING BTREE,
  CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`departmentid`) REFERENCES `department` (`departmentid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8 comment='员工表';

insert into employee values(default,'1004','希腊','123456',20,'四川成都青羊',20,40);
insert into employee values(default,'1005','何星','123456',22,'四川成都青羊',20,30);
insert into employee values(default,'1006','李协议','123456',33,'四川成都青羊',30,30);
insert into employee values(default,'1007','可兴隆','123456',35,'四川成都青羊',40,20);
insert into employee values(default,'1008','图一哼','123456',29,'四川成都青羊',50,20);
insert into employee values(default,'1009','布朗','123456',28,'四川成都青羊',20,40);
insert into employee values(default,'1010','泰克','123456',34,'四川成都青羊',40,30);
insert into employee values(default,'1011','冰红','123456',40,'四川成都青羊',30,20);
insert into employee values(default,'1009','犀利','123456',28,'四川成都青羊',20,40);
insert into employee values(default,'1010','阔绰','123456',34,'四川成都青羊',40,30);
insert into employee values(default,'1011','鸿基','123456',40,'四川成都青羊',30,20);

