SELECT dept_code,sum(salary) 합계, avg(salary) 평균, count(*) 인원수
FROM employee
WHERE salary > 2800000
GROUP BY dept_code
HAVING dept_code IS NOT NULL
ORDER BY 합계 DESC;
SELECT * FROM department;
SELECT * FROM employee;
SELECT * FROM job;
SELECT job_code, avg(salary)
FROM employee
WHERE bonus IS NOT NULL
GROUP BY job_code
LIMIT 2;

SELECT emp_name,job_code,count(*) 사원수
FROM employee
WHERE bonus IS NOT NULL
GROUP BY job_code
ORDER BY job_code;

SELECT emp_id, emp_name,dept_id, dept_title
FROM employee
JOIN department ON (dept_code = dept_id)
WHERE dept_title = '총무부';