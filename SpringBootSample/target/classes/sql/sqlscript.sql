CREATE TABLE PRODUCT (
PRODUCT_ID INT PRIMARY KEY,
NAME VARCHAR(50),
RATING INT,
DESCRIPTION VARCHAR(300),
PRICE INT,
STOCK INT,
DISCOUNT INT,
STATUS VARCHAR(10)
);

Table	Column		Data Type	Length	Precision	Scale	Primary Key	Nullable	Default	Comment
PRODUCT	PRODUCT_ID	NUMBER	22	-	0	1	-	-	-
 	NAME		VARCHAR2	50	-	-	-	nullable	-	-
 	RATING		NUMBER	22	-	0	-	nullable	-	-
 	DESCRIPTION	VARCHAR2	300	-	-	-	nullable	-	-
 	PRICE		NUMBER	22	-	0	-	nullable	-	-
 	STOCK		NUMBER	22	-	0	-	nullable	-	-
 	DISCOUNT	NUMBER	22	-	0	-	nullable	-	-
 	STATUS		VARCHAR2	10	-	-	-	nullable	-	-
	

CREATE TABLE RP_USER (
USER_ID INT PRIMARY KEY,
FIRST_NAME VARCHAR(20),
LAST_NAME VARCHAR(20),
SHIP_ADD VARCHAR(300),
BILL_ADD VARCHAR(300),
PASSWORD VARCHAR(20),
PHONE INT,
EMAIL VARCHAR(30)
);

Table	Column		Data Type	Length	Precision	Scale	Primary Key	Nullable	Default	Comment
RP_USER	USER_ID		NUMBER	22	-	0	1	-	-	-
 	FIRST_NAME	VARCHAR2	20	-	-	-	nullable	-	-
 	LAST_NAME	VARCHAR2	20	-	-	-	nullable	-	-
 	SHIP_ADD	VARCHAR2	300	-	-	-	nullable	-	-
 	BILL_ADD	VARCHAR2	300	-	-	-	nullable	-	-
 	PASSWORD	VARCHAR2	20	-	-	-	nullable	-	-
 	PHONE		NUMBER	22	-	0	-	nullable	-	-
 	EMAIL		VARCHAR2	30	-	-	-	nullable	-	-

CREATE TABLE RP_ORDER (
ORDER_ID INT PRIMARY KEY,
USER_ID INT,
PRODUCT_ID INT,
CONSTRAINT FK_USER FOREIGN KEY(USER_ID) REFERENCES RP_USER(USER_ID),
CONSTRAINT FK_PRODUCT FOREIGN KEY(PRODUCT_ID) REFERENCES PRODUCT(PRODUCT_ID)
);

Table	Column			Data Type	Length	Precision	Scale	Primary Key	Nullable	Default	Comment
RP_ORDER	ORDER_ID	NUMBER	22	-	0	1	-	-	-
 		USER_ID		NUMBER	22	-	0	-	nullable	-	-
 		PRODUCT_ID	NUMBER	22	-	0	-	nullable	-	-