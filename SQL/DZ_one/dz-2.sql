use dz_2;

create table sales(
	id serial primary key,
    order_date varchar(25) not null,
    count_product int not null
);
insert into sales ( order_date, count_product)
values
("2022-01-01", 156),
("2022-01-02", 180),
("2022-01-03", 21),
("2022-01-04", 124),
("2022-01-05", 341);

select id, order_date, count_product,
case 
	when count_product < 100 then "маленький заказ"
	when count_product between 100 and 300  then "средний заказ"
	when count_product > 300 then "большой заказ"
    else "None"

end as "type_product"

from sales;


create table orders(
	id serial primary key,
    employee_id varchar(25) not null,
    amount double not null,
    order_status varchar(25) not null
    
);
insert into orders (employee_id, amount, order_status)
values
("e03",	15.00,	"OPEN"),
("e01",	25.50,	"OPEN"),
("e05",	100.70,	"CLOSED"),
("e02",	22.18,	"OPEN"),
("e04",	9.50,	"CANCELLED");

select id,employee_id, amount, order_status,
case 
	when order_status = "OPEN" then "Order is in open state"
	when order_status = "CLOSED"  then "Order is closed"
	when order_status = "CANCELLED" then "Order is cancelled"
    

end as "full_order_status"

from orders;
select * from orders;
select * from sales;



