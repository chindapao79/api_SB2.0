-- public.categories definition

-- Drop table

-- DROP TABLE public.categories;

CREATE TABLE public.categories (
	categoryid serial4 NOT NULL,
	categoryname varchar(255) NULL,
	description varchar(255) NULL,
	CONSTRAINT categories_pkey PRIMARY KEY (categoryid)
);


-- public.customers definition

-- Drop table

-- DROP TABLE public.customers;

CREATE TABLE public.customers (
	customerid serial4 NOT NULL,
	customername varchar(255) NULL,
	contactname varchar(255) NULL,
	address varchar(255) NULL,
	city varchar(255) NULL,
	postalcode varchar(255) NULL,
	country varchar(255) NULL,
	CONSTRAINT customers_pkey PRIMARY KEY (customerid)
);


-- public.employees definition

-- Drop table

-- DROP TABLE public.employees;

CREATE TABLE public.employees (
	employeeid serial4 NOT NULL,
	lastname varchar(255) NULL,
	firstname varchar(255) NULL,
	birthdate varchar(255) NULL,
	city varchar(255) NULL,
	photo varchar(255) NULL,
	notes varchar(1000) NULL,
	CONSTRAINT employees_pkey PRIMARY KEY (employeeid)
);


-- public.orderdetails definition

-- Drop table

-- DROP TABLE public.orderdetails;

CREATE TABLE public.orderdetails (
	orderdetailid serial4 NOT NULL,
	orderid int4 NULL,
	productid int4 NULL,
	quantity int4 NULL,
	CONSTRAINT orderdetails_pkey PRIMARY KEY (orderdetailid)
);


-- public.orders definition

-- Drop table

-- DROP TABLE public.orders;

CREATE TABLE public.orders (
	orderid serial4 NOT NULL,
	customerid int4 NULL,
	employeeid int4 NULL,
	orderdate varchar(255) NULL,
	shipperid int4 NULL,
	CONSTRAINT orders_pkey PRIMARY KEY (orderid)
);


-- public.products definition

-- Drop table

-- DROP TABLE public.products;

CREATE TABLE public.products (
	productid serial4 NOT NULL,
	productname varchar(255) NULL,
	supplierid int4 NULL,
	categoryid int4 NULL,
	unit varchar(255) NULL,
	price varchar(255) NULL,
	CONSTRAINT products_pkey PRIMARY KEY (productid)
);


-- public.shippers definition

-- Drop table

-- DROP TABLE public.shippers;

CREATE TABLE public.shippers (
	shipperid serial4 NOT NULL,
	shippername varchar(255) NULL,
	phone varchar(255) NULL,
	CONSTRAINT shippers_pkey PRIMARY KEY (shipperid)
);


-- public.suppliers definition

-- Drop table

-- DROP TABLE public.suppliers;

CREATE TABLE public.suppliers (
	supplierid serial4 NOT NULL,
	suppliername varchar(255) NULL,
	contactname varchar(255) NULL,
	address varchar(255) NULL,
	city varchar(255) NULL,
	postalcode varchar(255) NULL,
	country varchar(255) NULL,
	phone varchar(255) NULL,
	CONSTRAINT suppliers_pkey PRIMARY KEY (supplierid)
);