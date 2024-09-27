public class Metodosdeordenamiento {
    

    public int[] sortBySelleccion(int[]arreglo) {
        int tamanio = arreglo.length;

        //Recorr el areglo
        for(int i = 0; i < tamanio ; i++){

            int indice = i;
            for (int j =i+1 ; j < tamanio; j++){
                if(arreglo[j] > arreglo[indice]){
                    indice =j;
                    
                }
            }  
            
            //intercambio del indice encontrado
            //por el primero
            int aux = arreglo[indice];
            arreglo[indice] = arreglo[i];
            arreglo[i] =aux;
        }
        return arreglo;

    
    }
    // un metodo para imprimir
    public void imprimit ( int[]arreglo ){
        
        for(int element : arreglo){
            System.out.println(" "+element );
            
        }
        
    }
    
}
