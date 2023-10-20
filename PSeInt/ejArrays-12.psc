Algoritmo marquitos
	Definir marco, i, j Como Entero;
	Dimension marco[15, 5];
	Para i = 0 Hasta 4 Hacer
		Para j = 0 Hasta 14 Hacer
			marco[j, i] = 0;
		FinPara
		marco[0, i] = 1;
		marco[14, i] = 1;
	FinPara
	Para i = 0 Hasta 14 Hacer
		marco[i, 4] = 1;
		marco[i, 0] = 1;
	FinPara
	Para i = 0 Hasta 4 Hacer
		Para j = 0 Hasta 14 Hacer
			Escribir Sin Saltar marco[j, i];
		FinPara
		Escribir "";
	FinPara
FinAlgoritmo