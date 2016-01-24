import java.util.Scanner;
/* Dimension vector: "dimvec";Direccion inicial: "dir"; indice inicial y final: "start & end"; tamaño en bytes: "tam"; Posicion a calcular: "pos"; Resultado del calculo: "pd"; bandera: "aux" */
public class Main {
public static void main(String []args){
	Scanner ent = new Scanner(System.in);
	int dimvec=0, dir, start, end, tam=2, pos, pd=0, posi=0;//Declaramos variables 
	    System.out.println("Programa para verificar funcionamiento de un Polinomio de direccionamiento de N Bytes");
	    System.out.println("Ingresa tamaño del arreglo: "); dimvec=ent.nextInt();//Ingresamos dimension de arreglo
	    System.out.println("Ingresemos ahora la direccion inicial del arreglo: "); dir=ent.nextInt();//Direccion incial
	    System.out.println("Ingresa el valor del indice inicial: "); start=ent.nextInt();//Indice inicial
	    System.out.println("Ingresa el indice final: "); end=ent.nextInt();//Indice final
	    System.out.println("Ahora ingresemos valores al arreglo: ");System.out.print("\t");
	    int vec[] = new int[dimvec];
	        for(int i=0;i<dimvec;i++)
	        {
	        	vec[i]=ent.nextInt();//Ingresamos valores al Arreglo 
	            System.out.print("\t");
	        }
	        int aux=1;
	      		while(aux==1)
	        	{
	      			System.out.println("Ingresa ahora la posicion a calcular: ");
		        	pos=ent.nextInt();
		        	posi=pos;
		        	
	        			if(pos<=dimvec && pos>=0)
	        			{
	        				for(int j=1;j<=end-start;j++)
	        				{
	        					if(pos==j)// Incluimos la condicion para que posicion sea igual a la variable de control
	        					{
	        						dir=dir+((pos-1)*tam);// Se lleva a cabo el calculo para encontrar la direccion que concatena a la posicion
	        						pd=dir;//Guardamos la direccion encontrada en la variable pd
	        						aux=0;//Y apagamos la bandera para poder salir del ciclo
	        					}
	        				}
	        			}	
	        				else
	        					System.out.println("Error, introduzca una posicion que este dentro del rango!");
	        	}
	      		System.out.println("La direccion de la posicion es: "+pd);
	      		System.out.println("El elemento correspondiente a la posicion indicada es: "+vec[posi-1]);
	        	ent.close();
									  }
				  }
