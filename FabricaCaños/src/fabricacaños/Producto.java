/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricacaños;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Producto {
    
    private String descripcion;
    private Material materiales [];

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Material[] getMateriales() {
        return materiales;
    }

    public void setMateriales(Material[] materiales) {
        this.materiales = materiales;
    }

    public Producto(String descripcion, Material[] materiales) {
        this.descripcion = descripcion;
        this.materiales = materiales;
    }
    
    public Producto(int dimension)
    {
        descripcion = "";
        materiales =  new Material [dimension];
    }

    @Override
    public String toString() {
        return "Producto{" + "descripcion=" + descripcion + ", materiales=" + materiales + '}';
    }
    
    public void agregarMaterial(Material nuevoMaterial)
    {
        for (int i = 0; i < materiales.length; i++) {
            materiales [i] = nuevoMaterial;
        }
        
        /*Scanner sc = new Scanner(System.in);
        for (int i = 0; i < materiales.length; i++) {
            
            System.out.println("Ingrese descripcion: ");
            sc.nextLine();
            String descripcion = sc.nextLine();
            
            System.out.println("Ingrese codigo: ");
            int codigo = sc.nextInt();
            
            System.out.println("Ingrese valor unitario: ");
            float valorUnitario = sc.nextFloat();
            
            materiales [i] = new Material(descripcion,codigo,valorUnitario);*/
        }
    
    public float costoTotal()
    {
        float acu=0;
        for (int i = 0; i < materiales.length; i++) {
            acu+=materiales[i].getValorUnitario();
        }
        
        return acu;
    }
    
    public boolean formaParte (int codigo)
    {
        boolean variable=false;
        for (int i = 0; i < materiales.length; i++) {
            if (codigo == materiales[i].getCodigo()) {
                variable = true;                
            }
        }
        return variable;
    }
    
    public Material[] materialesMenor(float valor)
    {
        int cont=0;
        int cont2=0;
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i].getValorUnitario()<valor) {
                cont++;
            }
        }
        
       Material materiales2[] = new Material[cont];
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i].getValorUnitario()<valor)
            {
                materiales2[cont2]=materiales[i];
                cont2++;
            }
        }
            
      return materiales2;  
    }
    
    public int[] materialesPorPrecio()
    {
        int porPrecio[]= new int[3];
        
        for (int i = 0; i < materiales.length; i++) {
            
            if (materiales[i].getValorUnitario()<= 10) {
                porPrecio[0]++;
            }
            else if (materiales[i].getValorUnitario()> 10 && materiales[i].getValorUnitario()<= 20 ) {
                porPrecio[1]++;
            }
            else if (materiales[i].getValorUnitario()> 20 && materiales[i].getValorUnitario()<= 30 ) {
                porPrecio[2]++;
            }
            else
            {
                porPrecio[3]++;
            }
        }
        return porPrecio;
    }
}
