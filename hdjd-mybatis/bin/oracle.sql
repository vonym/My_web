create table address(
addr_id number(7) constraint address_addr_id_pk primary key,
country varchar2(10),
province varchar2(10),
city varchar2(10),
zip varchar2(10)
);
insert into address values(1,'中国','北京','海淀','100000');
insert into address values(2,'中国','上海','徐汇','200030');
insert into address values(3,'中国','江西','南昌','330000');
insert into address values(4,'中国','江苏','昆山','215300');
insert into address values(5,'中国','山西','太原','030001');