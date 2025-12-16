
public class SVentas {

    public float sistema(String origen, String destino, int pasajeros) {
        float precioRuta = 0.0f;

        if (origen.equals("Darién") && destino.equals("Bocas del Toro")) { 
            precioRuta = 38.00f; 
        }
        if (origen.equals("Darién") && destino.equals("Chiriquí")) { 
            precioRuta = 30.00f; 
        }
        if (origen.equals("Darién") && destino.equals("Panamá Oeste")) { 
            precioRuta = 16.00f; 
        }
        if (origen.equals("Darién") && destino.equals("Herrera")) { 
            precioRuta = 24.00f; 
        }
        if (origen.equals("Darién") && destino.equals("Los Santos")) { 
            precioRuta = 26.00f; 
        }
        if (origen.equals("Darién") && destino.equals("Colón")) { 
            precioRuta = 18.00f; 
        }
        if (origen.equals("Darién") && destino.equals("Veraguas")) { 
            precioRuta = 22.00f; 
        }
        if (origen.equals("Darién") && destino.equals("Coclé")) { 
            precioRuta = 20.00f;
        }
        if (origen.equals("Darién") && destino.equals("Panamá")) { 
            precioRuta = 14.00f; 
        }

        
        if (origen.equals("Bocas del Toro") && destino.equals("Darién")) { 
            precioRuta = 38.00f; 
        }
        if (origen.equals("Bocas del Toro") && destino.equals("Chiriquí")) { 
            precioRuta = 12.00f;
        }
        if (origen.equals("Bocas del Toro") && destino.equals("Panamá Oeste")) { 
            precioRuta = 30.00f; 
        }
        if (origen.equals("Bocas del Toro") && destino.equals("Herrera")) { 
            precioRuta = 35.00f; 
        }
        if (origen.equals("Bocas del Toro") && destino.equals("Los Santos")) { 
            precioRuta = 36.00f; 
        }
        if (origen.equals("Bocas del Toro") && destino.equals("Colón")) { 
            precioRuta = 32.00f; 
        }
        if (origen.equals("Bocas del Toro") && destino.equals("Veraguas")) { 
            precioRuta = 33.00f; 
        }
        if (origen.equals("Bocas del Toro") && destino.equals("Coclé")) { 
            precioRuta = 31.00f; 
        }
        if (origen.equals("Bocas del Toro") && destino.equals("Panamá")) { 
            precioRuta = 28.00f; 
        }

        
        if (origen.equals("Chiriquí") && destino.equals("Darién")) { 
            precioRuta = 30.00f; 
        }
        if (origen.equals("Chiriquí") && destino.equals("Bocas del Toro")) { 
            precioRuta = 12.00f; 
        }
        if (origen.equals("Chiriquí") && destino.equals("Panamá Oeste")) { 
            precioRuta = 20.00f; 
        }
        if (origen.equals("Chiriquí") && destino.equals("Herrera")) { 
            precioRuta = 24.00f; 
        }
        if (origen.equals("Chiriquí") && destino.equals("Los Santos")) { 
            precioRuta = 26.00f; 
        }
        if (origen.equals("Chiriquí") && destino.equals("Colón")) { 
            precioRuta = 22.00f; 
        }
        if (origen.equals("Chiriquí") && destino.equals("Veraguas")) { 
            precioRuta = 18.00f; 
        }
        if (origen.equals("Chiriquí") && destino.equals("Coclé")) { 
            precioRuta = 22.00f; 
        }
        if (origen.equals("Chiriquí") && destino.equals("Panamá")) { 
            precioRuta = 18.00f; 
        }

    
        if (origen.equals("Panamá Oeste") && destino.equals("Darién")) { 
            precioRuta = 16.00f; 
        }
        if (origen.equals("Panamá Oeste") && destino.equals("Bocas del Toro")) { 
            precioRuta = 30.00f; 
        }
        if (origen.equals("Panamá Oeste") && destino.equals("Chiriquí")) { 
            precioRuta = 20.00f; 
        }
        if (origen.equals("Panamá Oeste") && destino.equals("Herrera")) { 
            precioRuta = 13.00f; 
        }
        if (origen.equals("Panamá Oeste") && destino.equals("Los Santos")) { 
            precioRuta = 14.00f; 
        }
        if (origen.equals("Panamá Oeste") && destino.equals("Colón")) { 
            precioRuta = 6.00f; 
        }
        if (origen.equals("Panamá Oeste") && destino.equals("Veraguas")) { 
            precioRuta = 12.00f; 
        }
        if (origen.equals("Panamá Oeste") && destino.equals("Coclé")) { 
            precioRuta = 8.00f; 
        }
        if (origen.equals("Panamá Oeste") && destino.equals("Panamá")) { 
            precioRuta = 2.50f; 
        }

        
        if (origen.equals("Herrera") && destino.equals("Darién")) { 
            precioRuta = 24.00f; 
        }
        if (origen.equals("Herrera") && destino.equals("Bocas del Toro")) { 
            precioRuta = 35.00f; 
        }
        if (origen.equals("Herrera") && destino.equals("Chiriquí")) { 
            precioRuta = 24.00f; 
        }
        if (origen.equals("Herrera") && destino.equals("Panamá Oeste")) { 
            precioRuta = 13.00f; 
        }
        if (origen.equals("Herrera") && destino.equals("Los Santos")) { 
            precioRuta = 3.00f; 
        }
        if (origen.equals("Herrera") && destino.equals("Colón")) { 
            precioRuta = 15.00f; 
        }
        if (origen.equals("Herrera") && destino.equals("Veraguas")) { 
            precioRuta = 8.00f; 
        }
        if (origen.equals("Herrera") && destino.equals("Coclé")) { 
            precioRuta = 6.00f; 
        }
        if (origen.equals("Herrera") && destino.equals("Panamá")) { 
            precioRuta = 11.50f; 
        }

        
        if (origen.equals("Los Santos") && destino.equals("Darién")) { 
            precioRuta = 26.00f; 
        }
        if (origen.equals("Los Santos") && destino.equals("Bocas del Toro")) { 
            precioRuta = 36.00f; 
        }
        if (origen.equals("Los Santos") && destino.equals("Chiriquí")) { 
            precioRuta = 26.00f; 
        }
        if (origen.equals("Los Santos") && destino.equals("Panamá Oeste")) { 
            precioRuta = 14.00f; 
        }
        if (origen.equals("Los Santos") && destino.equals("Herrera")) { 
            precioRuta = 3.00f; 
        }
        if (origen.equals("Los Santos") && destino.equals("Colón")) { 
            precioRuta = 16.00f; 
        }
        if (origen.equals("Los Santos") && destino.equals("Veraguas")) { 
            precioRuta = 10.00f; 
        }
        if (origen.equals("Los Santos") && destino.equals("Coclé")) { 
            precioRuta = 8.00f; 
        }
        if (origen.equals("Los Santos") && destino.equals("Panamá")) { 
            precioRuta = 12.50f; 
        }

        
        if (origen.equals("Colón") && destino.equals("Darién")) { 
            precioRuta = 18.00f; 
        }
        if (origen.equals("Colón") && destino.equals("Bocas del Toro")) { 
            precioRuta = 32.00f; 
        }
        if (origen.equals("Colón") && destino.equals("Chiriquí")) { 
            precioRuta = 22.00f; 
        }
        if (origen.equals("Colón") && destino.equals("Panamá Oeste")) { 
            precioRuta = 6.00f; 
        }
        if (origen.equals("Colón") && destino.equals("Herrera")) { 
            precioRuta = 15.00f; 
        }
        if (origen.equals("Colón") && destino.equals("Los Santos")) { 
            precioRuta = 16.00f; 
        }
        if (origen.equals("Colón") && destino.equals("Veraguas")) { 
            precioRuta = 14.00f; 
        }
        if (origen.equals("Colón") && destino.equals("Coclé")) { 
            precioRuta = 10.00f; 
        }
        if (origen.equals("Colón") && destino.equals("Panamá")) { 
            precioRuta = 4.25f; 
        }

        
        if (origen.equals("Veraguas") && destino.equals("Darién")) { 
            precioRuta = 22.00f; 
        }
        if (origen.equals("Veraguas") && destino.equals("Darién")) { 
            precioRuta = 22.00f; 
        }
        if (origen.equals("Veraguas") && destino.equals("Bocas del Toro")) { 
            precioRuta = 33.00f;
        }
        if (origen.equals("Veraguas") && destino.equals("Chiriquí")) { 
            precioRuta = 18.00f; 
        }
        if (origen.equals("Veraguas") && destino.equals("Panamá Oeste")) { 
            precioRuta = 12.00f; 
        }
        if (origen.equals("Veraguas") && destino.equals("Herrera")) { 
            precioRuta = 8.00f; 
        }
        if (origen.equals("Veraguas") && destino.equals("Los Santos")) { 
            precioRuta = 10.00f;
         }
        if (origen.equals("Veraguas") && destino.equals("Colón")) { 
            precioRuta = 14.00f; 
        }
        if (origen.equals("Veraguas") && destino.equals("Coclé")) { 
            precioRuta = 5.00f; 
        }
        if (origen.equals("Veraguas") && destino.equals("Panamá")) { 
            precioRuta = 10.00f; 
        }

        
        if (origen.equals("Coclé") && destino.equals("Darién")) { 
            precioRuta = 20.00f; 
        }
        if (origen.equals("Coclé") && destino.equals("Bocas del Toro")) { 
            precioRuta = 31.00f; 
        }
        if (origen.equals("Coclé") && destino.equals("Chiriquí")) { 
            precioRuta = 22.00f; 
        }
        if (origen.equals("Coclé") && destino.equals("Panamá Oeste")) { 
            precioRuta = 8.00f; 
        }
        if (origen.equals("Coclé") && destino.equals("Herrera")) { 
            precioRuta = 6.00f; 
        }
        if (origen.equals("Coclé") && destino.equals("Los Santos")) { 
            precioRuta = 8.00f; 
        }
        if (origen.equals("Coclé") && destino.equals("Colón")) { 
            precioRuta = 10.00f; 
        }
        if (origen.equals("Coclé") && destino.equals("Veraguas")) { 
            precioRuta = 5.00f; 
        }
        if (origen.equals("Coclé") && destino.equals("Panamá")) { 
            precioRuta = 6.50f; 
        }


        if (origen.equals("Panamá") && destino.equals("Darién")) { 
            precioRuta = 14.00f; 
        }
        if (origen.equals("Panamá") && destino.equals("Bocas del Toro")) { 
            precioRuta = 28.00f; 
        }
        if (origen.equals("Panamá") && destino.equals("Chiriquí")) { 
            precioRuta = 18.00f; 
        }
        if (origen.equals("Panamá") && destino.equals("Panamá Oeste")) { 
            precioRuta = 2.50f; 
        }
        if (origen.equals("Panamá") && destino.equals("Herrera")) { 
            precioRuta = 11.50f; 
        }
        if (origen.equals("Panamá") && destino.equals("Los Santos")) { 
            precioRuta = 12.50f; 
        }
        if (origen.equals("Panamá") && destino.equals("Colón")) { 
            precioRuta = 4.25f; 
        }
        if (origen.equals("Panamá") && destino.equals("Veraguas")) { 
            precioRuta = 10.00f; 
        }
        if (origen.equals("Panamá") && destino.equals("Coclé")) { 
            precioRuta = 6.50f; 
        }


        float precioTotal = precioRuta * pasajeros;

        return precioTotal;
    }
}

