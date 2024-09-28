import java.util.Scanner;


public class Hotel
{
    public static void main(String[] args) {
       
        

        //array para establecer los estados de cada habitacion
        String[] estado_habitacion ={"ocupada","disponible"};
        String estado_1=estado_habitacion[1];
        String estado_2=estado_habitacion[1];
        String estado_3=estado_habitacion[1];
        String estado_4=estado_habitacion[1];
        String estado_5=estado_habitacion[1];
        String estado_6=estado_habitacion[1];
        
        // forma matricial de los pisos del hotel
        int[][]habitaciones = {
            {101,102,103},
            {201,202,300},
        };

        // se establecen los valores constantes de los precios de las habitaciones
        final int PRECIO_PISO1= 100;
        final int PRECIO_PISO2=200;
        final int PRECIO_SUITE=500;
        
        //variable vandera para la ejecucion de todo el codigo
        int CLIENTES_EN_EL_DIA=1;

        //creacion del objeto scaner
            Scanner scaner= new Scanner(System.in);

            
        //ciclo while determinado por la cantidad de usuarios que quieran hacer uso de las habitaciones
        while (CLIENTES_EN_EL_DIA==1) {
            
            System.out.print("Muy buenos dias por favor ingrese su nombre: ");
            String nombre = scaner.nextLine();
            
            //lista detallada de las habitaciones con sus precios 
            System.out.print("Buenos dias "+nombre+" A continuacion tendra una lista de nuestras habitaciones");
            System.out.println(" teniendo en cuenta que contamos con un total de 6 habitaciones ");
            System.out.println("primer piso a un costo noche de 100 dolares, segundo piso a un total de 200, y la habitacion 300 a un costo noche de 500 dolares");
            System.out.println("|-----------------------|");
            System.out.println("| 1 para habitacion 101 |");
            System.out.println("| 2 para habitacion 102 |");
            System.out.println("| 3 para habitacion 103 |");
            System.out.println("| 4 para habitacion 201 |");
            System.out.println("| 5 para habitacion 202 |");
            System.out.println("| 6 para habitacion 300 |");
            System.out.println("|-----------------------|");
            System.out.println("");
            //accion de cancelar o resevar una habitacion
            System.out.println("desea agendar una habitacion o cancelar una reserva");
            System.out.println("1 par agendar");
            System.out.println("2 par cancelar");
            int accion_de_reserva= scaner.nextInt();
           
            //se pide el numero de habitacion a reservar 
            System.out.print(nombre+" por favor ingrese el numero de habitacion que desea reservar o cancelar: ");
            int num_habitacion = scaner.nextInt();

            
            //se pide el numero de noches 
            System.out.print("Ahora ingrese el numero de noches que se va a hospedar: ");
            int num_noches =scaner.nextInt();
            
            
            
            
            switch (accion_de_reserva) {
                //acciones a realizar si se desea agendar una habitacion
                case 1:
                System.out.println("ingrese de nuevo el numero de habitacion");
                
                System.out.println("ahora la habitacion "+num_habitacion+" está ocupada");
                if (num_habitacion==1){
                        estado_1=estado_habitacion[0];
                        
                    }else if (num_habitacion==2) {
                        estado_2=estado_habitacion[0];
                    }else if (num_habitacion==3) {
                        estado_3=estado_habitacion[0];
                    }else if (num_habitacion==4) {
                        estado_4=estado_habitacion[0];
                    }else if (num_habitacion==5) {
                        estado_5=estado_habitacion[0];
                    }else if (num_habitacion==6) {
                        estado_6=estado_habitacion[0];
                    }
                    break;
                //acciones a realizar si se desea cancelar una habitacion
                    case 2:
                    System.out.println("ahora la habitacion "+num_habitacion+" está disponible");
                    if (num_habitacion==1){
                        estado_1=estado_habitacion[1];
                    }else if (num_habitacion==2) {
                        estado_2=estado_habitacion[1];
                    }else if (num_habitacion==3) {
                        estado_3=estado_habitacion[1];
                    }else if (num_habitacion==4) {
                        estado_4=estado_habitacion[1];
                    }else if (num_habitacion==5) {
                        estado_5=estado_habitacion[1];
                    }else if (num_habitacion==6) {
                        estado_6=estado_habitacion[1];
                    }

                    break;
            
                default:
                    break;
                }
                //resultados de la toma de datos como el nombre la habitacion y la cantidad de noches asi como el total del servicio del hotel
                switch (num_habitacion) {
                    case 1:
                    double costo_total=PRECIO_PISO1*num_noches;
                    num_habitacion=101;
                    System.out.println("perfecto "+nombre+" su habitacion es la numero "+num_habitacion+","+" usted se hospedara por "+num_noches+" noches "+"por un total de "+costo_total+" dolares");
                    
                    
                    break;
                    case 2:
                    costo_total=PRECIO_PISO1*num_noches;
                    num_habitacion=102;
                    System.out.println("perfecto "+nombre+" su habitacion es la numero "+num_habitacion+","+" usted se hospedara por "+num_noches+" noches "+"por un total de "+costo_total+" dolares");
                    
                    break;
                case 3:
                    costo_total=PRECIO_PISO1*num_noches;
                    num_habitacion=103;
                    System.out.println("perfecto "+nombre+" su habitacion es la numero "+num_habitacion+","+" usted se hospedara por "+num_noches+" noches "+"por un total de "+costo_total+" dolares");
                    
                    break;
                case 4:
                    costo_total=PRECIO_PISO2*num_noches;
                    num_habitacion=201;
                    System.out.println("perfecto "+nombre+" su habitacion es la numero "+num_habitacion+","+" usted se hospedara por "+num_noches+" noches "+"por un total de "+costo_total+" dolares");
                    
                    break;
                case 5:
                    costo_total=PRECIO_PISO2*num_noches;
                    num_habitacion=202;
                    System.out.println("perfecto "+nombre+" su habitacion es la numero "+num_habitacion+","+" usted se hospedara por "+num_noches+" noches "+"por un total de "+costo_total+" dolares");
                    
                    break;
                case 6:
                    costo_total=PRECIO_SUITE*num_noches;
                    num_habitacion=300;
                    System.out.println("perfecto "+nombre+" su habitacion es la numero "+num_habitacion+","+" usted se hospedara por "+num_noches+" noches "+"por un total de "+costo_total+" dolares");
                    
                    break;

            
                default:
                    System.out.println("numero de habitacion incorrecta");
                    break;
            }
            //solucion a un caso en el que todas las habitaciones esten ocupadas
            if (estado_1==estado_habitacion[0]&&estado_2==estado_habitacion[0]&&estado_3==estado_habitacion[0]&&estado_4==estado_habitacion[0]&&estado_5==estado_habitacion[0]&&estado_6==estado_habitacion[0]) {
                System.out.println(nombre+" lo sentimos mucho pero en este momento todas las habitaciones se encuentran ocupadas");
            }
           
            //tabla de disponibilidad de habitaciones para el sigiente interesado
            System.out.println();
            System.out.println("|------------------------------|");
            System.out.println("| nuevo estado de habitaciones |");
            System.out.println("  | habitacion 101 "+estado_1 + "|");            
            System.out.println("  | habitacion 102 "+estado_2 + "|");
            System.out.println("  | habitacion 103 "+estado_3 + "|");
            System.out.println("  | habitacion 201 "+estado_4 + "|");
            System.out.println("  | habitacion 202 "+estado_5 + "|");
            System.out.println("  | habitacion 300 "+estado_6 + "|");
            System.out.println("|------------------------------|");
            //salto de linea en blanco para estetica del programa
            System.out.println();

            //nuevo valor de la variable bandera para iniciar de nuevo o cerrar el ciclo while
            System.out.println("buenas por favor introduce 1 para comenzar o 0 para retirarte");
            CLIENTES_EN_EL_DIA= scaner.nextInt();
            
        }
    }
}