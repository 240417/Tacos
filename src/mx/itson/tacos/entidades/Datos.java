/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.tacos.entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Jesus
 */
public class Datos {
    public String getCurp (String nombre,String apellidoPaterno,String apellidoMaterno,int dia,int mes,int fechaAnnio,javax.swing.DefaultComboBoxModel entidadNacimiento,javax.swing.DefaultComboBoxModel sexo){
        
        String curp ="";
        int numeroError =0;
        String mensajeError="Error al capturar datos";
         // Juntar Apellidos.
            String apellidos = apellidoPaterno + " " +apellidoMaterno;
            // Separar por " ".
            String[] apellidosSplit = apellidos.split(" ");
            // Contar cuantos datos del arreglo salieron.
           int apellidosDatoLength = apellidosSplit.length;
           // Convertir int a String.
           String apellidosDatoString = String.valueOf(apellidosDatoLength);
           // Imprimir en consola.
    System.out.println("Cantidad de apellidos: " + apellidosDatoLength);
           
            // Sacar letra apellido "Paterno".
            char[] apellidoPaternoChar = apellidoPaterno.toCharArray();
            char apellidoPaternoDato = apellidoPaternoChar[0];
    System.out.print(apellidoPaternoDato);
    
            // Sacar primera Vocal de apellido PATERNO.
            String apellidoPaterno1 = apellidoPaterno.replace("Á", "").replace("É", "").replace("Í", "").replace("Ó", "").replace("Ú", "").replace("B","").replace("C","").replace("D","").replace("F","").replace("G","").replace("H","").replace("J","").replace("K","").replace("L","").replace("M","").replace("N","").replace("Ñ","").replace("P","").replace("Q","").replace("R","").replace("S","").replace("T","").replace("V","").replace("W","").replace("X","").replace("Y","").replace("Z","");
            char [] vocal  = apellidoPaterno1.toCharArray();
            char apellidoPaternoVocal = vocal[0];
    System.out.print(apellidoPaternoVocal);
          //----------------------------------------------------------------------
            // Sacar letra apellido "Materno".
            String apellidoMaternoDato="";
            if (apellidosDatoLength <= 1){
               apellidoMaternoDato = "X"; 
    System.out.print(apellidoMaternoDato);
            }else{
            char[] apellidoMaternoChar = apellidoMaterno.toCharArray();
            char apellidoMaternoDato1 = apellidoMaternoChar[0];
            apellidoMaternoDato = String.valueOf(apellidoMaternoDato1);
    System.out.print(apellidoMaternoDato);
            }
            
            
            // Sacar El nombre.
            String nombreDato="";
            if(nombre.startsWith("JOSÉ")){
                char[] nombreChar = nombre.toCharArray();
                char nombreDato1 = nombreChar[4];
                nombreDato= String.valueOf(nombreDato1);
            }else if(nombre.startsWith("MARÍA")){
                char[] nombreChar = nombre.toCharArray();
                char nombreDato1 = nombreChar[5];
                nombreDato= String.valueOf(nombreDato1);
            }else{
                char[] nombreChar = nombre.toCharArray();
                char nombreDato1 = nombreChar[0]; 
                nombreDato= String.valueOf(nombreDato1);
            }
            
    System.out.print(nombreDato);
            
            // Sacar año y los 2 ultimos digitos (19"97"). AGREGAR FUNCION QUE SOLO ADMITA 4 CARACTERES Y QUE NO ADMITA LETRAS.
            char[] AnioChar = String.valueOf(fechaAnnio).toCharArray();
            String anioDato = AnioChar[2] + "" + AnioChar[3];
    System.out.print(anioDato);
    
            // Imprimir mes. AGREGAR LIMITE POR SI EL MAESTRO PONE MAS DE 12 Y QUE NO ADMITA LETRAS.
            String meses="";
            if(mes > 12 || mes < 1){
                JOptionPane.showMessageDialog(null, "Error al introducir numero Valido MES.","Error", JOptionPane.ERROR_MESSAGE);
                numeroError=1;
            }
        if(mes<10){
            meses="0"+String.valueOf(mes);
        }else{
            meses=String.valueOf(mes);
        }
    System.out.print(meses);
             
            // Imprimir dia. AGREGAR LIMITE POR SI EL MAESTRO PONE MAS DE 31 Y QUE NO ADMITA LETRAS.
            String dias="";
            if(dia > 31 || dia < 1){
                JOptionPane.showMessageDialog(null, "Error al introducir numero Valido DIA.","Error", JOptionPane.ERROR_MESSAGE);
                numeroError=1;
            }
        if(dia<10){
            dias="0"+String.valueOf(dia);
        }else{
            dias=String.valueOf(dia);
        }
    System.out.print(dias);

            // Sacar Genero M O H.
              String genero="";
              if("Mujer".equals(sexo.getSelectedItem())){
                  genero = "M";
              }else if("Hombre".equals(sexo.getSelectedItem())){
                  genero = "H";
              }else{
                  
                  JOptionPane.showMessageDialog(null, "Te falto llenar el genero","Error", JOptionPane.ERROR_MESSAGE);
                  numeroError=1;
              }
    System.out.print(genero);
    
    //
        String clave="";
        
           if ("Aguascalientes".equals(entidadNacimiento.getSelectedItem())){
               clave="AS";
           }else if ("Baja California".equals(entidadNacimiento.getSelectedItem())){	
               clave="BC";
           }else if("Baja California Sur".equals(entidadNacimiento.getSelectedItem())){
               clave="BS";
           }else if ("Campeche".equals(entidadNacimiento.getSelectedItem())){
               clave=	"CC";
           }else if("Coahuila de Zaragoza".equals(entidadNacimiento.getSelectedItem())){
               clave=	"CL";
           }else if("Colima".equals(entidadNacimiento.getSelectedItem())){
               clave=	"CM";
           }else if("Chiapas".equals(entidadNacimiento.getSelectedItem())){
               clave=	"CS";
           }else if("Chihuahua".equals(entidadNacimiento.getSelectedItem())){
               clave=	"CH";
           }else if("Distrito Federal".equals(entidadNacimiento.getSelectedItem())){
               clave=	"DF";
           }else if("Durango".equals(entidadNacimiento.getSelectedItem())){
               clave=	"DG";
           }else if("Guanajuato".equals(entidadNacimiento.getSelectedItem())){
               clave=	"GT";
           }else if("Guerrero".equals(entidadNacimiento.getSelectedItem())){
               clave=	"GR";
           }else if("Hidalgo".equals(entidadNacimiento.getSelectedItem())){
               clave=	"HG";
           }else if("Jalisco".equals(entidadNacimiento.getSelectedItem())){
               clave=	"JC";
           }else if("México".equals(entidadNacimiento.getSelectedItem())){
               clave=	"MC";
           }else if("Michoacán de Ocampo".equals(entidadNacimiento.getSelectedItem())){
               clave=	"MN";
           }else if ("Morelos".equals(entidadNacimiento.getSelectedItem())){
               clave=	"MS";
           }else if("Nayarit".equals(entidadNacimiento.getSelectedItem())){
               clave=	"NT";
           }else if("Nuevo León".equals(entidadNacimiento.getSelectedItem())){
               clave=	"NL";
           }else if("Oaxaca".equals(entidadNacimiento.getSelectedItem())){
               clave=	"OC";
           }else if("Puebla".equals(entidadNacimiento.getSelectedItem())){
               clave=	"PL";
           }else if("Querétaro".equals(entidadNacimiento.getSelectedItem())){
               clave=	"QT";
           }else if("Quintana Roo".equals(entidadNacimiento.getSelectedItem())){
               clave=	"QR";
           }else if("San Luis Potosí".equals(entidadNacimiento.getSelectedItem())){
               clave=	"SP";
           }else if("Sinaloa".equals(entidadNacimiento.getSelectedItem())){
               clave=	"SL";
           }else if("Sonora".equals(entidadNacimiento.getSelectedItem())){
               clave=	"SR";
           }else if("Tabasco".equals(entidadNacimiento.getSelectedItem())){
               clave=	"TC";
           }else if("Tamaulipas".equals(entidadNacimiento.getSelectedItem())){
               clave=	"TS";
           }else if("Tlaxcala".equals(entidadNacimiento.getSelectedItem())){
               clave=	"TL";
           }else if("Veracruz de Ignacio de la Llave".equals(entidadNacimiento.getSelectedItem())){
               clave=	"VZ";
           }else if("Yucatán".equals(entidadNacimiento.getSelectedItem())){
               clave=	"YN";
           }else if("Zacatecas".equals(entidadNacimiento.getSelectedItem())){
               clave=	"ZS";
           }else if("Nacido en el Extranjero".equals(entidadNacimiento.getSelectedItem())){
               clave="NE";
           }else {
               JOptionPane.showMessageDialog(null, "Te falto llenar la entidad de nacimiento","Error", JOptionPane.ERROR_MESSAGE);
               
           }
           
           System.out.print(clave);
            
            //Sacar Primera consonante interna (no inicial) del primer apellido.
            String apellidoPaternoConsonante = apellidoPaterno.replace("Á", "").replace("É", "").replace("Í", "").replace("Ó", "").replace("Ú", "").replace("A", "").replace("E", "").replace("I", "").replace("O", "").replace("U", "");
            char [] apellidoPaternoConsonanteChar = apellidoPaternoConsonante.toCharArray();
            char   apellidoPaternoConsonanteDato = apellidoPaternoConsonanteChar[1];
    System.out.print(apellidoPaternoConsonanteDato);
    
            //Sacar Primera consonante interna (no inicial) del segundo apellido. En caso de no tener segundo apellido, se colocará X.
            String apellidoMaternoConsonante = apellidoMaterno.replace("A", "").replace("E", "").replace("I", "").replace("O", "").replace("U", "").replace("Á", "").replace("É", "").replace("Í", "").replace("Ó", "").replace("Ú", "");
            String apellidoMaternoConsonanteDato="";
            if (apellidosDatoLength <= 1){
                       apellidoMaternoConsonanteDato = "X"; 
    System.out.print(apellidoMaternoConsonanteDato);
                    }else{
                    char [] apellidoMaternoConsonanteChar = apellidoMaternoConsonante.toCharArray();
                    char apellidoMaternoConsonanteDato1 = apellidoMaternoConsonanteChar[1];
                    apellidoMaternoConsonanteDato = String.valueOf(apellidoMaternoConsonanteDato1);
    System.out.print(apellidoMaternoConsonanteDato);
            }
   
            //Sacar Primera consonante interna (no inicial) del nombre.
            String NombreConsonante = nombre.replace("Á", "").replace("É", "").replace("Í", "").replace("Ó", "").replace("Ú", "").replace("A", "").replace("E", "").replace("I", "").replace("O", "").replace("U", "");
            char [] NombreConsonanteChar = NombreConsonante.toCharArray();
            char NombreConsonanteDato = NombreConsonanteChar[1];
    System.out.print(NombreConsonanteDato);
 
            // Sacar penultimo Digito.
            int annio = fechaAnnio;
                String digito;
                if(annio<2000){
                    digito="0";
                }else{
                    digito = "A";
                }
    System.out.print(digito);
    
            //Sacar ultimo dato que es un 1.
            String ultimoDato = "1";
    System.out.print(ultimoDato);

    if(numeroError==1){
        curp= mensajeError;
    }else
        curp = apellidoPaternoDato+""+apellidoPaternoVocal+ apellidoMaternoDato +nombreDato+""+anioDato+""+meses+""+dias+""+genero+""+clave+""+apellidoPaternoConsonanteDato+apellidoMaternoConsonanteDato +NombreConsonanteDato+""+digito+""+ultimoDato;
        return curp;
    
    
    }

}
