UPDATE STUDENT 
SET YEAR =YEAR-1



SELECT * FROM STUDENT 

SELECT student.name, student.STU_ID ,department.DEPT_NAME 
FROM student,DEPARTMENT
WHERE student.DEPT_ID = department.DEPT_ID 

SELECT student.STU_ID 
FROM student,DEPARTMENT 
WHERE student.DEPT_ID = department.DEPT_ID AND 
student.YEAR =3and
department.DEPT_NAME ='컴퓨터공학과'

SELECT NAME, STU_ID
FROM STUDENT 
WHERE YEAR=3 OR YEAR=4
ORDER BY NAME DESC ,STU_ID 

SELECT s.name,d.dept_name
FROM STUDENT s ,DEPARTMENT d 
WHERE s.DEPT_ID =d.DEPT_ID 

SELECT s.DEPT_ID,d.DEPT_ID  
FROM STUDENT s ,DEPARTMENT d 


SELECT *
FROM STUDENT s1, STUDENT s2

SELECT*
FROM STUDENT s1, STUDENT s2
WHERE s1.ADDRESS = s2.ADDRESS 
AND s1.NAME = '김광식'

SELECT name, address
FROM STUDENT 
WHERE ADDRESS ='서울'

SELECT ADDRESS --*
FROM STUDENT 
WHERE NAME ='김광식'

SELECT name,POSITION ,2023-year_emp
FROM PROFESSOR 

SELECT*
FROM STUDENT s
WHERE name LIKE '김%'

SELECT *
FROM STUDENT 
WHERE RESIDENT_ID LIKE '%*2%'
OR RESIDENT_ID LIKE '%*4%'

SELECT stu_id
FROM STUDENT s ,DEPARTMENT d 
WHERE s.DEPT_ID =d.DEPT_ID AND DEPT_name = '컴퓨터공학과'
INTERSECT 
SELECT STU_ID 
FROM TAKES 
WHERE grade = 'A+';

SELECT stu_id FROM STUDENT s,DEPARTMENT d 
WHERE s.DEPT_ID = d.DEPT_ID AND DEPT_name='산업공학과'
MINUS 
SELECT STU_ID FROM TAKES 
WHERE grade='A+'

SELECT title,credit,YEAR,semester
FROM COURSE ,CLASS 
WHERE course.COURSE_ID =class.COURSE_ID 

SELECT title,credit,YEAR,semester
FROM course LEFT outer JOIN CLASS 
using(course_id)

SELECT title,credit,YEAR,semester
FROM course,CLASS 
WHERE course.course_id=class.course_id(+)

SELECT title,credit,YEAR,semester
FROM course RIGHT OUTER JOIN CLASS 
using(course_id)

SELECT title,credit,YEAR,semester
FROM COURSE FULL OUTER JOIN CLASS 
USING (Course_id)

SELECT * FROM EMP 
ORDER BY  6

CREATE OR REPLACE VIEW v_takes AS
					SELECT stu_id,class_id
					FROM TAKES
					
					SELECT *
					FROM V_TAKES vt 




