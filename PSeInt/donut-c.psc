Funcion InicializarMatriz(matriz, alto, ancho)
	Definir i, j Como Entero;
	Para i = 0 Hasta ancho - 1 Hacer
		Para j = 0 Hasta alto - 1 Hacer
			matriz[i, j] = 0;
			Escribir Sin Saltar matriz[i, j];
		FinPara
		Escribir "";
	FinPara
FinFuncion

Funcion LimpiarYRellenar(matriz, alto, ancho)
	Limpiar Pantalla;	
	Definir i, j Como Entero;
	Para i = 0 Hasta ancho - 1 Hacer
		Para j = 0 Hasta alto - 1 Hacer
			Escribir Sin Saltar matriz[i, j];
		FinPara
		Escribir "";
	FinPara
	Esperar 1.2 Segundos;
FinFuncion

Algoritmo donut_c
	Definir theta, phi Como Real;
	Definir A, B, angulo Como Real;
	Definir ancho, alto, eje_x, eje_y, distancia Como Entero;
	Definir matriz, counter, radioInterno, radioExterno Como Entero;
	
	ancho = 40; alto = 40;
	radioInterno = 4;
	radioExterno = 10;
	
	Dimension matriz[ancho, alto];
	InicializarMatriz(matriz, alto, ancho);
//	counter = 100;
//	Mientras counter = 100 Hacer
//		LimpiarYRellenar(matriz, alto, ancho);
//	FinMientras
	Mientras Verdadero Hacer
		Para eje_y = 0 Hasta alto - 1 Hacer
			Para eje_x = 0 Hasta ancho - 1 Hacer
				angulo = (eje_x * 6.28) / ancho;
				distancia = abs(ancho / 2 - eje_x) + abs(alto/2 - eje_y);
				
				Si distancia >= radioInterno y distancia <= radioExterno Entonces
					Escribir "o";
				SiNo
					Escribir " ";
				FinSi
			FinPara
			Escribir "";
		FinPara
		Esperar 1 Segundos;
		Limpiar Pantalla;		
	FinMientras
FinAlgoritmo
