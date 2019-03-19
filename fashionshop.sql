
/* Drop Tables */

DROP TABLE NEW_TABLE CASCADE CONSTRAINTS;
DROP TABLE subcategory CASCADE CONSTRAINTS;
DROP TABLE topcategory CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE NEW_TABLE
(
	 
);


CREATE TABLE subcategory
(
	subcategory_id  NOT NULL,
	topcategory_id  NOT NULL,
	sub_name varchar2(40),
	PRIMARY KEY (subcategory_id)
);


CREATE TABLE topcategory
(
	topcategory_id  NOT NULL,
	top_name varchar2(40),
	PRIMARY KEY (topcategory_id)
);



/* Create Foreign Keys */

ALTER TABLE subcategory
	ADD FOREIGN KEY (topcategory_id)
	REFERENCES topcategory (topcategory_id)
;



