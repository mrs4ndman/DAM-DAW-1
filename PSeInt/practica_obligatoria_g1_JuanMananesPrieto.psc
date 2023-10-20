Algoritmo practica_g1
	Definir last_one, overflow, array_a_rotar, i Como Entero;
	Dimension array_a_rotar[10];
	Escribir "Vector sin rotar: ";
	Para i = 0 Hasta 9 Hacer
		array_a_rotar[i] = Aleatorio(1, 100);
		Escribir Sin Saltar array_a_rotar[i], " ";
	FinPara
	Escribir "";
	last_one = array_a_rotar[9];
	Escribir "Vector rotado:";
	Para i = 8 Hasta 0 Con Paso -1 Hacer
		overflow = array_a_rotar[i];
		array_a_rotar[i] = array_a_rotar[i + 1];
		array_a_rotar[i + 1] = overflow;
	FinPara
	array_a_rotar[0] = last_one;
	Para i = 0 Hasta 9 Hacer
		Escribir Sin Saltar array_a_rotar[i], " ";
	FinPara
	Escribir "";
FinAlgoritmo