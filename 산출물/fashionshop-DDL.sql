CREATE  TABLE topcategory(
 topcategory_id NUMBER 
 , PRIMARY key(topcategory_id)
 , top_name varchar2(40)
);

CREATE TABLE subcategory(
	subcategory_id NUMBER
	, PRIMARY key(subcategory_id)
	, sub_name varchar2(40)
	, topcategory_id number
	, CONSTRAINT fk_topsub  foreign KEY (topcategory_id)
	  REFERENCES topcategory(topcategory_id)
);

CREATE TABLE product(
   product_id NUMBER PRIMARY KEY
 , subcategory_id number
 , product_name varchar2(100)
 , price NUMBER DEFAULT 0 
 , detail clob 
 , filename varchar2(30)
 , CONSTRAINT fk_subproduct FOREIGN KEY (subcategory_id)
   REFERENCES subcategory(subcategory_id)
);

CREATE TABLE admin(
  admin_id NUMBER PRIMARY KEY
  , id varchar2(20)
  , pass varchar2(20)
  , name varchar(30)
);

CREATE  SEQUENCE seq_topcategory
INCREMENT BY 1
START WITH 1;

CREATE  SEQUENCE seq_subcategory
INCREMENT BY 1
START WITH 1;

CREATE  SEQUENCE seq_product
INCREMENT BY 1
START WITH 1;

CREATE  SEQUENCE seq_admin
INCREMENT BY 1
START WITH 1;



INSERT INTO admin(admin_id, id, pass,name)
values(seq_admin.nextval, 'zino', '1187', 'Áö³ë');
COMMIT;

SELECT * FROM admin;







