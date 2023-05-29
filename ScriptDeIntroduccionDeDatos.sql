use proyecto;
LOAD DATA INFILE 'clientes.csv' 
INTO TABLE clientes 
FIELDS TERMINATED BY ',' 
ENCLOSED BY "'"
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

use proyecto;
LOAD DATA INFILE 'cuentabancarias.csv' 
INTO TABLE cuentas_bancarias 
FIELDS TERMINATED BY ',' 
ENCLOSED BY "'"
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;

use proyecto;
LOAD DATA INFILE 'perfilescliente.csv' 
INTO TABLE perfiles
FIELDS TERMINATED BY ',' 
ENCLOSED BY "'"
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;