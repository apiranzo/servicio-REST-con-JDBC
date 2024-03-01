SELECT * FROM mf0966_3.curso c ORDER BY c.fInicio DESC LIMIT 5;

SELECT * FROM mf0966_3.alumno a ORDER BY a.codigo DESC LIMIT 5;

SELECT c.codigo, c.nombre, c.identificador, c.fInicio, c.fFin, c.nHoras, c.temario, c.activo, c.cliente_codigo, c.precio, c.profesor_codigo,
COUNT(r.curso_codigo) AS `Número Reseñas` 
FROM mf0966_3.curso c JOIN mf0966_3.resenas r
ON c.codigo = r.curso_codigo 
GROUP BY r.curso_codigo;

SELECT c.nombre, c.identificador, c.nHoras, p.nombre, p.apellidos,
COUNT(r.curso_codigo) AS `Número Reseñas` 
FROM mf0966_3.curso c JOIN mf0966_3.resenas r
ON c.codigo = r.curso_codigo 
JOIN mf0966_3.profesor p ON c.profesor_codigo = p.codigo
GROUP BY r.curso_codigo;

SELECT a.codigo, a.nombre, a.apellidos, a.fNacimiento, a.direccion, a.poblacion, a.codigopostal, a.telefono, a.email, a.dni, a.nHermanos, a.activo,
COUNT(r.alumno_codigo) AS `Número Reseñas` 
FROM mf0966_3.alumno a JOIN mf0966_3.resenas r
ON a.codigo = r.alumno_codigo 
GROUP BY r.alumno_codigo ORDER BY `Número Reseñas` DESC;

SELECT YEAR(c.fInicio) AS `Año`, Count(YEAR(c.fInicio)) AS `Número de Cursos` 
	FROM mf0966_3.curso c 
    GROUP BY `Año`
    ORDER BY `Año` DESC;
