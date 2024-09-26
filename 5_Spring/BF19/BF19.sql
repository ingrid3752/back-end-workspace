DROP TABLE weather;

CREATE TABLE weather (
    id BIGINT PRIMARY KEY,   
    base_date VARCHAR(8), 
    base_time VARCHAR(4), 
    category VARCHAR(3),   
    fcst_date VARCHAR(8),  
    fcst_time VARCHAR(4),  
    fcst_value VARCHAR(10),
    nx INTEGER,         
    ny INTEGER 
);

SELECT * FROM weather;