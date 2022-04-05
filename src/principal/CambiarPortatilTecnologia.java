package principal;

public interface CambiarPortatilTecnologia {


    /**
     * Método que sera desarrollado en las clases que implementen la interfaz
     * @param portatil Es un objeto de la clase Portatil
     * Precondición: El objeto portátil deberá ser creado previamente
     */
 public default void cambiarPortatil(Portatil portatil){}

    /**
     * Método que sera desarrollado en las clases que implementen la interfaz
     * @param tecnologia Es un parámetro que cogeremos del enum Tecnologia
     */
    public default void cambiarTecnologia(Tecnologia tecnologia){}
}
