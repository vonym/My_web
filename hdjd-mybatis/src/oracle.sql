create table address(
addr_id number(7) constraint address_addr_id_pk primary key,
country varchar2(10),
province varchar2(10),
city varchar2(10),
zip varchar2(10)
);
insert into address values(1,'�й�','����','����','100000');
insert into address values(2,'�й�','�Ϻ�','���','200030');
insert into address values(3,'�й�','����','�ϲ�','330000');
insert into address values(4,'�й�','����','��ɽ','215300');
insert into address values(5,'�й�','ɽ��','̫ԭ','030001');